package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.JavaScriptUtility;

public class RiverUnitPage extends BasePage{


	//add unit use buttons
	private By add_unit_use_button = By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']> :first-child");
	private By add_unit_use_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By add_unit_use_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By add_unit_use_window_description_input = By.cssSelector("textarea[formcontrolname='description']");
	private By add_unit_use_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='isActive']");
	private By add_unit_use_window_add_button = By.xpath("//span[normalize-space(text())='save' or normalize-space(text())='إضافة']");
	private By add_unit_use_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By add_unit_use_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//delete unit use buttons
	private By delete_unit_use_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font delete-icon mat-icon-no-color\']"); //delete buttons list
	private By delete_unit_use_confirm_button =By.xpath("//span[normalize-space(text())='delete' or normalize-space(text())='حذف']");
	private By delete_unit_use_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By delete_unit_use_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//edit unit use buttons
	private By edit_unit_use_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font edit-icon mat-icon-no-color\']"); //edit buttons list
	private By edit_unit_use_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By edit_unit_use_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By edit_unit_use_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='isActive']");
	private By edit_unit_use_window_update_button = By.xpath("//span[normalize-space(text())='update' or normalize-space(text())='تحديث']");
	private By edit_unit_use_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By edit_unit_use_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	
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
	public void clickAddUnitUseButton() {
		findToClick(add_unit_use_button);
		JavaScriptUtility.clickJS(add_unit_use_button);
	}
	
	public void addUnitUseWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.setJS(add_unit_use_window_arabic_name_input, arabic_name);
	}
	
	public void addUnitUseWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(add_unit_use_window_english_name_input, english_name);
	}
	
	public void addUnitUseWindowSelectStatus(String arabic_name,String english_name)   {
		JavaScriptUtility.clickJS(add_unit_use_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s' or contains(text(), '%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addUnitUseWindowSetDescription(String description) {
		JavaScriptUtility.setJS(add_unit_use_window_description_input, description);
	}
	
	public void addUnitUseWindowSelectStatusArabic(String arabic_name) {
		JavaScriptUtility.clickJS(add_unit_use_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addUnitUseWindowSelectStatusEnglish(String english_name) {
		JavaScriptUtility.clickJS(add_unit_use_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),  '%s']", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void addUnitUseWindowClickAddButton() {
		
		JavaScriptUtility.clickJS(add_unit_use_window_add_button);
	}
	
	public boolean addUnitUseSuccessMessageIsDisplayed() {		
		
		return find(add_unit_use_success_message).isDisplayed();
	}
	
	public void clickAddUnitUseSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(add_unit_use_success_message_close_button);	
	}
	/////////////////////////////////////////////////////////////////////////////////////
	///
	///
	
	
	//delete unit use methods
	public void clickDeleteUnitUseButtonByOrder(int order) {
		clickOfList(delete_unit_use_buttons,order);
		
	}
	
	public void clickDeleteUnitUseButtonByUnitUseName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@cell='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteUnitUseButtonByUnitUseName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteUnitUseButtonByUnitUseNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteUnitUseButtonByUnitUseNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteUnitUseButtonByUnitUseNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteUnitUseButtonByUnitUseNameEnglish(englishName);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]")).JavaScriptUtility.clickJS();
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickDeleteUnitUseConfirmButton() {
		JavaScriptUtility.clickJS(delete_unit_use_confirm_button);
		
	}
	
	public boolean deleteUnitUseSuccessMessageIsDisplayed() {		
		
		return find(delete_unit_use_success_message).isDisplayed();
	}
	
	public void clickDeleteUnitUseSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(delete_unit_use_success_message_close_button);	
	}
	//////////////////////////////////////////////////////////////////////
	///
	///
	
	//edit unit use methods

	public void clickEditUnitUseButtonByOrder(int order) {
		clickOfList(edit_unit_use_buttons,order);
		
	}
	
	public void clickEditUnitUseButtonByUnitUseName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@role='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteUnitUseButtonByUnitUseName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickEditUnitUseButtonByUnitUseNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditUnitUseButtonByUnitUseNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	public void clickEditUnitUseButtonByUnitUseNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditUnitUseButtonByUnitUseNameArabic(englishName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void editUnitUseWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.setJS(edit_unit_use_window_arabic_name_input, arabic_name);
	}
	
	public void editUnitUseWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(edit_unit_use_window_english_name_input, english_name);
	}
	
	public void editUnitUseWindowSelectStatus(String arabic_name,String english_name)  {
		JavaScriptUtility.clickJS(edit_unit_use_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editUnitUseWindowSelectStatusArabic(String arabic_name) {
		JavaScriptUtility.clickJS(edit_unit_use_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editUnitUseWindowSelectStatusEnglish(String english_name) {
		JavaScriptUtility.clickJS(edit_unit_use_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void editUnitUseWindowClickUpdateButton() {
		
		JavaScriptUtility.clickJS(edit_unit_use_window_update_button);
	}
	
	public boolean editUnitUseSuccessMessageIsDisplayed() {		
		
		return find(edit_unit_use_success_message).isDisplayed();
	}
	
	
	public void clickEditUnitUseSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(edit_unit_use_success_message_close_button);	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	///
	
	public void reloadUnitUsePage() {
		
		reloadPage();
	}
	


}
