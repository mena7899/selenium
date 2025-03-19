package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.CountriesPage;
public class CountriesTest extends BaseTest  {
	
	@Test
	public void openCountriesPage()  {
		
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		CountriesPage countriesPage = homePage.sidePanel.clickCountriesButton();
		
			
	}
}
