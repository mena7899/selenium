package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.CitiesPage;
import com.rivtrans.pages.CountriesPage;
import com.rivtrans.pages.HomePage;

public class CitiesTest extends BaseTest{
	
	@Test
	public void validAddCity() throws InterruptedException {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		CitiesPage citiesPage = homePage.sidePanel.clickCitiesButton();
		citiesPage.select100Row();
		citiesPage.clickAddCityButton();
		citiesPage.addCityWindowSetArabicName("مدينة افتراضية");
		citiesPage.addCityWindowSetEnglishName("virtual city");
		citiesPage.addCityWindowSetIsoCode("ZZZ");
		citiesPage.addCityWindowSelectCountryArabic("تركيا");
		citiesPage.addCityWindowClickAddButton();
		Assert.assertTrue(citiesPage.addCitySuccessMessageIsDisplayed(),"add city failed");

	}
	
	
	@Test
	public void validAeditCity() throws InterruptedException {
		CitiesPage citiesPage = new CitiesPage();
		citiesPage.clickEditCityButtonByCityIsoCode("ZZZ");
		citiesPage.editCityWindowSetArabicName("مدينة افتراضية معدلة");
		citiesPage.editCityWindowSetEnglishName("virtual city edited");
		citiesPage.editCityWindowClickAddButton();
		Assert.assertTrue(citiesPage.editCitySuccessMessageIsDisplayed(),"add city failed");

	}
	
	@Test
	public void validDeleteCity() {
		CitiesPage citiesPage = new CitiesPage();
		citiesPage.clickDeleteCityButtonByCityIsoCode("ZZZ");;
		citiesPage.clickDeleteCityConfirmButton();;
		Assert.assertTrue(citiesPage.deleteCitySuccessMessageIsDisplayed());
		
		
	}

}
