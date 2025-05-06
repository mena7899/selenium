package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.CitiesPage;
import com.rivtrans.pages.CountriesPage;
import com.rivtrans.pages.HomePage;

public class CitiesTest extends BaseTest{
	
	public String random_country_zip_code = generateRandomEnglishCapitalCharacters(2);
	public String random_city_zip_code = generateRandomEnglishCapitalCharacters(3);
	public String random_country_arabic_name= generateRandomArabicLetters(10);
	public String random_city_arabic_name= generateRandomArabicLetters(10);

	@Test(priority =1,dependsOnMethods = {"com.rivtrans.tests.HomeTest.validLoginVisbleLogo"})
	public void validAddCity()  {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");homePage.sidePanel.clickSideMenuButton();
		homePage.sidePanel.clickLicensesButton();
		homePage.sidePanel.clickMainDataButton();
		CountriesPage countriesPage = homePage.sidePanel.clickCountriesButton();
		countriesPage.clickAddCountryButton();
		countriesPage.addCountryWindowSetArabicName(random_country_arabic_name);
		//SKIPPED//countriesPage.addCountryWindowSetEnglishName("virtual country");
		countriesPage.addCountryWindowSetIsoCode(random_country_zip_code);
		countriesPage.addCountryWindowClickAddButton();
		Assert.assertTrue(countriesPage.addCountrySuccessMessageIsDisplayed());
		CitiesPage citiesPage = countriesPage.sidePanel.clickCitiesButton();
		citiesPage.select100Row();
		citiesPage.clickAddCityButton();
		citiesPage.addCityWindowSetArabicName(random_city_arabic_name);
		//SKIPPED//citiesPage.addCityWindowSetEnglishName("virtual city");
		citiesPage.addCityWindowSetIsoCode(random_city_zip_code);
		citiesPage.addCityWindowSelectCountryArabic(random_country_arabic_name);
		citiesPage.addCityWindowClickAddButton();
		Assert.assertTrue(citiesPage.addCitySuccessMessageIsDisplayed());
		//SKIPPED//citiesPage.clickAddCitySuccessMessageCloseButton();

	}
	
	
	@Test(priority =2,dependsOnMethods = {"validAddCity"})
	public void validEditCity()  {
		CitiesPage citiesPage = new CitiesPage();
		citiesPage.reloadCitesPage();
		//SKIPPED//citiesPage.clickEditCityButtonByOrder(0);
		citiesPage.clickEditCityButtonByCityIsoCode(random_city_zip_code);
		citiesPage.editCityWindowSetArabicName(random_city_arabic_name+" "+"معدلة");
		//SKIPPED//citiesPage.editCityWindowSetEnglishName("virtual city edited");
		citiesPage.editCityWindowClickUpdateButton();
		Assert.assertTrue(citiesPage.editCitySuccessMessageIsDisplayed());
		//SKIPPED//citiesPage.clickEditCitySuccessMessageCloseButton();

	}
	
	@Test(priority =3,dependsOnMethods = {"validEditCity"})
	public void validDeleteCity()   {
		
		CitiesPage citiesPage = new CitiesPage();
		citiesPage.reloadCitesPage();
		//SKIPPED//citiesPage.clickDeleteCityButtonByOrder(0);
		citiesPage.clickDeleteCityButtonByCityIsoCode(random_city_zip_code);
		citiesPage.clickDeleteCityConfirmButton();
		Assert.assertTrue(citiesPage.deleteCitySuccessMessageIsDisplayed());
		//SKIPPED//citiesPage.clickDeleteCitySuccessMessageCloseButton();
		CountriesPage countriesPage = citiesPage.sidePanel.clickCountriesButton();
		countriesPage.clickDeleteCountryButtonByCountryIsoCode(random_country_zip_code);
		countriesPage.clickDeleteCountryConfirmButton();
		
	
	}

}
