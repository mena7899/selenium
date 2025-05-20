package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.DocumentsPage;

public class DocumentsTest extends BaseTest {
	
	@Test(priority =18,dependsOnMethods = {"com.rivtrans.tests.HomeTest.validLoginVisbleLogo"})
	public void validAddDocuments()  {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		homePage.sidePanel.clickLicensesButton();
		homePage.sidePanel.clickMainDataButton();
		DocumentsPage documentsPage = homePage.sidePanel.clickDocumentsButton();
		documentsPage.select100Row();
		documentsPage.clickAddDocumentsButton();
		documentsPage.addDocumentsWindowSetArabicName("استخدام_وحدة_افتراضية_1");
		//SKIPPED//documentsPage.addDocumentsWindowSetEnglishName("virtual_documents_1");
		documentsPage.addDocumentsWindowClickAddButton();
		Assert.assertTrue(documentsPage.addDocumentsSuccessMessageIsDisplayed());
		//SKIPPEDdocumentsPage.clickCloseSuccessMessage();

	}
	
	
	@Test(priority =19,dependsOnMethods = {"validAddDocuments"})
	public void validEditDocuments()  {
		DocumentsPage documentsPage = new DocumentsPage();
		documentsPage.reloadDocumentsPage();
		//SKIPPED//citiesPage.clickEditDocumentsButtonByOrder(0);
		documentsPage.clickEditDocumentsButtonByDocumentsNameArabic("استخدام_وحدة_افتراضية_1");
		documentsPage.editDocumentsWindowSetArabicName("استخدام_وحدة_افتراضية_1_معدلة");
		//SKIPPED//documentsPage.editDocumentsWindowSetEnglishName("virtual_documents_1_edited");
		documentsPage.editDocumentsWindowClickUpdateButton();
		Assert.assertTrue(documentsPage.editDocumentsSuccessMessageIsDisplayed());

	}
	
	@Test(priority =20,dependsOnMethods = {"validEditDocuments"})
	public void validDeleteDocuments() {
		
		DocumentsPage documentsPage = new DocumentsPage();
		documentsPage.reloadDocumentsPage();
		//SKIPPED//citiesPage.clickDeleteDocumentsButtonByOrder(0);
		documentsPage.clickDeleteDocumentsButtonByDocumentsNameArabic("استخدام_وحدة_افتراضية_1_معدلة");
		documentsPage.clickDeleteDocumentsConfirmButton();
		Assert.assertTrue(documentsPage.deleteDocumentsSuccessMessageIsDisplayed());
		
		}

}
