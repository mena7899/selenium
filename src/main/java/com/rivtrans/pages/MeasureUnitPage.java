package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.JavaScriptUtility;
import com.rivtrans.utilities.WaitUtility;

public class MeasureUnitPage extends BasePage{

	//add unit use buttons
	private By add_measure_unit_button = By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']> :first-child");
	private By add_measure_unit_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By add_measure_unit_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By add_measure_unit_window_conversion_rate_input = By.cssSelector("input[formcontrolname='conversionFactor']");
	private By add_measure_unit_window_standard_unit_checkbox = By.cssSelector("mat-dialog-container[role='dialog'] input[type='checkbox']");
	private By add_measure_unit_window_measure_type_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='unitTypeId']");
	private By add_measure_unit_window_add_button = By.xpath("//span[normalize-space(text())='save' or normalize-space(text())='إضافة']");
	private By add_measure_unit_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By add_measure_unit_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//delete unit use buttons
	private By delete_measure_unit_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font delete-icon mat-icon-no-color\']"); //delete buttons list
	private By delete_measure_unit_confirm_button =By.xpath("//span[normalize-space(text())='delete' or normalize-space(text())='حذف']");
	private By delete_measure_unit_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By delete_measure_unit_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//edit unit use buttons
	private By edit_measure_unit_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font edit-icon mat-icon-no-color\']"); //edit buttons list
	private By edit_measure_unit_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By edit_measure_unit_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By edit_measure_unit_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='isActive']");
	private By edit_measure_unit_window_update_button = By.xpath("//span[normalize-space(text())='update' or normalize-space(text())='تحديث']");
	private By edit_measure_unit_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By edit_measure_unit_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	
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
	public void clickAddMeasureUnitButton() {
		findToClick(add_measure_unit_button);
		JavaScriptUtility.clickJS(add_measure_unit_button);
	}
	
	public void addMeasureUnitWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.setJS(add_measure_unit_window_arabic_name_input, arabic_name);
	}
	
	public void addMeasureUnitWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(add_measure_unit_window_english_name_input, english_name);
	}
	
	public void addMeasureUnitWindowSelectMeasureType(String arabic_name,String english_name)   {
		JavaScriptUtility.clickJS(add_measure_unit_window_measure_type_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s' or contains(text(), '%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void addMeasureUnitWindowSelectMeasureTypeArabic(String arabic_name) {
		JavaScriptUtility.clickJS(add_measure_unit_window_measure_type_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addMeasureUnitWindowSelectMeasureTypeEnglish(String english_name) {
		JavaScriptUtility.clickJS(add_measure_unit_window_measure_type_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),  '%s']", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addMeasureUnitWindowSetConversionRate(String rate) {
		JavaScriptUtility.setJS(add_measure_unit_window_conversion_rate_input, rate);
	}
	public void addMeasureUnitWindowClickStandaradUnitCheckbox() {
		JavaScriptUtility.clickJS(add_measure_unit_window_standard_unit_checkbox);
	}
	
	public void addMeasureUnitWindowClickAddButton() {
		
		JavaScriptUtility.clickJS(add_measure_unit_window_add_button);
	}
	
	public boolean addMeasureUnitSuccessMessageIsDisplayed() {		
		
		return find(add_measure_unit_success_message).isDisplayed();
	}
	
	public void clickAddMeasureUnitSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(add_measure_unit_success_message_close_button);	
	}
	/////////////////////////////////////////////////////////////////////////////////////
	///
	///
	
	
	//delete unit use methods
	public void clickDeleteMeasureUnitButtonByOrder(int order) {
		clickOfList(delete_measure_unit_buttons,order);
		
	}
	
	public void clickDeleteMeasureUnitButtonByMeasureUnitName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@cell='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteMeasureUnitButtonByMeasureUnitName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickDeleteMeasureUnitButtonByMeasureUnitNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteMeasureUnitButtonByMeasureUnitNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickDeleteMeasureUnitButtonByMeasureUnitNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteMeasureUnitButtonByMeasureUnitNameEnglish(englishName);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]")).JavaScriptUtility.clickJS();
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickDeleteMeasureUnitConfirmButton() {
		JavaScriptUtility.clickJS(delete_measure_unit_confirm_button);
		
	}
	
	public boolean deleteMeasureUnitSuccessMessageIsDisplayed() {		
		
		return find(delete_measure_unit_success_message).isDisplayed();
	}
	
	public void clickDeleteMeasureUnitSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(delete_measure_unit_success_message_close_button);	
	}
	//////////////////////////////////////////////////////////////////////
	///
	///
	
	//edit unit use methods

	public void clickEditMeasureUnitButtonByOrder(int order) {
		clickOfList(edit_measure_unit_buttons,order);
		
	}
	
	public void clickEditMeasureUnitButtonByMeasureUnitName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@role='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteMeasureUnitButtonByMeasureUnitName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void clickEditMeasureUnitButtonByMeasureUnitNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[text()='%s']", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditMeasureUnitButtonByMeasureUnitNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	public void clickEditMeasureUnitButtonByMeasureUnitNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditMeasureUnitButtonByMeasureUnitNameArabic(englishName);
		} else {
			 WaitUtility.fluentWaitUntilVisibleAndClickable(2500, By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"), 500);
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[1]"));
			
		}
	}
	
	public void editMeasureUnitWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.setJS(edit_measure_unit_window_arabic_name_input, arabic_name);
	}
	
	public void editMeasureUnitWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(edit_measure_unit_window_english_name_input, english_name);
	}
	
	public void editMeasureUnitWindowSelectStatus(String arabic_name,String english_name)  {
		JavaScriptUtility.clickJS(edit_measure_unit_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editMeasureUnitWindowSelectStatusArabic(String arabic_name) {
		JavaScriptUtility.clickJS(edit_measure_unit_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editMeasureUnitWindowSelectStatusEnglish(String english_name) {
		JavaScriptUtility.clickJS(edit_measure_unit_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void editMeasureUnitWindowClickUpdateButton() {
		
		JavaScriptUtility.clickJS(edit_measure_unit_window_update_button);
	}
	
	public boolean editMeasureUnitSuccessMessageIsDisplayed() {		
		
		return find(edit_measure_unit_success_message).isDisplayed();
	}
	
	
	public void clickEditMeasureUnitSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(edit_measure_unit_success_message_close_button);	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	///
	
	public void reloadMeasureUnitPage() {
		JavaScriptUtility.reloadPageJS();
		
	}
	


}
