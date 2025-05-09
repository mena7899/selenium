package com.rivtrans.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rivtrans.base.BaseTest;
import com.rivtrans.pages.HomePage;
import com.rivtrans.pages.JobsPage;

public class JobsTest extends BaseTest {
	
	@Test(priority =1,dependsOnMethods = {"com.rivtrans.tests.HomeTest.validLoginVisbleLogo"})
	public void validAddJobs()  {
		HomePage homePage = loginPage.validLogin("ramadan", "123456");
		JobsPage jobsPage = homePage.sidePanel.clickJobsButton();
		homePage.sidePanel.clickLicensesButton();
		homePage.sidePanel.clickMainDataButton();
		jobsPage.select100Row();
		jobsPage.clickAddJobsButton();
		jobsPage.addJobsWindowSetArabicName("وظيفة_افتراضية_1");
		//SKIPPEDjobsPage.addJobsWindowSetEnglishName("virtual_jobs_1");
		jobsPage.addJobsWindowSetDescription("وصف_description");
		jobsPage.addJobsWindowSelectStatusArabic("نشط");
		jobsPage.addJobsWindowClickAddButton();
		Assert.assertTrue(jobsPage.addJobsSuccessMessageIsDisplayed());
		//SKIPPEDjobsPage.clickCloseSuccessMessage();

	}
	
	
	@Test(priority =2,dependsOnMethods = {"validAddJobs"})
	public void validEditJobs()  {
		JobsPage jobsPage = new JobsPage();
		jobsPage.reloadJobsPage();
		//SKIPPEDcitiesPage.clickEditJobsButtonByOrder(0);
		jobsPage.clickEditJobsButtonByJobsNameArabic("وظيفة_افتراضية_1");
		jobsPage.editJobsWindowSetArabicName("وظيفة_افتراضية_معدلة_1");
		//SKIPPEDjobsPage.editJobsWindowSetEnglishName("virtual_jobs_1_edited");
		jobsPage.editJobsWindowClickUpdateButton();
		Assert.assertTrue(jobsPage.editJobsSuccessMessageIsDisplayed());

	}
	
	@Test(priority =3,dependsOnMethods = {"validEditJobs"})
	public void validDeleteJobs() {
		
		JobsPage jobsPage = new JobsPage();
		jobsPage.reloadJobsPage();
		//SKIPPEDcitiesPage.clickDeleteJobsButtonByOrder(0);
		jobsPage.clickDeleteJobsButtonByJobsNameArabic("وظيفة_افتراضية_معدلة_1");
		jobsPage.clickDeleteJobsConfirmButton();
		Assert.assertTrue(jobsPage.deleteJobsSuccessMessageIsDisplayed());
		
	}
}