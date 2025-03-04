package com.rivtrans.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.rivtrans.pages.LoginPage;

public class BaseTest {
	
	protected WebDriver driver;
	protected BasePage basePage;
	protected LoginPage loginPage;
	private String url ="file:///C:/Users/melias/Desktop/Login.html";
	

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\melias\\Desktop\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		basePage = new BasePage();
		basePage.setDriver(driver); ///link the driver from line 20 to the base page functions tests will inherit this
		loginPage = new LoginPage();
		
	}
	
	
	@AfterClass
	public void teatDown() {
		driver.quit();
	}
	
	
}
