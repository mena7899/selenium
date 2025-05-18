package com.rivtrans.pages;


import org.openqa.selenium.By;
import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.JavaScriptUtility;


public class RegionsPage extends BasePage {
	//add region buttons
	private By add_region_button = By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']> :first-child");
	private By add_region_window_arabic_name_input = By.cssSelector("input[formcontrolname='name']");
	private By add_region_window_cities_dropdown_list = By.cssSelector("mat-select[formcontrolname='cityId'][role='combobox']");
	private By add_region_window_status_dropdown_list = By.cssSelector("mat-select[formcontrolname='isActive'][role='combobox']");
	private By add_region_window_descriptions_input= By.cssSelector("textarea[formcontrolname='descriptions']");
	private By add_region_window_all_permssions_check_box= By.xpath("//span[text()='صلاحيات تقديم الطلبات']");
	private By add_region_window_main_region_check_box= By.xpath("//label[text()=' المقر الرئيسي ']");
	private By add_region_window_add_button = By.cssSelector("button[type='submit']");
	private By add_region_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By add_region_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//delete region buttons
	private By delete_region_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font delete-icon mat-icon-no-color\']"); //delete buttons list
	private By delete_region_confirm_button =By.xpath("//span[normalize-space(text())='delete' or normalize-space(text())='حذف']");
	private By delete_region_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By delete_region_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//edit region buttons
	private By edit_region_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font edit-icon mat-icon-no-color\']"); //edit buttons list
	private By edit_region_window_arabic_name_input = By.cssSelector("input[formcontrolname='name']");
	private By edit_region_window_cities_dropdown_list = By.cssSelector("mat-select[formcontrolname='cityId'][role='combobox']");
	private By edit_region_window_status_dropdown_list = By.cssSelector("mat-select[formcontrolname='isActive'][role='combobox']");
	private By edit_region_window_descriptions_input= By.cssSelector("textarea[formcontrolname='descriptions']");
	private By edit_region_window_all_permssions_check_box= By.xpath("//span[text()='صلاحيات تقديم الطلبات']");
	private By edit_region_window_main_region_check_box= By.xpath("//label[text()=' المقر الرئيسي ']");
	private By edit_region_window_add_button = By.cssSelector("button[type='submit']"); By edit_region_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By edit_region_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	
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
	
	
	///////////////////////////////////////////////////////////////////////////////////////////
	//add region methods
	public void clickAddRegionButton() {
		JavaScriptUtility.clickJS(add_region_button);
	}
	
	public void addRegionWindowSetArabicName(String arabic_name) {
		//JavaScriptUtility.clickJS(add_region_window_arabic_name_input);
		//JavaScriptUtility.clickJS(add_region_window_arabic_name_input);
		JavaScriptUtility.setJS(add_region_window_arabic_name_input, arabic_name);
		//find(add_region_window_arabic_name_input);
		//JavaScriptUtility.setJS(add_region_button, arabic_name);
	}
	
	
	
	public void addRegionWindowSelectCityArabic(String arabic_name) {
		JavaScriptUtility.clickJS(add_region_window_cities_dropdown_list);
		String countryArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", countryArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	
	public void addRegionWindowSelectStatusArabic(String status) {
		JavaScriptUtility.clickJS(add_region_window_status_dropdown_list);
		String countryArabic = status;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", countryArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addRegionWindowSetDescription(String description) {
		//JavaScriptUtility.setJS(add_region_window_iso_code_input, iso_code);
		//find(add_region_window_descriptions_input);
		JavaScriptUtility.setJS(add_region_window_descriptions_input, description);
	}
	
	public void addRegionWindowClickSelectAllPermissions() {
		//JavaScriptUtility.setJS(add_region_window_iso_code_input, iso_code);
		//find(add_region_window_descriptions_input);
		JavaScriptUtility.clickJS(add_region_window_all_permssions_check_box);
	}
	
	
	public void addRegionWindowClickSelectIsMain() {
		//JavaScriptUtility.setJS(add_region_window_iso_code_input, iso_code);
		//find(add_region_window_descriptions_input);
		JavaScriptUtility.clickJS(add_region_window_main_region_check_box);
		
	}
	public void addRegionWindowClickAddButton() {
		
		JavaScriptUtility.clickJS(add_region_window_add_button);
	}
	
	public boolean addRegionSuccessMessageIsDisplayed() {		
		
		return find(add_region_success_message).isDisplayed();
	}
	
	public void clickAddRegionSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(add_region_success_message_close_button);	
	}
	/////////////////////////////////////////////////////////////////////////////////////
	///
	///
	
	

	
	//edit region methods

	public void clickEditRegionButtonByOrder(int order) {
		clickOfList(edit_region_buttons,order);
		
	}
	
	public void clickEditRegionButtonByRegionName(String iso_code) {
		String IsoCode = iso_code;
		String xpathExpression = String.format("//span[contains(text(),'%s')]//parent::*/following-sibling::*[5]/*[1]", IsoCode);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditRegionButtonByRegionName(IsoCode);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[2]")).JavaScriptUtility.clickJS();
			JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		}
	}
	
	public void editRegionWindowSetArabicName(String arabic_name) {
		//JavaScriptUtility.clickJS(add_region_window_arabic_name_input);
		//JavaScriptUtility.clickJS(add_region_window_arabic_name_input);
		JavaScriptUtility.setJS(edit_region_window_arabic_name_input, arabic_name);
		//find(add_region_window_arabic_name_input);
		//JavaScriptUtility.setJS(add_region_button, arabic_name);
	}
	
	
	
	public void editRegionWindowSelectCityArabic(String arabic_name) {
		JavaScriptUtility.clickJS(edit_region_window_cities_dropdown_list);
		String countryArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", countryArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	
	public void editRegionWindowSelectStatusArabic(String status) {
		JavaScriptUtility.clickJS(edit_region_window_status_dropdown_list);
		String countryArabic = status;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", countryArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editRegionWindowSetDescription(String description) {
		//JavaScriptUtility.setJS(add_region_window_iso_code_input, iso_code);
		//find(add_region_window_descriptions_input);
		JavaScriptUtility.setJS(edit_region_window_descriptions_input, description);
	}
	
	public void editRegionWindowClickSelectAllPermissions() {
		//JavaScriptUtility.setJS(add_region_window_iso_code_input, iso_code);
		//find(add_region_window_descriptions_input);
		JavaScriptUtility.clickJS(edit_region_window_all_permssions_check_box);
	}
	
	
	public void editRegionWindowClickSelectIsMain() {
		//JavaScriptUtility.setJS(add_region_window_iso_code_input, iso_code);
		//find(add_region_window_descriptions_input);
		JavaScriptUtility.clickJS(edit_region_window_main_region_check_box);
		
	}
	public void editRegionWindowClickUpdateButton() {
		
		JavaScriptUtility.clickJS(edit_region_window_add_button);
	}
	
	public boolean editRegionSuccessMessageIsDisplayed() {		
		
		return find(edit_region_success_message).isDisplayed();
	}
	
	
	public void clickEditRegionSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(edit_region_success_message_close_button);	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	//delete region methods
	public void clickDeleteRegionButtonByOrder(int order) {
		clickOfList(delete_region_buttons,order);
		
	}
	
	public void clickDeleteRegionButtonByRegionName(String iso_code)   {
		String IsoCode = iso_code;
		String xpathExpression = String.format("//span[contains(text(),'%s')]//parent::*/following-sibling::*[5]/*[2]", IsoCode);
		
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteRegionButtonByRegionName(IsoCode);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]")).JavaScriptUtility.clickJS();
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression));
			//JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		}
	}
	
	public void clickDeleteRegionConfirmButton() {
		JavaScriptUtility.clickJS(delete_region_confirm_button);
		
	}
	
	public boolean deleteRegionSuccessMessageIsDisplayed() {		
		
		return find(delete_region_success_message).isDisplayed();
	}
	
	public void clickDeleteRegionSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(delete_region_success_message_close_button);	
	}
	//////////////////////////////////////////////////////////////////////
	///
	///
	public void reloadRegionsPage() {
		
		reloadPage();
	}

}
