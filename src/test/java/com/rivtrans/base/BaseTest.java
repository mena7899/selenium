package com.rivtrans.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

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
	    String chromePath = null;

	    try {
	        FileInputStream fis = new FileInputStream("config.properties");
	        properties.load(fis);

	        String primaryPath = properties.getProperty("chromedriver.path");
	        File primaryFile = new File(primaryPath);

	        if (primaryFile.exists()) {
	            chromePath = primaryPath;
	        } else {
	            String alternatePath = properties.getProperty("chromedriver.alternatePath");
	            File alternateFile = new File(alternatePath);
	            if (alternateFile.exists()) {
	                chromePath = alternatePath;
	            } else {
	                System.err.println("Neither primary nor alternate ChromeDriver paths exist.");
	            }
	        }

	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return chromePath;
	}
	
	
	
    @BeforeSuite
    public void cleanScreenshotDirectory() {
        String screenshotDirPath = System.getProperty("user.dir") + "/resources/screenshots";
        File screenshotDir = new File(screenshotDirPath);

        if (screenshotDir.exists() && screenshotDir.isDirectory()) {
            File[] files = screenshotDir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        file.delete();
                    }
                }
                System.out.println("✅ Screenshot directory cleaned.");
            }
        } else {
            System.out.println("⚠ Screenshot directory does not exist: " + screenshotDirPath);
        }
    }
    
	@BeforeClass
	public void setUp() {
		
		//options for headless mode to run tests without UI add options as parameter in ChromeDriver() to activate it; 
		ChromeOptions options = new ChromeOptions();
		
		
		
		
		
		//options.addArguments("--headless", "--disable-gpu","--window-size=1280,720");
		//options.addArguments("--window-size=1280,720");
		//Handling chrome driver: getting it from the config.properties file
		System.setProperty("webdriver.chrome.driver", getChromeDriverPath());
		//add options to chrome driver for headless mode
		
        // Check if we are running in CI (Jenkins)
        boolean isCI = System.getProperty("ci") != null || System.getenv("JENKINS_HOME") != null;
        if (isCI) {
            System.out.println("Running in CI environment. Launching browser in headless mode.");
            String chromeArgs = System.getProperty("chrome.options", "--headless,--disable-gpu,--window-size=1280,720");
            for (String arg : chromeArgs.split(",")) {
                options.addArguments(arg.trim());
            }
            //options.addArguments("--disable-save-password-bubble");
            driver = new ChromeDriver(options);
        } else {
            System.out.println("Running locally. Launching browser in normal mode.");
            driver = new ChromeDriver(); // No options
        }
		
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		basePage = new BasePage();
		basePage.setDriver(driver); ///link the driver (driver = new ChromeDriver();) to the base page functions tests will inherit this
		setWebDriver(); //initiate this method to link the basepage driver to utility driver
		loginPage = new LoginPage();
		
	}
	
	@AfterMethod
	public void takeFailedResultScreenshot(ITestResult testResult)  {
	    if (ITestResult.FAILURE == testResult.getStatus()) {
	    
				
		
	        TakesScreenshot screenshot = (TakesScreenshot) driver;
	        File source = screenshot.getScreenshotAs(OutputType.FILE);

	        String screenshotDirPath = System.getProperty("user.dir") + "/resources/screenshots";
	        File screenshotDir = new File(screenshotDirPath);

	        // Create directory if it doesn't exist
	        if (!screenshotDir.exists()) {
	            screenshotDir.mkdirs();
	        }

	        String timestamp = java.time.LocalDateTime.now().toString().replace(":", "-");
	        File destination = new File(screenshotDirPath + "/(" + timestamp + ") " + testResult.getName() + ".png");

	        try {
	            FileHandler.copy(source, destination);
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	        System.out.println("Screenshot Located At " + destination);
	    }
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
}
