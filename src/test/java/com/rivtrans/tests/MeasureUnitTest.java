package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.MeasureUnitPage;

public class MeasureUnitTest extends BaseTest {
	
	
	public String random_measure_unit_arabic_name= generateRandomArabicLetters(10);
	@Test(priority =1,dependsOnMethods = {"com.rivtrans.tests.HomeTest.validLoginVisbleLogo"})
	public void validAddMeasureUnit()  {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");homePage.sidePanel.clickSideMenuButton();
		homePage.sidePanel.clickLicensesButton();
		homePage.sidePanel.clickMainDataButton();
		MeasureUnitPage measureUnitPage = homePage.sidePanel.clickMeasureUnitButton();
		measureUnitPage.select100Row();
		measureUnitPage.clickAddMeasureUnitButton();
		measureUnitPage.addMeasureUnitWindowSetArabicName(random_measure_unit_arabic_name);
		measureUnitPage.addMeasureUnitWindowSetEnglishName("virtualmeasureunit");
		measureUnitPage.addMeasureUnitWindowSelectMeasureTypeArabic("درجة الحرارة");
		measureUnitPage.addMeasureUnitWindowSetConversionRate(".1");
		measureUnitPage.addMeasureUnitWindowClickStandaradUnitCheckbox();
		measureUnitPage.addMeasureUnitWindowClickStandaradUnitCheckbox();
		measureUnitPage.addMeasureUnitWindowClickAddButton();
		
		Assert.assertTrue(measureUnitPage.addMeasureUnitSuccessMessageIsDisplayed());
		//SKIPPED//measureUnitPage.clickCloseSuccessMessage();

	}
	
	
	@Test(priority =2,dependsOnMethods = {"validAddMeasureUnit"})
	public void validEditMeasureUnit()  {
		MeasureUnitPage measureUnitPage = new MeasureUnitPage();
		measureUnitPage.reloadMeasureUnitPage();
		//SKIPPEDcitiesPage.clickEditMeasureUnitButtonByOrder(0);
		measureUnitPage.clickEditMeasureUnitButtonByMeasureUnitNameArabic(random_measure_unit_arabic_name);
		measureUnitPage.editMeasureUnitWindowSetArabicName(random_measure_unit_arabic_name+" "+"معدلة");
		//SKIPPEDmeasureUnitPage.editMeasureUnitWindowSetEnglishName("virtual_measure_unit_1_edited");
		measureUnitPage.editMeasureUnitWindowClickUpdateButton();
		Assert.assertTrue(measureUnitPage.editMeasureUnitSuccessMessageIsDisplayed());

	}
	
	@Test(priority =3,dependsOnMethods = {"validEditMeasureUnit"})
	public void validDeleteMeasureUnit() {
		
		MeasureUnitPage measureUnitPage = new MeasureUnitPage();
		measureUnitPage.reloadMeasureUnitPage();
		//SKIPPEDcitiesPage.clickDeleteMeasureUnitButtonByOrder(0);
		measureUnitPage.clickDeleteMeasureUnitButtonByMeasureUnitNameArabic(random_measure_unit_arabic_name+" "+"معدلة");
		measureUnitPage.clickDeleteMeasureUnitConfirmButton();
		Assert.assertTrue(measureUnitPage.deleteMeasureUnitSuccessMessageIsDisplayed());
		
		}

}
