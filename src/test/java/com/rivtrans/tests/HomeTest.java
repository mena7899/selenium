package com.rivtrans.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.utilities.WaitUtility;

public class HomeTest extends BaseTest{
	
	@Test
	public void validLoginVisbleLogo()    {
		
		HomePage homePage = loginPage.validLogin("ramadan", "123456");homePage.sidePanel.clickSideMenuButton();
		Assert.assertTrue(homePage.logoIsDisplayed());
				
	}

}
