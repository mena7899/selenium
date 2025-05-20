package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.UnitNaturePage;

public class UnitNatureTest extends BaseTest {
	
	@Test(priority =21,dependsOnMethods = {"com.rivtrans.tests.HomeTest.validLoginVisbleLogo"})
	public void validAddUnitNature()  {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		UnitNaturePage unitNaturePage = homePage.sidePanel.clickUnitNatureButton();
		homePage.sidePanel.clickLicensesButton();
		homePage.sidePanel.clickMainDataButton();
		unitNaturePage.select100Row();
		unitNaturePage.clickAddUnitNatureButton();
		unitNaturePage.addUnitNatureWindowSetArabicName("طبيعة_وحدة_افتراضية_1");
		//SKIPPEDunitNaturePage.addUnitNatureWindowSetEnglishName("virtual_unit_nature_1");
		unitNaturePage.addUnitNatureWindowSetDescription("وصف_description");
		unitNaturePage.addUnitNatureWindowSelectStatusArabic("نشط");
		unitNaturePage.addUnitNatureWindowClickAddButton();
		Assert.assertTrue(unitNaturePage.addUnitNatureSuccessMessageIsDisplayed());
		//SKIPPEDunitNaturePage.clickCloseSuccessMessage();

	}
	
	
	@Test(priority =22,dependsOnMethods = {"validAddUnitNature"})
	public void validEditUnitNature()  {
		UnitNaturePage unitNaturePage = new UnitNaturePage();
		unitNaturePage.reloadUnitNaturePage();
		//SKIPPEDcitiesPage.clickEditUnitNatureButtonByOrder(0);
		unitNaturePage.clickEditUnitNatureButtonByUnitNatureNameArabic("طبيعة_وحدة_افتراضية_1");
		unitNaturePage.editUnitNatureWindowSetArabicName("طبيعة_وحدة_افتراضية_1_معدلة");
		//SKIPPEDunitNaturePage.editUnitNatureWindowSetEnglishName("virtual_unit_nature_1_edited");
		unitNaturePage.editUnitNatureWindowClickUpdateButton();
		Assert.assertTrue(unitNaturePage.editUnitNatureSuccessMessageIsDisplayed());

	}
	
	@Test(priority =23,dependsOnMethods = {"validEditUnitNature"})
	public void validDeleteUnitNature() {
		
		UnitNaturePage unitNaturePage = new UnitNaturePage();
		unitNaturePage.reloadUnitNaturePage();
		//SKIPPEDcitiesPage.clickDeleteUnitNatureButtonByOrder(0);
		unitNaturePage.clickDeleteUnitNatureButtonByUnitNatureNameArabic("طبيعة_وحدة_افتراضية_1_معدلة");
		unitNaturePage.clickDeleteUnitNatureConfirmButton();
		Assert.assertTrue(unitNaturePage.deleteUnitNatureSuccessMessageIsDisplayed());
		
		}
}
