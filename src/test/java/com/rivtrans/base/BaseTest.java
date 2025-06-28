//package com.rivtrans.base;
//
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Properties;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.io.FileHandler;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeSuite;
//
//import com.rivtrans.pages.LoginPage;
//import static com.rivtrans.utilities.Utility.setWebDriver;
//
//public class BaseTest {
//	
//	protected WebDriver driver;
//	protected BasePage basePage;
//	protected LoginPage loginPage;
//	//change the url to login page
//	private String url ="http://rta.isfpdomain.com/login";
//	
//	
//	public static String getChromeDriverPath() {
//	    Properties properties = new Properties();
//	    String chromePath = null;
//
//	    try {
//	        FileInputStream fis = new FileInputStream("config.properties");
//	        properties.load(fis);
//
//	        String primaryPath = properties.getProperty("chromedriver.path");
//	        File primaryFile = new File(primaryPath);
//
//	        if (primaryFile.exists()) {
//	            chromePath = primaryPath;
//	        } else {
//	            String alternatePath = properties.getProperty("chromedriver.alternatePath");
//	            File alternateFile = new File(alternatePath);
//	            if (alternateFile.exists()) {
//	                chromePath = alternatePath;
//	            } else {
//	                System.err.println("Neither primary nor alternate ChromeDriver paths exist.");
//	            }
//	        }
//
//	    } catch (IOException e) {
//	        e.printStackTrace();
//	    }
//
//	    return chromePath;
//	}
//	
//	public void printTestMethodSteps(ITestResult result) {
//	    try {
//	        String methodName = result.getMethod().getMethodName();
//	        String className = result.getTestClass().getRealClass().getSimpleName();
//	        
//	        // Path to your test class file
//	        String filePath = System.getProperty("user.dir") + "/src/test/java/com/rivtrans/tests/" + className + ".java";
//	        File file = new File(filePath);
//
//	        if (!file.exists()) {
//	            System.out.println("Test class file not found: " + filePath);
//	            return;
//	        }
//
//	        BufferedReader reader = new BufferedReader(new FileReader(file));
//	        String line;
//	        boolean methodFound = false;
//	        
//	        System.out.println("\n==== Test Method Steps ====");
//	        while ((line = reader.readLine()) != null) {
//	            line = line.trim();
//	            if (line.contains("void " + methodName + "(")) {
//	                methodFound = true;
//	            }
//	            if (methodFound) {
//	                System.out.println(line);
//	                if (line.contains("}")) {
//	                    // End of method
//	                    break;
//	                }
//	            }
//	        }
//	        reader.close();
//	        System.out.println("============================\n");
//
//	    } catch (Exception e) {
//	        e.printStackTrace();
//	    }
//	}
//
//	
//    @BeforeSuite
//    public void cleanScreenshotDirectory() {
//        String screenshotDirPath = System.getProperty("user.dir") + "/resources/screenshots";
//        File screenshotDir = new File(screenshotDirPath);
//
//        if (screenshotDir.exists() && screenshotDir.isDirectory()) {
//            File[] files = screenshotDir.listFiles();
//            if (files != null) {
//                for (File file : files) {
//                    if (file.isFile()) {
//                        file.delete();
//                    }
//                }
//                System.out.println("✅ Screenshot directory cleaned.");
//            }
//        } else {
//            System.out.println("⚠ Screenshot directory does not exist: " + screenshotDirPath);
//        }
//    }
//    
//	@BeforeClass
//	public void setUp() {
//		
//		//options for headless mode to run tests without UI add options as parameter in ChromeDriver() to activate it; 
//		ChromeOptions options = new ChromeOptions();
//		
//		
//		
//		
//		
//		//options.addArguments("--headless", "--disable-gpu","--window-size=1280,720");
//		//options.addArguments("--window-size=1280,720");
//		//Handling chrome driver: getting it from the config.properties file
//		System.setProperty("webdriver.chrome.driver", getChromeDriverPath());
//		//add options to chrome driver for headless mode
//		
//        // Check if we are running in CI (Jenkins)
//        boolean isCI = System.getProperty("ci") != null || System.getenv("JENKINS_HOME") != null;
//        if (isCI) {
//            System.out.println("Running in CI environment. Launching browser in headless mode.");
//            String chromeArgs = System.getProperty("chrome.options", "--headless,--disable-gpu,--window-size=1280,720");
//            for (String arg : chromeArgs.split(",")) {
//                options.addArguments(arg.trim());
//            }
//            //options.addArguments("--disable-save-password-bubble");
//            driver = new ChromeDriver(options);
//        } else {
//            System.out.println("Running locally. Launching browser in normal mode.");
//            driver = new ChromeDriver(); // No options
//        }
//		
//		//driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
//		basePage = new BasePage();
//		basePage.setDriver(driver); ///link the driver (driver = new ChromeDriver();) to the base page functions tests will inherit this
//		setWebDriver(); //initiate this method to link the basepage driver to utility driver
//		loginPage = new LoginPage();
//		
//	}
//	
//	@AfterMethod
//	public void takeFailedResultScreenshot(ITestResult testResult)  {
//	    if (ITestResult.FAILURE == testResult.getStatus()) {
//	    
//				
//		
//	        TakesScreenshot screenshot = (TakesScreenshot) driver;
//	        File source = screenshot.getScreenshotAs(OutputType.FILE);
//
//	        String screenshotDirPath = System.getProperty("user.dir") + "/resources/screenshots";
//	        File screenshotDir = new File(screenshotDirPath);
//
//	        // Create directory if it doesn't exist
//	        if (!screenshotDir.exists()) {
//	            screenshotDir.mkdirs();
//	        }
//
//	        String timestamp = java.time.LocalDateTime.now().toString().replace(":", "-");
//	        File destination = new File(screenshotDirPath + "/(" + timestamp + ") " + testResult.getName() + ".png");
//
//	        try {
//	            FileHandler.copy(source, destination);
//	        } catch (IOException e) {
//	            throw new RuntimeException(e);
//	        }
//	        System.out.println("Screenshot Located At " + destination);
//	        printTestMethodSteps(testResult);
//	    }
//	    
//	    
//	}
//	
//	
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
//	
//	
//}
package com.rivtrans.base;

import java.io.*;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.rivtrans.pages.LoginPage;
import com.rivtrans.utilities.EmailHelper;

import static com.rivtrans.utilities.Utility.setWebDriver;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private String url = "http://rta.isfpdomain.com/login";

    public static String getChromeDriverPath() {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
            String primaryPath = properties.getProperty("chromedriver.path");
            if (new File(primaryPath).exists()) return primaryPath;
            String alternatePath = properties.getProperty("chromedriver.alternatePath");
            if (new File(alternatePath).exists()) return alternatePath;
            System.err.println("Neither primary nor alternate ChromeDriver paths exist.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    public static String generateRandomEnglishCapitalCharacters(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char letter = (char) ('A' + random.nextInt(26));
            sb.append(letter);
        }

        return sb.toString();
    }
    
    public static String generateRandomArabicLetters(int length) {
        Random random = new Random();
        String arabicLetters = "ابتثجحخدذرزسشصضطظعغفقكلمنهو"; // Arabic alphabet without diacritics or tatweel
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char letter = arabicLetters.charAt(random.nextInt(arabicLetters.length()));
            sb.append(letter);
        }

        return sb.toString();
    }

    private void sendFailureEmail(String testName, File screenshot, String steps) {
        EmailHelper.sendFailureEmail(testName, screenshot, steps);
    }

    
    public static String generateRandomEnglishNumbers(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char digit = (char) ('0' + random.nextInt(10));
            sb.append(digit);
        }

        return sb.toString();
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
        ChromeOptions options = new ChromeOptions();
        boolean isCI = System.getProperty("ci") != null || System.getenv("JENKINS_HOME") != null;
        if (isCI) {
            System.out.println( this.getClass().getSimpleName()+ "Running in CI environment. Launching browser in headless mode.");
//            String chromeArgs = System.getProperty("chrome.options", "--headless,--disable-gpu,--window-size=1280,720");
//            Arrays.stream(chromeArgs.split(",")).forEach(arg -> options.addArguments(arg.trim()));
//            driver = new ChromeDriver(options);

            
            options.addArguments("--headless=new");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1280,720");
            options.addArguments("--remote-allow-origins=*"); //open links from any origin(protocol-domain-port )
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");//use disk instead of shared ram it might be to small in CI/CD
            driver = new ChromeDriver(options);
        } else {
            System.out.println("Running locally. Launching browser in normal mode.");
            driver = new ChromeDriver();
        }

        System.setProperty("webdriver.chrome.driver", getChromeDriverPath());
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setWebDriver();
        loginPage = new LoginPage();
    }

    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult result) {
    	boolean isCI = System.getProperty("ci") != null || System.getenv("JENKINS_HOME") != null;
    	boolean sendEmail= true;
        if (ITestResult.FAILURE == result.getStatus()) {
            captureScreenshot(result);
            String steps = getFailureSteps(result);  // Capture the formatted steps
            
            if (isCI && sendEmail==true) {
                // ONLY send email if running in CI/CD
            	sendFailureEmail(result.getName(), new File(System.getProperty("user.dir") + "/resources/screenshots/" + result.getName() + ".png"), steps);
            } else {
                System.out.println("Test failed locally, email will NOT be sent.");
            }
            
        }
    }

    private void captureScreenshot(ITestResult result) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenshotDir = new File(System.getProperty("user.dir") + "/resources/screenshots");

        // Ensure the directory exists
        if (!screenshotDir.exists()) {
            if (screenshotDir.mkdirs()) {
                System.out.println("Created screenshot directory: " + screenshotDir.getAbsolutePath());
            }
        }

        // Use only the test name as the screenshot name
        File destination = new File(screenshotDir + "/" + result.getName() + ".png");

        try {
            FileHandler.copy(screenshot, destination);
            System.out.println("Screenshot saved at: " + destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getFailureSteps(ITestResult result) {
        String className = result.getTestClass().getName();
        String currentMethodName = result.getMethod().getMethodName();
        int failedLineNumber = result.getThrowable().getStackTrace()[0].getLineNumber();
        List<String> executionFlow = new ArrayList<>();

        try {
            Class<?> testClass = Class.forName(className);
            buildExecutionFlow(testClass, executionFlow); // Capture all methods' execution flow
            String filePath = System.getProperty("user.dir") + "/src/test/java/" + className.replace('.', '/') + ".java";
            List<String> fileContent = Files.readAllLines(new File(filePath).toPath());

            StringBuilder steps = new StringBuilder("\n========= Steps Until Failure =========\n");
            boolean isFailureCaptured = false;
            for (String methodName : executionFlow) {
                steps.append("▶ ").append(methodName).append("\n");
                printMethodSteps(fileContent, methodName, !isFailureCaptured, failedLineNumber, steps);
                if (methodName.equals(currentMethodName)) {
                    isFailureCaptured = true;  // After the failure point, capture the failure details
                    break;
                }
            }
            steps.append("========================================\n");

            return steps.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private void buildExecutionFlow(Class<?> testClass, List<String> executionFlow) {
        Method[] methods = testClass.getDeclaredMethods();

        // First, filter only @Test annotated methods
        List<Method> testMethods = new ArrayList<>();
        for (Method method : methods) {
            if (method.isAnnotationPresent(org.testng.annotations.Test.class)) {
                testMethods.add(method);
            }
        }

        // Sort them by @Test(priority) if available
        testMethods.sort(Comparator.comparingInt(m -> m.getAnnotation(org.testng.annotations.Test.class).priority()));

        for (Method method : testMethods) {
            executionFlow.add(method.getName());
        }
    }


    private void printMethodSteps(List<String> fileContent, String methodName, boolean captureSteps, int failedLineNumber, StringBuilder steps) {
        boolean insideMethod = false;
        int bracketBalance = 0;

        for (int i = 0; i < fileContent.size(); i++) {
            String line = fileContent.get(i).trim();

            if (!insideMethod && line.contains("void " + methodName + "(")) {
                insideMethod = true;
                bracketBalance++;
                steps.append("▶ ").append(line).append("\n");
                continue;
            }

            if (insideMethod && captureSteps) {
                steps.append(line).append("\n");

                if (line.contains("{")) bracketBalance++;
                if (line.contains("}")) bracketBalance--;

                // Stop capturing after the failure point
                if ((i + 1) >= failedLineNumber) {
                    steps.append("❌ Failure happened around here...\n");
                    break;
                }

                if (bracketBalance == 0) {
                    break; // End of method
                }
            }
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        //BasePage2.quitDriver();
    }
}
