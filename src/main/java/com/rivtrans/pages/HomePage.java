package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.JavaScriptUtility;

public class HomePage extends BasePage {
	
	
	//private By logo = By.xpath("/html/body/app-root/app-home-layout/div/div/app-sidebar/div/aside/div[2]/ul/li/a/img[1]");
	private By logo = By.cssSelector("a[href='/home']");

	
	public boolean logoIsDisplayed() {
		
		return find(logo).isDisplayed();
	}
		
	

	 
}
