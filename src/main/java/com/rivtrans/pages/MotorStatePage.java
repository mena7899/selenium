package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.JavaScriptUtility;

public class MotorStatePage extends BasePage {
	//add motor state buttons
	private By add_motor_state_button = By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']> :first-child");
	private By add_motor_state_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By add_motor_state_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By add_motor_state_window_description_input = By.cssSelector("textarea[formcontrolname='description']");
	private By add_motor_state_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='isActive']");
	private By add_motor_state_window_add_button = By.xpath("//span[normalize-space(text())='save' or normalize-space(text())='حفظ']");
	private By add_motor_state_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By add_motor_state_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//delete motor state buttons
	private By delete_motor_state_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font delete-icon mat-icon-no-color\']"); //delete buttons list
	private By delete_motor_state_confirm_button =By.xpath("//span[normalize-space(text())='delete' or normalize-space(text())='حذف']");
	private By delete_motor_state_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By delete_motor_state_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//edit motor state buttons
	private By edit_motor_state_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font edit-icon mat-icon-no-color\']"); //edit buttons list
	private By edit_motor_state_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By edit_motor_state_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By edit_motor_state_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='isActive']");
	private By edit_motor_state_window_update_button = By.xpath("//span[normalize-space(text())='update' or normalize-space(text())='تحديث']");
	private By edit_motor_state_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By edit_motor_state_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	
	//next rows button
	
	private By next_rows_button = By.xpath("//mat-icon[contains(text() ,'chevron_right')]/parent::*");


	//row number button
	private By rows_number_drop_down_list=By.cssSelector("mat-select[aria-haspopup='listbox']");
	private By rows_number_drop_down_list_options_box=By.cssSelector("div[role='listbox']");
	private By rows_number_drop_down_list_100_row_option = By.xpath("//div[@role='listbox']/*[4]");
	
	//rows number methods
	public void select100Row() {
		//findToClick(rows_number_drop_down_list);
		JavaScriptUtility.clickJS(rows_number_drop_down_list);
		//findToClick(rows_number_drop_down_list_100_row_option);
		JavaScriptUtility.clickJS(rows_number_drop_down_list_100_row_option);
		//find(rows_number_drop_down_list_options_box).findElement(By.cssSelector(":nth-child(4)")).JavaScriptUtility.clickJS();
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	///
	///
	///
	///
	

	
	
	//add motor state methods
	public void clickAddMotorStateButton() {
		//findToClick(add_motor_state_button);
		JavaScriptUtility.clickJS(add_motor_state_button);
	}
	
	public void addMotorStateWindowSetArabicName(String arabic_name) {
		//JavaScriptUtility.clickJS(add_motor_state_window_arabic_name_input);
		JavaScriptUtility.setJS(add_motor_state_window_arabic_name_input, arabic_name);
	}
	
	public void addMotorStateWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(add_motor_state_window_english_name_input, english_name);
	}
	
	public void addMotorStateWindowSelectStatus(String arabic_name,String english_name)   {
		JavaScriptUtility.clickJS(add_motor_state_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s' or contains(text(), '%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addMotorStateWindowSetDescription(String description) {
		//JavaScriptUtility.clickJS(add_motor_state_window_description_input);
		JavaScriptUtility.setJS(add_motor_state_window_description_input, description);
	}
	
	public void addMotorStateWindowSelectStatusArabic(String arabic_name) {
		JavaScriptUtility.clickJS(add_motor_state_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addMotorStateWindowSelectStatusEnglish(String english_name) {
		JavaScriptUtility.clickJS(add_motor_state_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),  '%s']", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void addMotorStateWindowClickAddButton() {
		
		JavaScriptUtility.clickJS(add_motor_state_window_add_button);
	}
	
	public boolean addMotorStateSuccessMessageIsDisplayed() {		
		
		return find(add_motor_state_success_message).isDisplayed();
	}
	
	
	public void clickAddMotorStateSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(add_motor_state_success_message_close_button);	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	///
	///
	
	
	//delete motor state methods
	public void clickDeleteMotorStateButtonByOrder(int order) {
		clickOfList(delete_motor_state_buttons,order);
		
	}
	
	public void clickDeleteMotorStateButtonByMotorStateName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
			JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteMotorStateButtonByMotorStateName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteMotorStateButtonByMotorStateNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteMotorStateButtonByMotorStateNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteMotorStateButtonByMotorStateNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteMotorStateButtonByMotorStateNameEnglish(englishName);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]")).JavaScriptUtility.clickJS();
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteMotorStateConfirmButton() {
		JavaScriptUtility.clickJS(delete_motor_state_confirm_button);
		
	}
	
	public boolean deleteMotorStateSuccessMessageIsDisplayed() {		
		
		return find(delete_motor_state_success_message).isDisplayed();
	}
	
	
	public void clickDeleteMotorStateSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(delete_motor_state_success_message_close_button);	
	}
	//////////////////////////////////////////////////////////////////////
	///
	///
	
	//edit motor state methods

	public void clickEditMotorStateButtonByOrder(int order) {
		clickOfList(edit_motor_state_buttons,order);
		
	}
	
	public void clickEditMotorStateButtonByMotorStateName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteMotorStateButtonByMotorStateName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickEditMotorStateButtonByMotorStateNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditMotorStateButtonByMotorStateNameArabic(arabicName);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[2]")).JavaScriptUtility.clickJS();
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	public void clickEditMotorStateButtonByMotorStateNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
			JavaScriptUtility.clickJS(next_rows_button);
				clickEditMotorStateButtonByMotorStateNameArabic(englishName);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[2]")).JavaScriptUtility.clickJS();
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void editMotorStateWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.setJS(edit_motor_state_window_arabic_name_input, arabic_name);
	}
	
	public void editMotorStateWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(edit_motor_state_window_english_name_input, english_name);
	}
	
	public void editMotorStateWindowSelectStatus(String arabic_name,String english_name)  {
		JavaScriptUtility.clickJS(edit_motor_state_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editMotorStateWindowSelectStatusArabic(String arabic_name) {
		JavaScriptUtility.clickJS(edit_motor_state_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editMotorStateWindowSelectStatusEnglish(String english_name) {
		JavaScriptUtility.clickJS(edit_motor_state_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void editMotorStateWindowClickUpdateButton() {
		
		JavaScriptUtility.clickJS(edit_motor_state_window_update_button);
	}
	
	public boolean editMotorStateSuccessMessageIsDisplayed() {		
		
		return find(edit_motor_state_success_message).isDisplayed();
	}
	
	
	public void clickEditMotorStateSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(edit_motor_state_success_message_close_button);	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	public void reloadMotorStatePage() {
		
		reloadPage();
	}


}
