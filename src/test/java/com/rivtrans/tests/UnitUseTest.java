package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.UnitUsePage;

public class UnitUseTest extends BaseTest {
	
	
	@Test(priority =1)
	public void validAddUnitUse()  {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		UnitUsePage unitUsePage = homePage.sidePanel.clickUnitUseButton();
		unitUsePage.select100Row();
		unitUsePage.clickAddUnitUseButton();
		unitUsePage.addUnitUseWindowSetArabicName("استخدام_وحدة_افتراضية_1");
		unitUsePage.addUnitUseWindowSetEnglishName("virtual_unit_use_1");
		unitUsePage.addUnitUseWindowSetDescription("وصف_description");
		unitUsePage.addUnitUseWindowSelectStatusArabic("نشط");
		unitUsePage.addUnitUseWindowClickAddButton();
		Assert.assertTrue(unitUsePage.addUnitUseSuccessMessageIsDisplayed(),"add unit use failed");
		//unitUsePage.clickCloseSuccessMessage();

	}
	
	
	@Test(priority =2,dependsOnMethods = {"validAddUnitUse"})
	public void validEditUnitUse()  {
		UnitUsePage unitUsePage = new UnitUsePage();
		unitUsePage.reloadUnitUsePage();
		//citiesPage.clickEditUnitUseButtonByOrder(0);
		unitUsePage.clickEditUnitUseButtonByUnitUseNameArabic("استخدام_وحدة_افتراضية_1");
		unitUsePage.editUnitUseWindowSetArabicName("استخدام_وحدة_افتراضية_1_معدلة");
		unitUsePage.editUnitUseWindowSetEnglishName("virtual_unit_use_1_edited");
		unitUsePage.editUnitUseWindowClickUpdateButton();
		Assert.assertTrue(unitUsePage.editUnitUseSuccessMessageIsDisplayed(),"edit unit use failed");

	}
	
	@Test(priority =3,dependsOnMethods = {"validEditUnitUse"})
	public void validDeleteUnitUse() {
		
		UnitUsePage unitUsePage = new UnitUsePage();
		unitUsePage.reloadUnitUsePage();
		//citiesPage.clickDeleteUnitUseButtonByOrder(0);
		unitUsePage.clickDeleteUnitUseButtonByUnitUseNameArabic("استخدام_وحدة_افتراضية_1_معدلة");
		unitUsePage.clickDeleteUnitUseConfirmButton();
		Assert.assertTrue(unitUsePage.deleteUnitUseSuccessMessageIsDisplayed(),"edit unit use failed");
		
		}

}
