package com.rivtrans.base;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.rivtrans.pages.LoginPage;
import static com.rivtrans.utilities.Utility.setWebDriver;

public class BaseTest {
	
	protected WebDriver driver;
	protected BasePage basePage;
	protected LoginPage loginPage;
	//change the url to login page
	private String url ="http://rta.isfpdomain.com/login";
	
	
    public static String getChromeDriverPath() {
    	
        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("chromedriver.path");
    }
    

	@BeforeClass
	public void setUp() {
		
		//options for headless mode to run tests without UI add options as parameter in ChromeDriver() to activate it; 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu");
		//Handling chrome driver
		System.setProperty("webdriver.chrome.driver", getChromeDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		basePage = new BasePage();
		basePage.setDriver(driver); ///link the driver (driver = new ChromeDriver();) to the base page functions tests will inherit this
		setWebDriver(); //link 
		loginPage = new LoginPage();
		
	}
	
	
	@AfterClass
	public void teatDown() {
		driver.quit();
	}
	
	
}
