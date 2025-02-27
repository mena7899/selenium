package com.rivtrans.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.SecurityCheckPage;

public class HomeTest extends BaseTest{
	
	@Test
	public void testIvalidLoginErrorMessage() throws InterruptedException {
		
		HomePage homePage = loginPage.validLogin("mena2", "12345");
		
		
		
	}

}
