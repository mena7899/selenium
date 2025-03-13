package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.WaitUtility;

public class SidePanel extends BasePage {
	
	private By licenses_button_h1 = By.xpath("//*[@id=\"sidebarnav\"]/li/a/span");
	private By main_data_h2 = By.xpath("//*[@id=\"sidebarnav\"]/li/ul");
	private By countries_button_h3 = By.xpath("//*[@id=\"sidebarnav\"]/li/ul/li/ul/li[1]/a");
	private By cities_button_h3 = By.xpath("//*[@id=\"sidebarnav\"]/li/ul/li/ul/li[2]/a");
	private By motor_state_button_h3 = By.xpath("//*[@id=\"sidebarnav\"]/li/ul/li/ul/li[3]/a");
	
	
//	public void clickCountriesButton() throws InterruptedException {
//		WaitUtility.fluentWaitUntilVisible(6, licenses_button_h1, 2);
//		click(licenses_button_h1);
//		WaitUtility.fluentWaitUntilVisible(6, main_data_h2, 2);
//		click(main_data_h2);
//		WaitUtility.fluentWaitUntilVisible(6, countries_button_h3, 2);
//		click(countries_button_h3);
//		Thread.sleep(5000);
//				
//	}
	
	public void clickH3Button(By H3) {
		WaitUtility.fluentWaitUntilVisible(6, licenses_button_h1, 2);
		click(licenses_button_h1);
		WaitUtility.fluentWaitUntilVisible(6, main_data_h2, 2);
		click(main_data_h2);
		WaitUtility.fluentWaitUntilVisible(6, H3, 2);
		click(H3);
		
		
	}
	
    public void clickCountriesButton()  {
        clickH3Button(countries_button_h3);
    }

    public void clickCitiesButton()   {
        clickH3Button(cities_button_h3);
    }

    public void clickMotorStateButton()   {
        clickH3Button(motor_state_button_h3);
    }
}
	
