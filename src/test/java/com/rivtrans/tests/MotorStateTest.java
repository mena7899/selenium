package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.MotorStatePage;

public class MotorStateTest extends BaseTest {
	
	@Test(priority =27,dependsOnMethods = {"com.rivtrans.tests.HomeTest.validLoginVisbleLogo"})
	public void validAddMotorState() throws InterruptedException  {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		MotorStatePage motorStatePage = homePage.sidePanel.clickMotorStatesButton();
		homePage.sidePanel.clickLicensesButton();
		homePage.sidePanel.clickMainDataButton();
		motorStatePage.select100Row();
		motorStatePage.clickAddMotorStateButton();
		motorStatePage.addMotorStateWindowSetArabicName("حالة_وحدة_افتراضية_1");
		//SKIPPEDmotorStatePage.addMotorStateWindowSetEnglishName("virtual_motor_state_1");
		motorStatePage.addMotorStateWindowSetDescription("وصفdescription");
		motorStatePage.addMotorStateWindowSelectStatusArabic("نشط");
		motorStatePage.addMotorStateWindowClickAddButton();
		Assert.assertTrue(motorStatePage.addMotorStateSuccessMessageIsDisplayed());

	}
	
	
	@Test(priority =28,dependsOnMethods = {"validAddMotorState"})
	public void validEditMotorState()  {
		MotorStatePage motorStatePage = new MotorStatePage();
		motorStatePage.reloadMotorStatePage();
		//SKIPPEDcitiesPage.clickEditMotorStateButtonByOrder(0);
		motorStatePage.clickEditMotorStateButtonByMotorStateNameArabic("حالة_وحدة_افتراضية_1");
		motorStatePage.editMotorStateWindowSetArabicName("حالة_وحدة_افتراضية_1_معدلة");
		//SKIPPEDmotorStatePage.editMotorStateWindowSetEnglishName("virtual_motor_state_1_edited");
		motorStatePage.editMotorStateWindowClickUpdateButton();
		Assert.assertTrue(motorStatePage.editMotorStateSuccessMessageIsDisplayed());

	}
	
	@Test(priority =29,dependsOnMethods = {"validEditMotorState"})
	public void validDeleteMotorState() {
		
		MotorStatePage motorStatePage = new MotorStatePage();
		motorStatePage.reloadMotorStatePage();
		//SKIPPEDcitiesPage.clickDeleteMotorStateButtonByOrder(0);
		motorStatePage.clickDeleteMotorStateButtonByMotorStateNameArabic("حالة_وحدة_افتراضية_1_معدلة");
		motorStatePage.clickDeleteMotorStateConfirmButton();
		Assert.assertTrue(motorStatePage.deleteMotorStateSuccessMessageIsDisplayed());
		
		}
}
