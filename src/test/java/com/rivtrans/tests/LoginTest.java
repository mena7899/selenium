package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test(priority =1)
	public void invalidLogin()  {
		//the loginpage. is from the base test
		loginPage.setLoginpageUserName("wrong");
		loginPage.setLoginpagePassword("password");
		loginPage.clickLogingPageLoingButton();
		String actucal_message=loginPage.getErrormessage();
		Assert.assertTrue(actucal_message.contains("غير"));
		
		
	}
		
		
		
	

}
