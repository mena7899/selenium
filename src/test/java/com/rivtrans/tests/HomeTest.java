package com.rivtrans.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.utilities.WaitUtility;

public class HomeTest extends BaseTest{
	
	@Test
	public void validLoginVisbleLoge()  {
		
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		//WaitUtility.implicitWait(5000);
		Assert.assertTrue(homePage.logoIsDisplayed());
		
				
	}

}
