package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
//import com.rivtrans.utilities.WaitUtility;
import com.rivtrans.utilities.JavaScriptUtility;

public class SidePanel extends BasePage {
	//"hide-menu ng-tns-c1203807328-0 ng-star-inserted"
	private By side_menu_button = By.cssSelector("button[class='sidemenu-collapse mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']");
	private By licenses_button_h1 = By.cssSelector("span[class*='ng-star-inserted']");
	//private By licenses_button_h1 = By.xpath("//*[@id=\"sidebarnav\"]/li/a/span");
	//#sidebarnav > li > ul > li > a
	//private By main_data_h1x1 = By.cssSelector("#sidebarnav > li > ul > li > a");
	private By main_data_h1x1 = By.cssSelector("a[class*='ml-sub-menu']");
	//private By countries_button_h3 = By.xpath("//*[@id=\"sidebarnav\"]/li/ul/li/ul/li[1]/a");
	private By countries_button_h1x1x1 = By.cssSelector("a[href='/countries']");
	private By cities_button_h1x1x2 = By.cssSelector("a[href='/cities']");
	private By motor_state_button_h1x1x3 = By.cssSelector("a[href='/motor-states']");
	private By unit_nature_button_h1x1x4 = By.cssSelector("a[href='/unit-nature']");
	private By unit_use_button_h1x1x5 = By.cssSelector("a[href='/unitUse']");
	private By measure_unit_button_h1x1x6 = By.cssSelector("a[href='/measurement-unit-type']");
	private By documents_button_h1x1x7 = By.cssSelector("a[href='/documents']");
	private By river_unit_button_h1x1x8 = By.cssSelector("a[href='/riverUnit']");
	private By technical_estimate_button_h1x1x9 = By.cssSelector("a[href='/technical-estimate']");
	private By authorities_button_h1x1x10 = By.cssSelector("a[href='/authorities']");
	private By jobs_button_h1x1x11 = By.cssSelector("a[href='/jobs']");
	private By river_paths_button_h1x1x12 = By.cssSelector("a[href='/river-paths']");
	private By river_marina_button_h1x1x13 = By.cssSelector("a[href='/river-marina']");
	private By crew_members_button_h1x1x14 = By.cssSelector("a[href='/crewMembers']");
	private By regions_button_h1x1x15 = By.cssSelector("a[href='/regions']");
	
	
//	public void clickCountriesButton() throws InterruptedException {
//		WaitUtility.fluentWaitUntilVisible(6, licenses_button_h1, 2);
//		JavaScriptUtility.clickJS(licenses_button_h1);
//		WaitUtility.fluentWaitUntilVisible(6, main_data_h2, 2);
//		JavaScriptUtility.clickJS(main_data_h2);
//		WaitUtility.fluentWaitUntilVisible(6, countries_button_h3, 2);
//		JavaScriptUtility.clickJS(countries_button_h3);
//		Thread.sleep(5000);
//				
//	}
	
	
	public void clickSideMenuButton() {
		JavaScriptUtility.clickJS(side_menu_button);
			}
	public void clickLicensesButton() {
		JavaScriptUtility.clickJS(licenses_button_h1);
	}
	
	
	public void clickMainDataButton() {
		JavaScriptUtility.clickJS(main_data_h1x1);
	}
	
	
	
	public void clickH1x1Button(By H1x1xi) {
		//WaitUtility.fluentWaitUntilVisible(6, licenses_button_h1, 2);
		//findToClick(licenses_button_h1);
		JavaScriptUtility.clickJS(licenses_button_h1);
		//WaitUtility.fluentWaitUntilVisible(6, main_data_h2, 2);
		//findToClick(main_data_h1x1);
		JavaScriptUtility.clickJS(main_data_h1x1);
		//WaitUtility.fluentWaitUntilVisible(6, H3, 2);
		//findToClick(H1x1xi);
		JavaScriptUtility.clickJS(H1x1xi);
		
		
	}
	
    public CountriesPage clickCountriesButton()  {
    	JavaScriptUtility.clickJS(countries_button_h1x1x1);
		return new CountriesPage();
    }

    public CitiesPage clickCitiesButton()   {
    	JavaScriptUtility.clickJS(cities_button_h1x1x2);
		return new CitiesPage();
		
    }
    
    public MotorStatePage clickMotorStatesButton()   {
    	JavaScriptUtility.clickJS(motor_state_button_h1x1x3);
        return new MotorStatePage();
    }

    public UnitNaturePage clickUnitNatureButton()   {
    	JavaScriptUtility.clickJS(unit_nature_button_h1x1x4);
        return new UnitNaturePage();
    }
    
    public UnitUsePage clickUnitUseButton()  {
    	JavaScriptUtility.clickJS(unit_use_button_h1x1x5);
        return new UnitUsePage();
    }
    
    public MeasureUnitPage clickMeasureUnitButton()  {
    	JavaScriptUtility.clickJS(measure_unit_button_h1x1x6);
		return new MeasureUnitPage();
    }

    public DocumentsPage clickDocumentsButton()   {
    	JavaScriptUtility.clickJS(documents_button_h1x1x7);
		return new DocumentsPage();
		
    }
    
    public RiverUnitPage clickRiverUnitsButton()   {
    	JavaScriptUtility.clickJS(river_unit_button_h1x1x8);
        return new RiverUnitPage();
    }

    public TechnicalEstimatePage clickTechnicalEstimateButton()   {
    	JavaScriptUtility.clickJS(technical_estimate_button_h1x1x9);
        return new TechnicalEstimatePage();
    }
    
    public AuthoritiesPage clickAuthoritiesButton()  {
    	JavaScriptUtility.clickJS(authorities_button_h1x1x10);
        return new AuthoritiesPage();
    }
    
    public JobsPage clickJobsButton()  {
    	JavaScriptUtility.clickJS(jobs_button_h1x1x11);
        return new JobsPage();
    }
    
    
    public RegionsPage clickRegionsButton()  {
    	JavaScriptUtility.clickJS(regions_button_h1x1x15);
        return new RegionsPage();
    }
    
    
    
}
	
