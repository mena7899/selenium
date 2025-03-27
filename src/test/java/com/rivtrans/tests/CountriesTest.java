package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.CountriesPage;
public class CountriesTest extends BaseTest  {
	
	@Test
	public void validAddCountry()  {
		
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		CountriesPage countriesPage = homePage.sidePanel.clickCountriesButton();
		countriesPage.clickAddCountryButton();
		countriesPage.addCountryWindowSetArabicName("دولة افتراضية");
		countriesPage.addCountryWindowSetEnglishName("virtual country");
		countriesPage.addCountryWindowSetIsoCode("XX");
		countriesPage.addCountryWindowClickAddButton();
		Assert.assertTrue(countriesPage.addCountrySuccessMessageIsDisplayed(),"add country failed");
			
	}
	
	@Test
	public void validDeleteCountry() {
		CountriesPage countriesPage = null;
		countriesPage.clickEditCountryButtonByOrder(0);
		countriesPage.clickDeleteCountryConfirmButton(0);
		Assert.assertTrue(countriesPage.deleteCountrySuccessMessageIsDisplayed());
		
		
	}
}
