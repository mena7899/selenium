package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.WaitUtility;

public class HomePage extends BasePage {
	
	//SidePanel sidePanel = new SidePanel();
	private By logo = By.xpath("/html/body/app-root/app-home-layout/div/div/app-sidebar/div/aside/div[2]/ul/li/a/img[1]");
	
	
	public boolean logoIsDisplayed() {
		//WaitUtility.explicitWaitUntilVisible(5, logo);
		return find(logo).isDisplayed();
	}
		
	
		public CountriesPage justOpen()  {
			sidePanel.clickCountriesButton();
			return new CountriesPage();
	}
	 
}
