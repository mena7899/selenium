package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.JavaScriptUtility;

public class TechnicalEstimatePage extends BasePage{


	//add unit use buttons
	private By add_technical_estimate_button = By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']> :first-child");
	private By add_technical_estimate_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By add_technical_estimate_window_code_input = By.cssSelector("input[formcontrolname='code']");
	private By add_technical_estimate_window_description_input = By.cssSelector("textarea[formcontrolname='description']");
	private By add_technical_estimate_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='isActive']");
	private By add_technical_estimate_window_add_button = By.xpath("//span[normalize-space(text())='save' or normalize-space(text())='إضافة']");
	private By add_technical_estimate_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By add_technical_estimate_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//delete unit use buttons
	private By delete_technical_estimate_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font delete-icon mat-icon-no-color\']"); //delete buttons list
	private By delete_technical_estimate_confirm_button =By.xpath("//span[normalize-space(text())='delete' or normalize-space(text())='حذف']");
	private By delete_technical_estimate_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By delete_technical_estimate_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//edit unit use buttons
	private By edit_technical_estimate_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font edit-icon mat-icon-no-color\']"); //edit buttons list
	private By edit_technical_estimate_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By edit_technical_estimate_window_code_input = By.cssSelector("input[formcontrolname='code']");
	private By edit_technical_estimate_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='isActive']");
	private By edit_technical_estimate_window_update_button = By.xpath("//span[normalize-space(text())='update' or normalize-space(text())='تحديث']");
	private By edit_technical_estimate_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By edit_technical_estimate_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	
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
	//add unit use methods
	public void clickAddTechnicalEstimateButton() {
		findToClick(add_technical_estimate_button);
		JavaScriptUtility.clickJS(add_technical_estimate_button);
	}
	
	public void addTechnicalEstimateWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.setJS(add_technical_estimate_window_arabic_name_input, arabic_name);
	}
	
	public void addTechnicalEstimateWindowSetCode(String code) {
		JavaScriptUtility.setJS(add_technical_estimate_window_code_input, code);
	}
	
	public void addTechnicalEstimateWindowSelectStatus(String arabic_name,String english_name)   {
		JavaScriptUtility.clickJS(add_technical_estimate_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s' or contains(text(), '%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addTechnicalEstimateWindowSetDescription(String description) {
		JavaScriptUtility.setJS(add_technical_estimate_window_description_input, description);
	}
	
	public void addTechnicalEstimateWindowSelectStatusArabic(String arabic_name) {
		JavaScriptUtility.clickJS(add_technical_estimate_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addTechnicalEstimateWindowSelectStatusEnglish(String english_name) {
		JavaScriptUtility.clickJS(add_technical_estimate_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),  '%s']", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void addTechnicalEstimateWindowClickAddButton() {
		
		JavaScriptUtility.clickJS(add_technical_estimate_window_add_button);
	}
	
	public boolean addTechnicalEstimateSuccessMessageIsDisplayed() {		
		
		return find(add_technical_estimate_success_message).isDisplayed();
	}
	
	public void clickAddTechnicalEstimateSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(add_technical_estimate_success_message_close_button);	
	}
	/////////////////////////////////////////////////////////////////////////////////////
	///
	///
	
	
	//delete unit use methods
	public void clickDeleteTechnicalEstimateButtonByOrder(int order) {
		clickOfList(delete_technical_estimate_buttons,order);
		
	}
	
	public void clickDeleteTechnicalEstimateButtonByTechnicalEstimateName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@cell='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteTechnicalEstimateButtonByTechnicalEstimateName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteTechnicalEstimateButtonByTechnicalEstimateNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteTechnicalEstimateButtonByTechnicalEstimateNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteTechnicalEstimateButtonByTechnicalEstimateNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteTechnicalEstimateButtonByTechnicalEstimateNameEnglish(englishName);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]")).JavaScriptUtility.clickJS();
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteTechnicalEstimateConfirmButton() {
		JavaScriptUtility.clickJS(delete_technical_estimate_confirm_button);
		
	}
	
	public boolean deleteTechnicalEstimateSuccessMessageIsDisplayed() {		
		
		return find(delete_technical_estimate_success_message).isDisplayed();
	}
	
	public void clickDeleteTechnicalEstimateSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(delete_technical_estimate_success_message_close_button);	
	}
	//////////////////////////////////////////////////////////////////////
	///
	///
	
	//edit unit use methods

	public void clickEditTechnicalEstimateButtonByOrder(int order) {
		clickOfList(edit_technical_estimate_buttons,order);
		
	}
	
	public void clickEditTechnicalEstimateButtonByTechnicalEstimateName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@role='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteTechnicalEstimateButtonByTechnicalEstimateName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickEditTechnicalEstimateButtonByTechnicalEstimateNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditTechnicalEstimateButtonByTechnicalEstimateNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	public void clickEditTechnicalEstimateButtonByTechnicalEstimateNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditTechnicalEstimateButtonByTechnicalEstimateNameArabic(englishName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void editTechnicalEstimateWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.setJS(edit_technical_estimate_window_arabic_name_input, arabic_name);
	}
	
	public void editTechnicalEstimateWindowSetEnglishName(String code) {
		JavaScriptUtility.setJS(edit_technical_estimate_window_code_input, code);
	}
	
	public void editTechnicalEstimateWindowSelectStatus(String arabic_name,String english_name)  {
		JavaScriptUtility.clickJS(edit_technical_estimate_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editTechnicalEstimateWindowSelectStatusArabic(String arabic_name) {
		JavaScriptUtility.clickJS(edit_technical_estimate_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editTechnicalEstimateWindowSelectStatusEnglish(String english_name) {
		JavaScriptUtility.clickJS(edit_technical_estimate_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void editTechnicalEstimateWindowClickUpdateButton() {
		
		JavaScriptUtility.clickJS(edit_technical_estimate_window_update_button);
	}
	
	public boolean editTechnicalEstimateSuccessMessageIsDisplayed() {		
		
		return find(edit_technical_estimate_success_message).isDisplayed();
	}
	
	
	public void clickEditTechnicalEstimateSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(edit_technical_estimate_success_message_close_button);	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	///
	
	public void reloadTechnicalEstimatePage() {
		
		reloadPage();
	}
	


}
