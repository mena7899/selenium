package com.rivtrans.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.utilities.WaitUtility;

public class HomeTest extends BaseTest{
	
	@Test(priority =2)
	public void validLoginVisbleLogo()    {
		
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		Assert.assertTrue(homePage.logoIsDisplayed());
				
	}

}
