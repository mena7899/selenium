package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.JavaScriptUtility;

public class JobsPage extends BasePage {

	//add unit nature buttons
	private By add_jobs_button = By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']> :first-child");
	private By add_jobs_window_arabic_name_input = By.cssSelector("input[formcontrolname='jobNameAr']");
	private By add_jobs_window_english_name_input = By.cssSelector("input[formcontrolname='natureNameEn']");
	private By add_jobs_window_description_input = By.cssSelector("textarea[formcontrolname='jobDescription']");
	private By add_jobs_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='jobStatus']");
	private By add_jobs_window_add_button = By.xpath("//span[normalize-space(text())='save' or normalize-space(text())='حفظ']");
	private By add_jobs_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By add_jobs_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//delete unit nature buttons
	private By delete_jobs_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font delete-icon mat-icon-no-color\']"); //delete buttons list
	private By delete_jobs_confirm_button =By.xpath("//span[normalize-space(text())='delete' or normalize-space(text())='حذف']");
	private By delete_jobs_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By delete_jobs_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//edit unit nature buttons
	private By edit_jobs_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font edit-icon mat-icon-no-color\']"); //edit buttons list
	private By edit_jobs_window_arabic_name_input = By.cssSelector("input[formcontrolname='jobNameAr']");
	private By edit_jobs_window_english_name_input = By.cssSelector("input[formcontrolname='natureNameEn']");
	private By edit_jobs_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='jobStatus']");
	private By edit_jobs_window_update_button = By.xpath("//span[normalize-space(text())='update' or normalize-space(text())='تحديث']");
	private By edit_jobs_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By edit_jobs_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	
	//next rows button
	
	private By next_rows_button = By.xpath("//mat-icon[contains(text() ,'chevron_right')]/parent::*");
	
	//row number button
	private By rows_number_drop_down_list=By.cssSelector("mat-select[aria-haspopup='listbox']");
	private By rows_number_drop_down_list_options_box=By.cssSelector("div[role='listbox']");
	private By rows_number_drop_down_list_100_row_option = By.xpath("//div[@role='listbox']/*[4]");
	
	//rows number methods
	public void select100Row() {
		findToClick(rows_number_drop_down_list);
		JavaScriptUtility.clickJS(rows_number_drop_down_list);
		findToClick(rows_number_drop_down_list_100_row_option);
		JavaScriptUtility.clickJS(rows_number_drop_down_list_100_row_option);
		//find(rows_number_drop_down_list_options_box).findElement(By.cssSelector(":nth-child(4)")).JavaScriptUtility.clickJS();
		
	}
	

	
	// success message close button
	private By success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//click close success message
	public void clickCloseSuccessMessage() {
		JavaScriptUtility.clickJS(success_message_close_button);
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////
	//add unit nature methods
	public void clickAddJobsButton() {
		findToClick(add_jobs_button);
		JavaScriptUtility.clickJS(add_jobs_button);
	}
	
	public void addJobsWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.setJS(add_jobs_window_arabic_name_input, arabic_name);
	}
	
	public void addJobsWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(add_jobs_window_english_name_input, english_name);
	}
	
	public void addJobsWindowSelectStatus(String arabic_name,String english_name)   {
		JavaScriptUtility.clickJS(add_jobs_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s' or contains(text(), '%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addJobsWindowSetDescription(String description) {
		JavaScriptUtility.setJS(add_jobs_window_description_input, description);
	}
	
	public void addJobsWindowSelectStatusArabic(String arabic_name) {
		JavaScriptUtility.clickJS(add_jobs_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addJobsWindowSelectStatusEnglish(String english_name) {
		JavaScriptUtility.clickJS(add_jobs_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),  '%s']", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void addJobsWindowClickAddButton() {
		
		JavaScriptUtility.clickJS(add_jobs_window_add_button);
	}
	
	public boolean addJobsSuccessMessageIsDisplayed() {		
		
		return find(add_jobs_success_message).isDisplayed();
	}
	
	public void clickAddJobsSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(add_jobs_success_message_close_button);	
	}
	/////////////////////////////////////////////////////////////////////////////////////
	///
	///
	
	
	//delete unit nature methods
	public void clickDeleteJobsButtonByOrder(int order) {
		clickOfList(delete_jobs_buttons,order);
		
	}
	
	public void clickDeleteJobsButtonByJobsName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@cell='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteJobsButtonByJobsName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteJobsButtonByJobsNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteJobsButtonByJobsNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteJobsButtonByJobsNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteJobsButtonByJobsNameEnglish(englishName);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]")).JavaScriptUtility.clickJS();
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteJobsConfirmButton() {
		JavaScriptUtility.clickJS(delete_jobs_confirm_button);
		
	}
	
	public boolean deleteJobsSuccessMessageIsDisplayed() {		
		
		return find(delete_jobs_success_message).isDisplayed();
	}
	
	public void clickDeleteJobsSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(delete_jobs_success_message_close_button);	
	}
	//////////////////////////////////////////////////////////////////////
	///
	///
	
	//edit unit nature methods

	public void clickEditJobsButtonByOrder(int order) {
		clickOfList(edit_jobs_buttons,order);
		
	}
	
	public void clickEditJobsButtonByJobsName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@role='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteJobsButtonByJobsName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickEditJobsButtonByJobsNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditJobsButtonByJobsNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	public void clickEditJobsButtonByJobsNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditJobsButtonByJobsNameEnglish(englishName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void editJobsWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.setJS(edit_jobs_window_arabic_name_input, arabic_name);
	}
	
	public void editJobsWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(edit_jobs_window_english_name_input, english_name);
	}
	
	public void editJobsWindowSelectStatus(String arabic_name,String english_name)  {
		JavaScriptUtility.clickJS(edit_jobs_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editJobsWindowSelectStatusArabic(String arabic_name) {
		JavaScriptUtility.clickJS(edit_jobs_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editJobsWindowSelectStatusEnglish(String english_name) {
		JavaScriptUtility.clickJS(edit_jobs_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void editJobsWindowClickUpdateButton() {
		
		JavaScriptUtility.clickJS(edit_jobs_window_update_button);
	}
	
	public boolean editJobsSuccessMessageIsDisplayed() {		
		
		return find(edit_jobs_success_message).isDisplayed();
	}
	
	
	public void clickEditJobsSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(edit_jobs_success_message_close_button);	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	///
	
	public void reloadJobsPage() {
		
		reloadPage();
	}
	


}
