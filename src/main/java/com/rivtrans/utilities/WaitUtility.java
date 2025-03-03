package com.rivtrans.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility extends Utility {
	
	// explicit wait means if the ExpectedConditions didn't happened during a duration of seconds throw an error
	//Waits for a specific condition before proceeding
	public static void explicitWait(int seconds, By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));
		// the driver in WebDriverWait is the diver from Utility (drive=BasePage.driver)
		
		// takes the element By type
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		//this method means if the element didn't appear in a specified amount of time error will happen
	}

}
