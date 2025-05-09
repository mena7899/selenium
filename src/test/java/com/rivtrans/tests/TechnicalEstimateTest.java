package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.TechnicalEstimatePage;

public class TechnicalEstimateTest extends BaseTest {
	
	@Test(priority =1,dependsOnMethods = {"com.rivtrans.tests.HomeTest.validLoginVisbleLogo"})
	public void validAddTechnicalEstimate()  {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		homePage.sidePanel.clickLicensesButton();
		homePage.sidePanel.clickMainDataButton();
		TechnicalEstimatePage technicalEstimatePage = homePage.sidePanel.clickTechnicalEstimateButton();
		technicalEstimatePage.select100Row();
		technicalEstimatePage.clickAddTechnicalEstimateButton();
		technicalEstimatePage.addTechnicalEstimateWindowSetArabicName("استخدام_وحدة_افتراضية_1");
		technicalEstimatePage.addTechnicalEstimateWindowSetCode("كود_virtual_technical_estimate_1");
		technicalEstimatePage.addTechnicalEstimateWindowSetDescription("وصف_description1");
		technicalEstimatePage.addTechnicalEstimateWindowClickAddButton();
		Assert.assertTrue(technicalEstimatePage.addTechnicalEstimateSuccessMessageIsDisplayed());
		//SKIPPEDtechnicalEstimatePage.clickCloseSuccessMessage();

	}
	
	
	@Test(priority =2,dependsOnMethods = {"validAddTechnicalEstimate"})
	public void validEditTechnicalEstimate()  {
		TechnicalEstimatePage technicalEstimatePage = new TechnicalEstimatePage();
		technicalEstimatePage.reloadTechnicalEstimatePage();
		//SKIPPEDcitiesPage.clickEditTechnicalEstimateButtonByOrder(0);
		technicalEstimatePage.clickEditTechnicalEstimateButtonByTechnicalEstimateNameArabic("استخدام_وحدة_افتراضية_1");
		technicalEstimatePage.editTechnicalEstimateWindowSetArabicName("استخدام_وحدة_افتراضية_1_معدلة");
		technicalEstimatePage.editTechnicalEstimateWindowSetEnglishName("virtual_technical_estimate_1_edited");
		technicalEstimatePage.editTechnicalEstimateWindowClickUpdateButton();
		Assert.assertTrue(technicalEstimatePage.editTechnicalEstimateSuccessMessageIsDisplayed());

	}
	
	@Test(priority =3,dependsOnMethods = {"validEditTechnicalEstimate"})
	public void validDeleteTechnicalEstimate() {
		
		TechnicalEstimatePage technicalEstimatePage = new TechnicalEstimatePage();
		technicalEstimatePage.reloadTechnicalEstimatePage();
		//SKIPPEDcitiesPage.clickDeleteTechnicalEstimateButtonByOrder(0);
		technicalEstimatePage.clickDeleteTechnicalEstimateButtonByTechnicalEstimateNameArabic("استخدام_وحدة_افتراضية_1_معدلة");
		technicalEstimatePage.clickDeleteTechnicalEstimateConfirmButton();
		Assert.assertTrue(technicalEstimatePage.deleteTechnicalEstimateSuccessMessageIsDisplayed());
		
		}

}
