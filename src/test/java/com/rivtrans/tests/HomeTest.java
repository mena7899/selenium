package com.rivtrans.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;

public class HomeTest extends BaseTest{
	
	@Test
	public void validLoginVisbleLoge() throws InterruptedException  {
		
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		Assert.assertTrue(homePage.logoIsDisplayed());
		
		
		
	}

}
