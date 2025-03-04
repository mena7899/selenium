package com.rivtrans.utilities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility extends Utility {
	
	// explicit wait means if the ExpectedConditions didn't happened during a duration of seconds throw an error
	//Waits for a specific condition before proceeding
	public static void explicitWaitUntilVisible(int seconds, By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));
		// the driver in WebDriverWait is the diver from Utility (drive=BasePage.driver)
		// takes the element By type
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		//this method means if the element didn't appear in a specified amount of time error will happen
	}
	
	
	//implicit wait stops the code execution for a specified amount of time
	public static void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	
	  public static void fluentWaitUntilVisible(int seconds, By locator,int milliseconds) {
		   
			FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(seconds))
		            .pollingEvery(Duration.ofMillis(milliseconds))
		            .ignoring(NoSuchElementException.class,
		                    StaleElementReferenceException.class);
		    fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		  }
}
