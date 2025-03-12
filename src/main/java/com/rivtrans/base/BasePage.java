package com.rivtrans.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.rivtrans.pages.SidePanel;
public class BasePage {
	//static to share it across all instances
	public static WebDriver driver;
	//static to share it across all instances and to call it's methods across all classes(pages) with out instance
	public static SidePanel sidePanel = new SidePanel();
	
	//set driver to use it across all classes
	public void setDriver(WebDriver driver) {
	
		BasePage.driver=driver;
	}
	
	//to use it in the click method and set method
	protected WebElement find(By locator) {
		return driver.findElement(locator);
		
	}
	
	//to click on the element take locator By data type
	protected void click(By locator) {
		find(locator).click();
	}
	
	//to set text on element take locator By data type and text String data type
	protected void set(By locator,String text) {
		find(locator).clear();
		find(locator).sendKeys(text);
	}
	
}
