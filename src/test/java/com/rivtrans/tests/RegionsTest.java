package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.CitiesPage;
import com.rivtrans.pages.RegionsPage;
import com.rivtrans.pages.CountriesPage;
import com.rivtrans.pages.HomePage;

public class RegionsTest extends BaseTest{
	
	public String random_country_zip_code = generateRandomEnglishCapitalCharacters(2);
	public String random_city_zip_code = generateRandomEnglishCapitalCharacters(3);
	public String random_country_arabic_name= generateRandomArabicLetters(10);
	public String random_city_arabic_name= generateRandomArabicLetters(10);
	public String random_region_arabic_name= generateRandomArabicLetters(10)+"_1";

	@Test(priority =1,dependsOnMethods = {"com.rivtrans.tests.HomeTest.validLoginVisbleLogo"})
	public void validAddRegion()  {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
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
		citiesPage.reloadCitesPage();
		citiesPage.clickAddCityButton();
		citiesPage.addCityWindowSetArabicName(random_city_arabic_name);
		//SKIPPED//citiesPage.addRegionWindowSetEnglishName("virtual region");
		citiesPage.addCityWindowSetIsoCode(random_city_zip_code);
		citiesPage.addCityWindowSelectCountryArabic(random_country_arabic_name);
		citiesPage.addCityWindowClickAddButton();
		RegionsPage regionsPage = citiesPage.sidePanel.clickRegionsButton();
		regionsPage.clickAddRegionButton();
		regionsPage.addRegionWindowSetArabicName(random_region_arabic_name);
		regionsPage.addRegionWindowSelectCityArabic(random_city_arabic_name);
		regionsPage.addRegionWindowSelectStatusArabic("نشط");
		regionsPage.addRegionWindowClickSelectAllPermissions();
		regionsPage.addRegionWindowClickSelectIsMain();
		regionsPage.addRegionWindowClickAddButton();
		regionsPage.addRegionSuccessMessageIsDisplayed();
		
		//SKIPPED//citiesPage.clickAddRegionSuccessMessageCloseButton();

	}
	
	
	@Test(priority =2,dependsOnMethods = {"validAddRegion"})
	public void validEditRegion()  {
		RegionsPage regionsPage = new RegionsPage();
		regionsPage.reloadRegionsPage();
		//SKIPPED//citiesPage.clickEditRegionButtonByOrder(0);
		regionsPage.clickEditRegionButtonByRegionName(random_region_arabic_name);
		regionsPage.editRegionWindowSetArabicName(random_region_arabic_name+"معدلة");
		//SKIPPED//citiesPage.editRegionWindowSetEnglishName("virtual region edited");
		regionsPage.editRegionWindowClickUpdateButton();
		Assert.assertTrue(regionsPage.editRegionSuccessMessageIsDisplayed());
		//SKIPPED//citiesPage.clickEditRegionSuccessMessageCloseButton();

	}
	//,dependsOnMethods = {"validEditRegion"}
	@Test(priority =3,dependsOnMethods = {"validAddRegion"})
	public void validDeleteRegion()   {
		
		RegionsPage regionsPage = new RegionsPage();
		regionsPage.clickDeleteRegionButtonByRegionName(random_region_arabic_name+"معدلة");
		regionsPage.clickDeleteRegionConfirmButton();
		CitiesPage citiesPage = regionsPage.sidePanel.clickCitiesButton();
		citiesPage.reloadCitesPage();
		//SKIPPED//citiesPage.clickDeleteRegionButtonByOrder(0);
		citiesPage.clickDeleteCityButtonByCityIsoCode(random_city_zip_code);
		citiesPage.clickDeleteCityConfirmButton();
		Assert.assertTrue(citiesPage.deleteCitySuccessMessageIsDisplayed());
		//SKIPPED//citiesPage.clickDeleteRegionSuccessMessageCloseButton();
		CountriesPage countriesPage = citiesPage.sidePanel.clickCountriesButton();
		countriesPage.clickDeleteCountryButtonByCountryIsoCode(random_country_zip_code);
		countriesPage.clickDeleteCountryConfirmButton();
		
	
	}

}
