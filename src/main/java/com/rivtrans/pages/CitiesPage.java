package com.rivtrans.pages;


import org.openqa.selenium.By;
import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.JavaScriptUtility;


public class CitiesPage extends BasePage {
	//add city buttons
	private By add_city_button = By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']> :first-child");
	private By add_city_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By add_city_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By add_city_window_countries_dropdown_list = By.cssSelector("mat-select[formcontrolname='countryId'][role='combobox']");
	private By add_city_window_iso_code_input= By.cssSelector("input[formcontrolname='code']");
	private By add_city_window_add_button = By.cssSelector("button[type='submit']");
	private By add_city_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By add_city_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//delete city buttons
	private By delete_city_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font delete-icon mat-icon-no-color\']"); //delete buttons list
	private By delete_city_confirm_button =By.xpath("//span[normalize-space(text())='delete' or normalize-space(text())='حذف']");
	private By delete_city_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By delete_city_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//edit city buttons
	private By edit_city_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font edit-icon mat-icon-no-color\']"); //edit buttons list
	private By edit_city_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By edit_city_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By edit_city_window_countries_dropdown_list = By.cssSelector("mat-select[formcontrolname='countryId'][role='combobox']");
	private By edit_city_window_iso_code_input= By.cssSelector("input[formcontrolname='code']");
	private By edit_city_window_update_button = By.cssSelector("button[type='submit']");
	private By edit_city_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By edit_city_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	
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
	//add city methods
	public void clickAddCityButton() {
		JavaScriptUtility.clickJS(add_city_button);
	}
	
	public void addCityWindowSetArabicName(String arabic_name) {
		//JavaScriptUtility.clickJS(add_city_window_arabic_name_input);
		JavaScriptUtility.clickJS(add_city_window_arabic_name_input);
		JavaScriptUtility.setJS(add_city_window_arabic_name_input, arabic_name);
		//find(add_city_window_arabic_name_input);
		//JavaScriptUtility.setJS(add_city_button, arabic_name);
	}
	
	public void addCityWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(add_city_window_english_name_input, english_name);
	}
	
	public void addCityWindowSelectCountry(String arabic_name,String english_name) {
		JavaScriptUtility.clickJS(add_city_window_countries_dropdown_list);
		String countryEnglish = english_name;
		String countryArabic = arabic_name;
		String xpathExpression = String.format("//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ',"
				+ " 'abcdefghijklmnopqrstuvwxyz'), '%s') or contains(text(), '%s')]", countryEnglish, countryArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addCityWindowSelectCountryArabic(String arabic_name) {
		JavaScriptUtility.clickJS(add_city_window_countries_dropdown_list);
		String countryArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", countryArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addCityWindowSelectCountryEnglish(String english_name) {
		JavaScriptUtility.clickJS(add_city_window_countries_dropdown_list);
		String countryEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", countryEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addCityWindowSetIsoCode(String iso_code) {
		//JavaScriptUtility.setJS(add_city_window_iso_code_input, iso_code);
		find(add_city_window_iso_code_input);
		JavaScriptUtility.setJS(add_city_window_iso_code_input, iso_code);
	}
	
	public void addCityWindowClickAddButton() {
		
		JavaScriptUtility.clickJS(add_city_window_add_button);
	}
	
	public boolean addCitySuccessMessageIsDisplayed() {		
		
		return find(add_city_success_message).isDisplayed();
	}
	
	public void clickAddCitySuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(add_city_success_message_close_button);	
	}
	/////////////////////////////////////////////////////////////////////////////////////
	///
	///
	
	

	
	//edit city methods

	public void clickEditCityButtonByOrder(int order) {
		clickOfList(edit_city_buttons,order);
		
	}
	
	public void clickEditCityButtonByCityIsoCode(String iso_code) {
		String IsoCode = iso_code;
		String xpathExpression = String.format("//span[contains(text(),'%s')]//parent::*/following-sibling::*[3]/*[2]", IsoCode);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditCityButtonByCityIsoCode(IsoCode);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[2]")).JavaScriptUtility.clickJS();
			JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		}
	}
	
	public void editCityWindowSetArabicName(String arabic_name) {
		JavaScriptUtility.clickJS(edit_city_window_arabic_name_input);
		JavaScriptUtility.setJS(edit_city_window_arabic_name_input, arabic_name);
	}
	
	public void editCityWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(edit_city_window_english_name_input, english_name);
	}
	
	public void editCityWindowSelectCountry(String arabic_name,String english_name)  {
		JavaScriptUtility.clickJS(edit_city_window_countries_dropdown_list);
		String countryEnglish = english_name;
		String countryArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),  '%s') or contains(text(), '%s')]", countryEnglish, countryArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editCityWindowSelectCountryArabic(String arabic_name) {
		JavaScriptUtility.clickJS(edit_city_window_countries_dropdown_list);
		String countryArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", countryArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editCityWindowSelectCountryEnglish(String english_name) {
		JavaScriptUtility.clickJS(edit_city_window_countries_dropdown_list);
		String countryEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", countryEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editCityWindowSetIsoCode(String iso_code) {
		JavaScriptUtility.setJS(edit_city_window_iso_code_input, iso_code);
	}
	
	public void editCityWindowClickUpdateButton() {
		
		JavaScriptUtility.clickJS(edit_city_window_update_button);
	}
	
	public boolean editCitySuccessMessageIsDisplayed() {		
		
		return find(edit_city_success_message).isDisplayed();
	}
	
	public void clickEditCitySuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(edit_city_success_message_close_button);	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	//delete city methods
	public void clickDeleteCityButtonByOrder(int order) {
		clickOfList(delete_city_buttons,order);
		
	}
	
	public void clickDeleteCityButtonByCityIsoCode(String iso_code)   {
		String IsoCode = iso_code;
		String xpathExpression = String.format("//span[contains(text(),'%s')]//parent::*/following-sibling::*[3]/*[1]", IsoCode);
		
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteCityButtonByCityIsoCode(IsoCode);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]")).JavaScriptUtility.clickJS();
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression));
			//JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		}
	}
	
	public void clickDeleteCityConfirmButton() {
		JavaScriptUtility.clickJS(delete_city_confirm_button);
		
	}
	
	public boolean deleteCitySuccessMessageIsDisplayed() {		
		
		return find(delete_city_success_message).isDisplayed();
	}
	
	public void clickDeleteCitySuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(delete_city_success_message_close_button);	
	}
	//////////////////////////////////////////////////////////////////////
	///
	///
	public void reloadCitesPage() {
		
		reloadPage();
	}

}
