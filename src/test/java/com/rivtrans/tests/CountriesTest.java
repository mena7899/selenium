package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.CountriesPage;
public class CountriesTest extends BaseTest  {
	
	@Test(priority =1)
	public void validAddCountry()  {
		
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		CountriesPage countriesPage = homePage.sidePanel.clickCountriesButton();
		countriesPage.select100Row();
		countriesPage.clickAddCountryButton();
		countriesPage.addCountryWindowSetArabicName("دولة افتراضية");
		countriesPage.addCountryWindowSetEnglishName("virtual country");
		countriesPage.addCountryWindowSetIsoCode("XX");
		countriesPage.addCountryWindowClickAddButton();
		Assert.assertTrue(countriesPage.addCountrySuccessMessageIsDisplayed(),"add country failed");
			
	}
	
	@Test(priority =2,dependsOnMethods = {"validAddCountry"})
	public void validEditCountry() {
		
		CountriesPage countriesPage = new CountriesPage();
		countriesPage.clickEditCountryButtonByCountryIsoCode("XX");
		//countriesPage.clickEditCountryButtonByOrder(0);
		countriesPage.editCountryWindowSetArabicName("دولة افتراضية معدلة");
		countriesPage.editCountryWindowSetEnglishName("virtual country edited");
		countriesPage.editCountryWindowClickUpdateButton();
		Assert.assertTrue(countriesPage.editCountrySuccessMessageIsDisplayed(),"edit country failed");
			
	}
	//,dependsOnMethods = {"validEditCountry"}
	@Test(priority =3,dependsOnMethods = {"validEditCountry"})
	public void validDeleteCountry() {
		CountriesPage countriesPage = new CountriesPage();
		countriesPage.reloadCountriesPage();
		//countriesPage.clickDeleteCountryButtonByOrder(0);
		countriesPage.clickDeleteCountryButtonByCountryIsoCode("XX");
		countriesPage.clickDeleteCountryConfirmButton();
		Assert.assertTrue(countriesPage.deleteCountrySuccessMessageIsDisplayed(),"delete country failed");
		
		
	}
}
