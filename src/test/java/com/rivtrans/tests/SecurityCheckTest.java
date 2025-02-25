package com.rivtrans.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.SecurityCheckPage;

public class SecurityCheckTest extends BaseTest{
	
	@Test
	public void testIvalidLoginErrorMessage() throws InterruptedException {
		
		SecurityCheckPage securityCheckPage = loginPage.invalidLogin("mena2", "12345");
		
		String error_message=securityCheckPage.getSecurityCheckErrorMesage();
		
		assertTrue(error_message.contains("خطأ"));
		
	}

}
