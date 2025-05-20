package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.MeasureUnitPage;
import com.rivtrans.pages.RiverUnitPage;
import com.rivtrans.pages.UnitNaturePage;
import com.rivtrans.pages.UnitUsePage;


public class RiverUnitTest extends BaseTest {
	
	@Test(priority =35,dependsOnMethods = {"com.rivtrans.tests.HomeTest.validLoginVisbleLogo"})
	public void validAddRiverUnit()  {
		//set up test data
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		homePage.sidePanel.clickLicensesButton();
		homePage.sidePanel.clickMainDataButton();
		UnitUsePage unitUsePage = homePage.sidePanel.clickUnitUseButton();
		unitUsePage.clickAddUnitUseButton();
		unitUsePage.addUnitUseWindowSetArabicName("استخدام_وحدة_افتراضية_1");
		unitUsePage.addUnitUseWindowSelectStatusArabic("نشط");
		unitUsePage.addUnitUseWindowClickAddButton();
		Assert.assertTrue(unitUsePage.addUnitUseSuccessMessageIsDisplayed());
		UnitNaturePage unitNaturePage = unitUsePage.sidePanel.clickUnitNatureButton();
		unitNaturePage.clickAddUnitNatureButton();
		unitNaturePage.addUnitNatureWindowSetArabicName("طبيعة_وحدة_افتراضية_1");
		unitNaturePage.addUnitNatureWindowSelectStatusArabic("نشط");
		unitNaturePage.addUnitNatureWindowClickAddButton();
		Assert.assertTrue(unitNaturePage.addUnitNatureSuccessMessageIsDisplayed());
		MeasureUnitPage measureUnitPage = unitNaturePage.sidePanel.clickMeasureUnitButton();
		measureUnitPage.clickAddMeasureUnitButton();
		measureUnitPage.addMeasureUnitWindowSetArabicName("وحدة_طول_افتراضي1");
		measureUnitPage.addMeasureUnitWindowSelectMeasureTypeArabic("الطول");
		measureUnitPage.addMeasureUnitWindowSetConversionRate("1");
		measureUnitPage.addMeasureUnitWindowClickAddButton();
		Assert.assertTrue(measureUnitPage.addMeasureUnitSuccessMessageIsDisplayed());
		measureUnitPage.clickAddMeasureUnitButton();
		measureUnitPage.addMeasureUnitWindowSetArabicName("وحدة_وزن_افتراضي1");
		measureUnitPage.addMeasureUnitWindowSelectMeasureTypeArabic("الوزن");
		measureUnitPage.addMeasureUnitWindowSetConversionRate("1");
		measureUnitPage.addMeasureUnitWindowClickAddButton();
		//Assert.assertTrue(measureUnitPage.addMeasureUnitSuccessMessageIsDisplayed());
		//////////////////////////////////////////////////////////////////////
		RiverUnitPage riverUnitPage = measureUnitPage.sidePanel.clickRiverUnitsButton();
		riverUnitPage.clickAddRiverUnitButton();
		riverUnitPage.addRiverUnitWindowSetName("virtual_افتراضية");
		riverUnitPage.addRiverUnitWindowSetCode("code");
		riverUnitPage.addRiverUnitWindowRegistirationNumber("12341234");
		riverUnitPage.addRiverUnitWindowManufactureYear("1999");
		riverUnitPage.addRiverUnitWindowSelectUnitNatureArabic("طبيعة_وحدة_افتراضية_1");
		riverUnitPage.addRiverUnitWindowSelectUnitUseArabic("استخدام_وحدة_افتراضية_1");
		riverUnitPage.addRiverUnitWindowSelectIsEngineArabic("نعم");
		riverUnitPage.addRiverUnitWindowMotorsNumber("10");
		riverUnitPage.addRiverUnitWindowSelectIsLicensedArabic("نعم");
		riverUnitPage.addRiverUnitWindowSetTradeMark("علامة افتراضية");
		riverUnitPage.addRiverUnitWindowSelectCompanyArabic("مينا");
		riverUnitPage.addRiverUnitWindowSelectDimensionsMeasureUnitArabic("وحدة_طول_افتراضي1");
		riverUnitPage.addRiverUnitWindowSetlength("10");
		riverUnitPage.addRiverUnitWindowSetwidth("10");
		riverUnitPage.addRiverUnitWindowSetheight("10");
		riverUnitPage.addRiverUnitWindowSelectMeasureLoadArabic("وحدة_وزن_افتراضي1");
		riverUnitPage.addRiverUnitWindowSetMaximumLoad("10");
		riverUnitPage.addRiverUnitWindowSetNetLoad("10");
		riverUnitPage.addRiverUnitWindowSelectFuelTypeArabic("ديزل");
		riverUnitPage.addRiverUnitWindowSetEnginCapacity("10");
		riverUnitPage.addRiverUnitWindowSetPassengersNumber("10");
		riverUnitPage.addRiverUnitWindowSetCrewNumber("10");
		riverUnitPage.addRiverUnitWindowSelectMaintenaceStatusArabic("جيدة");
		riverUnitPage.addRiverUnitWindowClickAddButton();
		riverUnitPage.addRiverUnitSuccessMessageIsDisplayed();
		//SKIPPEDriverUnitPage.clickCloseSuccessMessage();

	}

	
	@Test(priority =36,dependsOnMethods = {"validAddRiverUnit"})
	public void validEditRiverUnit()  {
		RiverUnitPage riverUnitPage = new RiverUnitPage();
		//riverUnitPage.reloadRiverUnitPage();
		//SKIPPEDcitiesPage.clickEditRiverUnitButtonByOrder(0);
		riverUnitPage.clickEditRiverUnitButtonByRiverUnitNameArabic("virtual_افتراضية");
		riverUnitPage.editRiverUnitWindowSetArabicName("استخدام_وحدة_افتراضية_1_معدلة");
		//SKIPPEDriverUnitPage.editRiverUnitWindowSetEnglishName("virtual_unit_use_1_edited");
		riverUnitPage.editRiverUnitWindowClickUpdateButton();
		Assert.assertTrue(riverUnitPage.editRiverUnitSuccessMessageIsDisplayed());

	}
	
	@Test(priority =37,dependsOnMethods = {"validEditRiverUnit"})
	public void validDeleteRiverUnit() {
		
		RiverUnitPage riverUnitPage = new RiverUnitPage();
		riverUnitPage.reloadRiverUnitPage();
		//SKIPPEDcitiesPage.clickDeleteRiverUnitButtonByOrder(0);
		riverUnitPage.clickDeleteRiverUnitButtonByRiverUnitNameArabic("استخدام_وحدة_افتراضية_1_معدلة");
		riverUnitPage.clickDeleteRiverUnitConfirmButton();
		Assert.assertTrue(riverUnitPage.deleteRiverUnitSuccessMessageIsDisplayed());
		
		//tear down test data
		riverUnitPage.sidePanel.clickSideMenuButton();
		UnitUsePage unitUsePage = riverUnitPage.sidePanel.clickUnitUseButton();
		unitUsePage.clickDeleteUnitUseButtonByUnitUseNameArabic("استخدام_وحدة_افتراضية_1");
		unitUsePage.clickDeleteUnitUseConfirmButton();
		Assert.assertTrue(unitUsePage.deleteUnitUseSuccessMessageIsDisplayed());
		UnitNaturePage unitNaturePage = unitUsePage.sidePanel.clickUnitNatureButton();
		unitNaturePage.clickDeleteUnitNatureButtonByUnitNatureNameArabic("طبيعة_وحدة_افتراضية_1");
		unitNaturePage.clickDeleteUnitNatureConfirmButton();
		Assert.assertTrue(unitNaturePage.deleteUnitNatureSuccessMessageIsDisplayed());
		MeasureUnitPage measureUnitPage = unitNaturePage.sidePanel.clickMeasureUnitButton();
		measureUnitPage.clickDeleteMeasureUnitButtonByMeasureUnitNameArabic("وحدة_طول_افتراضي1");
		measureUnitPage.clickDeleteMeasureUnitConfirmButton();
		Assert.assertTrue(measureUnitPage.addMeasureUnitSuccessMessageIsDisplayed());
		measureUnitPage.reloadMeasureUnitPage();
		measureUnitPage.clickDeleteMeasureUnitButtonByMeasureUnitNameArabic("وحدة_وزن_افتراضي1");
		measureUnitPage.clickDeleteMeasureUnitConfirmButton();
		Assert.assertTrue(measureUnitPage.addMeasureUnitSuccessMessageIsDisplayed());
		
		}

}
