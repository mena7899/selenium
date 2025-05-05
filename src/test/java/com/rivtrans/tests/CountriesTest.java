package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.CountriesPage;
public class CountriesTest extends BaseTest  {
	
	public String random_country_zip_code = generateRandomEnglishCapitalCharacters(2);
	
	@Test(priority =1,dependsOnMethods = {"com.rivtrans.tests.HomeTest.validLoginVisbleLogo"})
	public void validAddCountry()  {
		
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		homePage.sidePanel.clickLicensesButton();
		homePage.sidePanel.clickMainDataButton();
		CountriesPage countriesPage = homePage.sidePanel.clickCountriesButton();
		countriesPage.select100Row();
		countriesPage.clickAddCountryButton();
		countriesPage.addCountryWindowSetArabicName("دولة افتراضية");
		//SKIPPEDcountriesPage.addCountryWindowSetEnglishName("virtual country");
		countriesPage.addCountryWindowSetIsoCode(random_country_zip_code);
		countriesPage.addCountryWindowClickAddButton();
		Assert.assertTrue(countriesPage.addCountrySuccessMessageIsDisplayed());
			
	}
	
	@Test(priority =2,dependsOnMethods = {"validAddCountry"})
	public void validEditCountry() {
		
		CountriesPage countriesPage = new CountriesPage();
		countriesPage.reloadCountriesPage();
		countriesPage.clickEditCountryButtonByCountryIsoCode(random_country_zip_code);
		//countriesPage.clickEditCountryButtonByOrder(0);
		countriesPage.editCountryWindowSetArabicName("دولة افتراضية معدلة");
		//SKIPPEDcountriesPage.editCountryWindowSetEnglishName("virtual country edited");
		countriesPage.editCountryWindowClickUpdateButton();
		Assert.assertTrue(countriesPage.editCountrySuccessMessageIsDisplayed());
			
	}
	//,dependsOnMethods = {"validEditCountry"}
	@Test(priority =3,dependsOnMethods = {"validEditCountry"})
	public void validDeleteCountry() {
		CountriesPage countriesPage = new CountriesPage();
		countriesPage.reloadCountriesPage();
		//countriesPage.clickDeleteCountryButtonByOrder(0);
		countriesPage.clickDeleteCountryButtonByCountryIsoCode(random_country_zip_code);
		countriesPage.clickDeleteCountryConfirmButton();
		Assert.assertTrue(countriesPage.deleteCountrySuccessMessageIsDisplayed());
		
		
	}
}
