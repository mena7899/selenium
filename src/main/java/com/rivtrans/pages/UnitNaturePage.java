package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.JavaScriptUtility;

public class UnitNaturePage extends BasePage {

	//add unit nature buttons
	private By add_unit_nature_button = By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']> :first-child");
	private By add_unit_nature_window_arabic_name_input = By.cssSelector("input[formcontrolname='natureNameAr']");
	private By add_unit_nature_window_english_name_input = By.cssSelector("input[formcontrolname='natureNameEn']");
	private By add_unit_nature_window_description_input = By.cssSelector("textarea[formcontrolname='natureDescription']");
	private By add_unit_nature_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='isActive']");
	private By add_unit_nature_window_add_button = By.xpath("//span[normalize-space(text())='save' or normalize-space(text())='حفظ']");
	private By add_unit_nature_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By add_unit_nature_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//delete unit nature buttons
	private By delete_unit_nature_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font delete-icon mat-icon-no-color\']"); //delete buttons list
	private By delete_unit_nature_confirm_button =By.xpath("//span[normalize-space(text())='delete' or normalize-space(text())='حذف']");
	private By delete_unit_nature_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By delete_unit_nature_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//edit unit nature buttons
	private By edit_unit_nature_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font edit-icon mat-icon-no-color\']"); //edit buttons list
	private By edit_unit_nature_window_arabic_name_input = By.cssSelector("input[formcontrolname='natureNameAr']");
	private By edit_unit_nature_window_english_name_input = By.cssSelector("input[formcontrolname='natureNameEn']");
	private By edit_unit_nature_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='status']");
	private By edit_unit_nature_window_update_button = By.xpath("//span[normalize-space(text())='update' or normalize-space(text())='تحديث']");
	private By edit_unit_nature_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By edit_unit_nature_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	
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
	public void clickAddUnitNatureButton() {
		findToClick(add_unit_nature_button);
		JavaScriptUtility.clickJS(add_unit_nature_button);
	}
	
	public void addUnitNatureWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.setJS(add_unit_nature_window_arabic_name_input, arabic_name);
	}
	
	public void addUnitNatureWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(add_unit_nature_window_english_name_input, english_name);
	}
	
	public void addUnitNatureWindowSelectStatus(String arabic_name,String english_name)   {
		JavaScriptUtility.clickJS(add_unit_nature_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s' or contains(text(), '%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addUnitNatureWindowSetDescription(String description) {
		JavaScriptUtility.setJS(add_unit_nature_window_description_input, description);
	}
	
	public void addUnitNatureWindowSelectStatusArabic(String arabic_name) {
		JavaScriptUtility.clickJS(add_unit_nature_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addUnitNatureWindowSelectStatusEnglish(String english_name) {
		JavaScriptUtility.clickJS(add_unit_nature_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),  '%s']", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void addUnitNatureWindowClickAddButton() {
		
		JavaScriptUtility.clickJS(add_unit_nature_window_add_button);
	}
	
	public boolean addUnitNatureSuccessMessageIsDisplayed() {		
		
		return find(add_unit_nature_success_message).isDisplayed();
	}
	
	public void clickAddUnitNatureSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(add_unit_nature_success_message_close_button);	
	}
	/////////////////////////////////////////////////////////////////////////////////////
	///
	///
	
	
	//delete unit nature methods
	public void clickDeleteUnitNatureButtonByOrder(int order) {
		clickOfList(delete_unit_nature_buttons,order);
		
	}
	
	public void clickDeleteUnitNatureButtonByUnitNatureName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@cell='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteUnitNatureButtonByUnitNatureName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteUnitNatureButtonByUnitNatureNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteUnitNatureButtonByUnitNatureNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteUnitNatureButtonByUnitNatureNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteUnitNatureButtonByUnitNatureNameEnglish(englishName);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]")).JavaScriptUtility.clickJS();
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteUnitNatureConfirmButton() {
		JavaScriptUtility.clickJS(delete_unit_nature_confirm_button);
		
	}
	
	public boolean deleteUnitNatureSuccessMessageIsDisplayed() {		
		
		return find(delete_unit_nature_success_message).isDisplayed();
	}
	
	public void clickDeleteUnitNatureSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(delete_unit_nature_success_message_close_button);	
	}
	//////////////////////////////////////////////////////////////////////
	///
	///
	
	//edit unit nature methods

	public void clickEditUnitNatureButtonByOrder(int order) {
		clickOfList(edit_unit_nature_buttons,order);
		
	}
	
	public void clickEditUnitNatureButtonByUnitNatureName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@role='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteUnitNatureButtonByUnitNatureName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickEditUnitNatureButtonByUnitNatureNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditUnitNatureButtonByUnitNatureNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	public void clickEditUnitNatureButtonByUnitNatureNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditUnitNatureButtonByUnitNatureNameEnglish(englishName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void editUnitNatureWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.setJS(edit_unit_nature_window_arabic_name_input, arabic_name);
	}
	
	public void editUnitNatureWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(edit_unit_nature_window_english_name_input, english_name);
	}
	
	public void editUnitNatureWindowSelectStatus(String arabic_name,String english_name)  {
		JavaScriptUtility.clickJS(edit_unit_nature_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editUnitNatureWindowSelectStatusArabic(String arabic_name) {
		JavaScriptUtility.clickJS(edit_unit_nature_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editUnitNatureWindowSelectStatusEnglish(String english_name) {
		JavaScriptUtility.clickJS(edit_unit_nature_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void editUnitNatureWindowClickUpdateButton() {
		
		JavaScriptUtility.clickJS(edit_unit_nature_window_update_button);
	}
	
	public boolean editUnitNatureSuccessMessageIsDisplayed() {		
		
		return find(edit_unit_nature_success_message).isDisplayed();
	}
	
	
	public void clickEditUnitNatureSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(edit_unit_nature_success_message_close_button);	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	///
	
	public void reloadUnitNaturePage() {
		
		reloadPage();
	}
	


}
