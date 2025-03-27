package com.rivtrans.tests;

import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.CitiesPage;
import com.rivtrans.pages.HomePage;

public class CityTest extends BaseTest {
	
	@Test
	public void validAddCity() {
	HomePage homePage = loginPage.validLogin("ramadan", "123456");
	CitiesPage citiesPage= homePage.sidePanel.clickCitiesButton();
	citiesPage.clickAddCityButton();
	citiesPage.addCityWindowSelectCountryArabic("تركيا");
	
	}

}
