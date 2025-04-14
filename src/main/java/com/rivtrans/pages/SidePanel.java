package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
//import com.rivtrans.utilities.WaitUtility;

public class SidePanel extends BasePage {
	//"hide-menu ng-tns-c1203807328-0 ng-star-inserted"
	private By licenses_button_h1 = By.cssSelector("span[class*='ng-star-inserted']");
	//private By licenses_button_h1 = By.xpath("//*[@id=\"sidebarnav\"]/li/a/span");
	private By main_data_h1x1 = By.cssSelector("a[class*='ml-sub-menu']");
	//private By countries_button_h3 = By.xpath("//*[@id=\"sidebarnav\"]/li/ul/li/ul/li[1]/a");
	private By countries_button_h1x1x1 = By.cssSelector("a[href='/countries']");
	private By cities_button_h1x1x2 = By.cssSelector("a[href='/cities']");
	private By unit_natures_button_h1x1x3 = By.cssSelector("a[href='/motor-states']");
	private By unit_nature_button_h1x1x4 = By.cssSelector("a[href='/unit-nature']");
	private By unit_use_button_h1x1x5 = By.cssSelector("a[href='/unitUse']");
	
	
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
	
	public void clickH1x1Button(By H1x1xi) {
		//WaitUtility.fluentWaitUntilVisible(6, licenses_button_h1, 2);
		click(licenses_button_h1);
		//WaitUtility.fluentWaitUntilVisible(6, main_data_h2, 2);
		click(main_data_h1x1);
		//WaitUtility.fluentWaitUntilVisible(6, H3, 2);
		click(H1x1xi);
		
		
	}
	
    public CountriesPage clickCountriesButton()  {
    	clickH1x1Button(countries_button_h1x1x1);
		return new CountriesPage();
    }

    public CitiesPage clickCitiesButton()   {
    	clickH1x1Button(cities_button_h1x1x2);
		return new CitiesPage();
		
    }
    
    public MotorStatePage clickMotorStatesButton()   {
    	clickH1x1Button(unit_natures_button_h1x1x3);
        return new MotorStatePage();
    }

    public UnitNaturePage clickUnitNatureButton()   {
    	clickH1x1Button(unit_nature_button_h1x1x4);
        return new UnitNaturePage();
    }
    
    public UnitUsePage clickUnitUseButton()  {
    	clickH1x1Button(unit_use_button_h1x1x5);
        return new UnitUsePage();
    }
    
    
    
    
    
}
	
