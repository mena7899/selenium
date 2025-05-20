package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.AuthoritiesPage;

public class AuthoritiesTest extends BaseTest {
	public String random_authority_tax_number= generateRandomEnglishNumbers(9);
	
	@Test(priority =6,dependsOnMethods = {"com.rivtrans.tests.HomeTest.validLoginVisbleLogo"})
	public void validAddAuthorities()  {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		homePage.sidePanel.clickLicensesButton();
		homePage.sidePanel.clickMainDataButton();
		AuthoritiesPage authoritiesPage = homePage.sidePanel.clickAuthoritiesButton();
		authoritiesPage.select100Row();
		authoritiesPage.clickAddAuthoritiesButton();
		authoritiesPage.addAuthoritiesWindowSetArabicName("جهة_افتراضية1");
		//SKIPPEDauthoritiesPage.addAuthoritiesWindowSetEnglishName("virtual_authorities_1");
		authoritiesPage.addAuthoritiesWindowSetTaxNumber(random_authority_tax_number);
		authoritiesPage.addAuthoritiesWindowSelectLogoFilePath( System.getProperty("user.dir") +"/download.png");
		authoritiesPage.addAuthoritiesWindowClickStandaradUnitCheckbox();
		authoritiesPage.addAuthoritiesWindowClickStandaradUnitCheckbox();
		authoritiesPage.addAuthoritiesWindowClickAddButton();
		Assert.assertTrue(authoritiesPage.addAuthoritiesSuccessMessageIsDisplayed());
		//SKIPPEDauthoritiesPage.clickCloseSuccessMessage();

	}
	

	@Test(priority =7,dependsOnMethods = {"validAddAuthorities"})
	public void validEditAuthorities()  {
		AuthoritiesPage authoritiesPage = new AuthoritiesPage();
		authoritiesPage.reloadAuthoritiesPage();
		//SKIPPEDcitiesPage.clickEditAuthoritiesButtonByOrder(0);
		authoritiesPage.clickEditAuthoritiesButtonByAuthoritiesNameArabic("جهة_افتراضية1");
		authoritiesPage.editAuthoritiesWindowSetArabicName("جهة_افتراضية1معدلية");
		//SKIPPEDauthoritiesPage.editAuthoritiesWindowSetEnglishName("virtual_authorities_1_edited");
		authoritiesPage.editAuthoritiesWindowClickUpdateButton();
		Assert.assertTrue(authoritiesPage.editAuthoritiesSuccessMessageIsDisplayed());

	}
	
	@Test(priority =8,dependsOnMethods = {"validEditAuthorities"})
	public void validDeleteAuthorities() {
		
		AuthoritiesPage authoritiesPage = new AuthoritiesPage();
		authoritiesPage.reloadAuthoritiesPage();
		//SKIPPEDcitiesPage.clickDeleteAuthoritiesButtonByOrder(0);
		authoritiesPage.clickDeleteAuthoritiesButtonByAuthoritiesNameArabic("جهة_افتراضية1معدلية");
		authoritiesPage.clickDeleteAuthoritiesConfirmButton();
		Assert.assertTrue(authoritiesPage.deleteAuthoritiesSuccessMessageIsDisplayed());
		
		}

}
