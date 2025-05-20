package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.UnitUsePage;

public class UnitUseTest extends BaseTest {
	
	@Test(priority =9,dependsOnMethods = {"com.rivtrans.tests.HomeTest.validLoginVisbleLogo"})
	public void validAddUnitUse()  {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		homePage.sidePanel.clickLicensesButton();
		homePage.sidePanel.clickMainDataButton();
		UnitUsePage unitUsePage = homePage.sidePanel.clickUnitUseButton();
		unitUsePage.select100Row();
		unitUsePage.clickAddUnitUseButton();
		unitUsePage.addUnitUseWindowSetArabicName("استخدام_وحدة_افتراضية_1");
		//SKIPPEDunitUsePage.addUnitUseWindowSetEnglishName("virtual_unit_use_1");
		unitUsePage.addUnitUseWindowSetDescription("وصف_description1");
		unitUsePage.addUnitUseWindowSelectStatusArabic("نشط");
		unitUsePage.addUnitUseWindowClickAddButton();
		Assert.assertTrue(unitUsePage.addUnitUseSuccessMessageIsDisplayed());
		//SKIPPEDunitUsePage.clickCloseSuccessMessage();

	}
	
	
	@Test(priority =10,dependsOnMethods = {"validAddUnitUse"})
	public void validEditUnitUse()  {
		UnitUsePage unitUsePage = new UnitUsePage();
		unitUsePage.reloadUnitUsePage();
		//SKIPPEDcitiesPage.clickEditUnitUseButtonByOrder(0);
		unitUsePage.clickEditUnitUseButtonByUnitUseNameArabic("استخدام_وحدة_افتراضية_1");
		unitUsePage.editUnitUseWindowSetArabicName("استخدام_وحدة_افتراضية_1_معدلة");
		//SKIPPEDunitUsePage.editUnitUseWindowSetEnglishName("virtual_unit_use_1_edited");
		unitUsePage.editUnitUseWindowClickUpdateButton();
		Assert.assertTrue(unitUsePage.editUnitUseSuccessMessageIsDisplayed());

	}
	
	@Test(priority =11,dependsOnMethods = {"validEditUnitUse"})
	public void validDeleteUnitUse() {
		
		UnitUsePage unitUsePage = new UnitUsePage();
		unitUsePage.reloadUnitUsePage();
		//SKIPPEDcitiesPage.clickDeleteUnitUseButtonByOrder(0);
		unitUsePage.clickDeleteUnitUseButtonByUnitUseNameArabic("استخدام_وحدة_افتراضية_1_معدلة");
		unitUsePage.clickDeleteUnitUseConfirmButton();
		Assert.assertTrue(unitUsePage.deleteUnitUseSuccessMessageIsDisplayed());
		
		}

}
