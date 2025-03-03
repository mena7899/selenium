package com.rivtrans.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.SecurityCheckPage;

public class HomeTest extends BaseTest{
	
	@Test
	public void testIvalidLoginErrorMessage()  {
		
		HomePage homePage = loginPage.validLogin("mena", "123456");
		
		
		
	}

}
