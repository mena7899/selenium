package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;

public class UnitNaturePage extends BasePage {

	//add unit nature buttons
	private By add_unit_nature_button = By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']");
	private By add_unit_nature_window_arabic_name_input = By.cssSelector("input[formcontrolname='natureNameAr']");
	private By add_unit_nature_window_english_name_input = By.cssSelector("input[formcontrolname='natureNameEn']");
	private By add_unit_nature_window_description_input = By.cssSelector("textarea[formcontrolname='natureDescription']");
	private By add_unit_nature_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='status']");
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
	
	//rows number methods
	public void select100Row() {
		click(rows_number_drop_down_list);
		find(rows_number_drop_down_list_options_box).findElement(By.cssSelector(":nth-child(4)")).click();
		//find(rows_number_drop_down_list_options_box).findElement(By.cssSelector(":nth-child(4)")).click();
	}
	
	
	
	// success message close button
	private By success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//click close success message
	public void clickCloseSuccessMessage() {
		click(success_message_close_button);
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////
	//add unit nature methods
	public void clickAddUnitNatureButton() {
		click(add_unit_nature_button);
	}
	
	public void addUnitNatureWindowSetArabicName(String arabic_name) {
		set(add_unit_nature_window_arabic_name_input, arabic_name);
	}
	
	public void addUnitNatureWindowSetEnglishName(String english_name) {
		set(add_unit_nature_window_english_name_input, english_name);
	}
	
	public void addUnitNatureWindowSelectStatus(String arabic_name,String english_name)   {
		click(add_unit_nature_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s' or contains(text(), '%s')]", statusEnglish, statusArabic);
		click(By.xpath(xpathExpression));
		
	}
	
	public void addUnitNatureWindowSetDescription(String description) {
		set(add_unit_nature_window_description_input, description);
	}
	
	public void addUnitNatureWindowSelectStatusArabic(String arabic_name) {
		click(add_unit_nature_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		click(By.xpath(xpathExpression));
		
	}
	
	public void addUnitNatureWindowSelectStatusEnglish(String english_name) {
		click(add_unit_nature_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),  '%s']", statusEnglish);
		click(By.xpath(xpathExpression));
		
	}
	

	
	public void addUnitNatureWindowClickAddButton() {
		
		click(add_unit_nature_window_add_button);
	}
	
	public boolean addUnitNatureSuccessMessageIsDisplayed() {		
		
		return find(add_unit_nature_success_message).isDisplayed();
	}
	
	public void clickAddUnitNatureSuccessMessageCloseButton() {
		
		click(add_unit_nature_success_message_close_button);	
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
		String xpathExpression = String.format("//span[contains(text(),or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				click(next_rows_button);
				clickDeleteUnitNatureButtonByUnitNatureName(arabicName,english_name);
		} else {
			
			find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]")).click();
			
		}
	}
	
	public void clickDeleteUnitNatureButtonByUnitNatureNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				click(next_rows_button);
				clickDeleteUnitNatureButtonByUnitNatureNameArabic(arabicName);
		} else {
			
			find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]")).click();
			
		}
	}
	
	public void clickDeleteUnitNatureButtonByUnitNatureNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				click(next_rows_button);
				clickDeleteUnitNatureButtonByUnitNatureNameEnglish(englishName);
		} else {
			
			find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]")).click();
			
		}
	}
	
	public void clickDeleteUnitNatureConfirmButton() {
		click(delete_unit_nature_confirm_button);
		
	}
	
	public boolean deleteUnitNatureSuccessMessageIsDisplayed() {		
		
		return find(delete_unit_nature_success_message).isDisplayed();
	}
	
	public void clickDeleteUnitNatureSuccessMessageCloseButton() {
		
		click(delete_unit_nature_success_message_close_button);	
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
		String xpathExpression = String.format("//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				click(next_rows_button);
				clickDeleteUnitNatureButtonByUnitNatureName(arabicName,english_name);
		} else {
			
			find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[2]")).click();
			
		}
	}
	
	public void clickEditUnitNatureButtonByUnitNatureNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				click(next_rows_button);
				clickEditUnitNatureButtonByUnitNatureNameArabic(arabicName);
		} else {
			
			find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[2]")).click();
			
		}
	}
	public void clickEditUnitNatureButtonByUnitNatureNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				click(next_rows_button);
				clickEditUnitNatureButtonByUnitNatureNameArabic(englishName);
		} else {
			
			find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[2]")).click();
			
		}
	}
	
	public void editUnitNatureWindowSetArabicName(String arabic_name) {
		set(edit_unit_nature_window_arabic_name_input, arabic_name);
	}
	
	public void editUnitNatureWindowSetEnglishName(String english_name) {
		set(edit_unit_nature_window_english_name_input, english_name);
	}
	
	public void editUnitNatureWindowSelectStatus(String arabic_name,String english_name)  {
		click(edit_unit_nature_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish, statusArabic);
		click(By.xpath(xpathExpression));
		
	}
	
	public void editUnitNatureWindowSelectStatusArabic(String arabic_name) {
		click(edit_unit_nature_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		click(By.xpath(xpathExpression));
		
	}
	
	public void editUnitNatureWindowSelectStatusEnglish(String english_name) {
		click(edit_unit_nature_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish);
		click(By.xpath(xpathExpression));
		
	}
	

	
	public void editUnitNatureWindowClickUpdateButton() {
		
		click(edit_unit_nature_window_update_button);
	}
	
	public boolean editUnitNatureSuccessMessageIsDisplayed() {		
		
		return find(edit_unit_nature_success_message).isDisplayed();
	}
	
	
	public void clickEditUnitNatureSuccessMessageCloseButton() {
		
		click(edit_unit_nature_success_message_close_button);	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	


}
