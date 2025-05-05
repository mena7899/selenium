package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.JavaScriptUtility;

public class AuthoritiesPage extends BasePage{


	//add unit use buttons
	private By add_authorities_button = By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']> :first-child");
	private By add_authorities_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By add_authorities_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By add_authorities_window_tax_number_input = By.cssSelector("input[formcontrolname='taxNumber']");
	private By add_authorities_window_set_logo_file_path = By.cssSelector("input[type='file']");
	private By add_authorities_window_is_main_checkbox = By.cssSelector("mat-dialog-container[role='dialog'] input[type='checkbox']");
	
	private By add_authorities_window_add_button = By.xpath("//span[normalize-space(text())='save' or normalize-space(text())='إضافة']");
	private By add_authorities_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By add_authorities_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//delete unit use buttons
	private By delete_authorities_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font delete-icon mat-icon-no-color\']"); //delete buttons list
	private By delete_authorities_confirm_button =By.xpath("//span[normalize-space(text())='delete' or normalize-space(text())='حذف']");
	private By delete_authorities_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By delete_authorities_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//edit unit use buttons
	private By edit_authorities_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font edit-icon mat-icon-no-color\']"); //edit buttons list
	private By edit_authorities_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By edit_authorities_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By edit_authorities_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='isActive']");
	private By edit_authorities_window_update_button = By.xpath("//span[normalize-space(text())='update' or normalize-space(text())='تحديث']");
	private By edit_authorities_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By edit_authorities_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	
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
	public void clickAddAuthoritiesButton() {
		findToClick(add_authorities_button);
		JavaScriptUtility.clickJS(add_authorities_button);
	}
	
	public void addAuthoritiesWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.setJS(add_authorities_window_arabic_name_input, arabic_name);
	}
	
	public void addAuthoritiesWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(add_authorities_window_english_name_input, english_name);
	}
	
//	public void addAuthoritiesWindowSelectStatus(String arabic_name,String english_name)   {
//		JavaScriptUtility.clickJS(add_authorities_window_status_dropdown_list);
//		String statusEnglish = english_name;
//		String statusArabic = arabic_name;
//		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s' or contains(text(), '%s')]", statusEnglish, statusArabic);
//		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
//		
//	}
	
	public void addAuthoritiesWindowSetTaxNumber(String tax_number) {
		JavaScriptUtility.setJS(add_authorities_window_tax_number_input, tax_number);
	}
	
//	public void addAuthoritiesWindowSelectStatusArabic(String arabic_name) {
//		JavaScriptUtility.clickJS(add_authorities_window_status_dropdown_list);
//		String statusArabic = arabic_name;
//		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
//		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
//		
//	}
	
//	public void addAuthoritiesWindowSelectStatusEnglish(String english_name) {
//		JavaScriptUtility.clickJS(add_authorities_window_status_dropdown_list);
//		String statusEnglish = english_name;
//		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),  '%s']", statusEnglish);
//		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
//		
//	}
	
	public void addAuthoritiesWindowSelectLogoFilePath(String file_path) {
	//JavaScriptUtility.setJS(add_authorities_window_set_logo_file_path,file_path);
	find(add_authorities_window_set_logo_file_path).sendKeys(file_path);

	
}
	
	
	public void addAuthoritiesWindowClickStandaradUnitCheckbox() {
		JavaScriptUtility.clickJS(add_authorities_window_is_main_checkbox);
	}
	

	
	public void addAuthoritiesWindowClickAddButton() {
		
		JavaScriptUtility.clickJS(add_authorities_window_add_button);
	}
	
	public boolean addAuthoritiesSuccessMessageIsDisplayed() {		
		
		return find(add_authorities_success_message).isDisplayed();
	}
	
	public void clickAddAuthoritiesSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(add_authorities_success_message_close_button);	
	}
	/////////////////////////////////////////////////////////////////////////////////////
	///
	///
	
	
	//delete unit use methods
	public void clickDeleteAuthoritiesButtonByOrder(int order) {
		clickOfList(delete_authorities_buttons,order);
		
	}
	
	public void clickDeleteAuthoritiesButtonByAuthoritiesName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@cell='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteAuthoritiesButtonByAuthoritiesName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickDeleteAuthoritiesButtonByAuthoritiesNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteAuthoritiesButtonByAuthoritiesNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickDeleteAuthoritiesButtonByAuthoritiesNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteAuthoritiesButtonByAuthoritiesNameEnglish(englishName);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]")).JavaScriptUtility.clickJS();
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickDeleteAuthoritiesConfirmButton() {
		JavaScriptUtility.clickJS(delete_authorities_confirm_button);
		
	}
	
	public boolean deleteAuthoritiesSuccessMessageIsDisplayed() {		
		
		return find(delete_authorities_success_message).isDisplayed();
	}
	
	public void clickDeleteAuthoritiesSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(delete_authorities_success_message_close_button);	
	}
	//////////////////////////////////////////////////////////////////////
	///
	///
	
	//edit unit use methods

	public void clickEditAuthoritiesButtonByOrder(int order) {
		clickOfList(edit_authorities_buttons,order);
		
	}
	
	public void clickEditAuthoritiesButtonByAuthoritiesName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@role='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteAuthoritiesButtonByAuthoritiesName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickEditAuthoritiesButtonByAuthoritiesNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditAuthoritiesButtonByAuthoritiesNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	public void clickEditAuthoritiesButtonByAuthoritiesNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditAuthoritiesButtonByAuthoritiesNameArabic(englishName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void editAuthoritiesWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.setJS(edit_authorities_window_arabic_name_input, arabic_name);
	}
	
	public void editAuthoritiesWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(edit_authorities_window_english_name_input, english_name);
	}
	
	public void editAuthoritiesWindowSelectStatus(String arabic_name,String english_name)  {
		JavaScriptUtility.clickJS(edit_authorities_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editAuthoritiesWindowSelectStatusArabic(String arabic_name) {
		JavaScriptUtility.clickJS(edit_authorities_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editAuthoritiesWindowSelectStatusEnglish(String english_name) {
		JavaScriptUtility.clickJS(edit_authorities_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void editAuthoritiesWindowClickUpdateButton() {
		
		JavaScriptUtility.clickJS(edit_authorities_window_update_button);
	}
	
	public boolean editAuthoritiesSuccessMessageIsDisplayed() {		
		
		return find(edit_authorities_success_message).isDisplayed();
	}
	
	
	public void clickEditAuthoritiesSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(edit_authorities_success_message_close_button);	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	///
	
	public void reloadAuthoritiesPage() {
		
		reloadPage();
	}
	


}
