package com.rivtrans.tests;

import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.CitiesPage;
import com.rivtrans.pages.HomePage;

public class CitiesTest extends BaseTest{
	
	@Test
	public void validAddCity() throws InterruptedException {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		CitiesPage citiesPage = homePage.sidePanel.clickCitiesButton();
		citiesPage.select100Row();
		citiesPage.clickAddCityButton();
		citiesPage.addCityWindowSetArabicName("مدينة افتراضية");
		citiesPage.addCityWindowSetEnglishName("virtual code");
		citiesPage.addCityWindowSetIsoCode("zzz");
		citiesPage.addCityWindowSelectCountryArabic("تركيا");
		

	}

}
