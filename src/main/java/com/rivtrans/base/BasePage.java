package com.rivtrans.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.rivtrans.utilities.WaitUtility;
import com.rivtrans.utilities.JavaScriptUtility;

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
		
		WaitUtility.fluentWaitUntilVisible(5, locator, 500);
		JavaScriptUtility.scrollToElementJS(locator);
		return driver.findElement(locator);
		
	}
	
	
	protected List<WebElement> findList(By locator) {
		
		WaitUtility.fluentWaitUntilVisible(5, locator, 500);
		JavaScriptUtility.scrollToElementJS(locator);
		return driver.findElements(locator);
		
	}
	
	
	//to click on the element take locator By data type
	protected void click(By locator) {
		find(locator).click();
	}
	
	
	//to click on the element take locator By data type
	protected void clickOfList(By locator,int order) {
		List<WebElement> list = findList(locator);
		 list.get(order).click();
	}
	
	//to set text on element take locator By data type and text String data type
	protected void set(By locator,String text) {
		find(locator).clear();
		find(locator).sendKeys(text);
	}
	
}
