package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;

public class CountriesTest extends BaseTest  {
	
	@Test
	public void validLoginVisbleLoge() throws InterruptedException  {
		
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		homePage.justOpen();
		
			
	}
}
