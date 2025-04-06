package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.MotorStatePage;

public class MotorStateTest extends BaseTest {
	
	@Test(priority =1)
	public void validAddMotorState()  {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		MotorStatePage motorStatePage = homePage.sidePanel.clickMotorStatesButton();
		motorStatePage.select100Row();
		motorStatePage.clickAddMotorStateButton();
		motorStatePage.addMotorStateWindowSetArabicName("حالة_وحدة_افتراضية_1");
		motorStatePage.addMotorStateWindowSetEnglishName("virtual_motor_state_1");
		motorStatePage.addMotorStateWindowSetDescription("وصفdescription");
		motorStatePage.addMotorStateWindowSelectStatusArabic("نشط");
		motorStatePage.addMotorStateWindowClickAddButton();
		Assert.assertTrue(motorStatePage.addMotorStateSuccessMessageIsDisplayed(),"add city failed");

	}
	
	
	@Test(priority =2)
	public void validAeditMotorState()  {
		MotorStatePage motorStatePage = new MotorStatePage();
		//citiesPage.clickEditMotorStateButtonByOrder(0);
		motorStatePage.clickEditMotorStateButtonByMotorStateNameArabic("حالة_وحدة_افتراضية_1");
		motorStatePage.editMotorStateWindowSetArabicName("حالة_وحدة_افتراضية_1_معدلة");
		motorStatePage.editMotorStateWindowSetEnglishName("virtual_motor_state_1_edited");
		motorStatePage.editMotorStateWindowClickUpdateButton();
		Assert.assertTrue(motorStatePage.editMotorStateSuccessMessageIsDisplayed(),"add city failed");

	}
	
	@Test(priority =3)
	public void validDeleteMotorState() {
		
		MotorStatePage motorStatePage = new MotorStatePage();
		//citiesPage.clickDeleteMotorStateButtonByOrder(0);
		motorStatePage.clickDeleteMotorStateButtonByMotorStateNameArabic("حالة_وحدة_افتراضية_1_معدلة");
		motorStatePage.clickDeleteMotorStateConfirmButton();;
		Assert.assertTrue(motorStatePage.deleteMotorStateSuccessMessageIsDisplayed());
		
		}
}
