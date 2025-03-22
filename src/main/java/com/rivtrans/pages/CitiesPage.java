package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;

public class CitiesPage extends BasePage {
	
	private By add_city_button = By.cssSelector("mat-icon[class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color']");
	private By add_city_window_arabic_name_input = By.cssSelector("mat-icon[class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color']");
	private By add_city_window_english_name_input = By.cssSelector("mat-icon[class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color']");
	private By add_city_window_countries_dropdown_list = By.cssSelector("mat-icon[class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color']");
	private By add_city_window_iso_code_input= By.cssSelector("mat-icon[class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color']");
	private By add_city_window_add_button = By.cssSelector("button[class=\'mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-disabled mat-mdc-button-base\']");
	private By add_city_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	
	public void clickAddCityButton() {
		click(add_city_button);
	}
	
	public void addCityWindowSetArabicName(String arabic_name) {
		set(add_city_window_arabic_name_input, arabic_name);
	}
	
	public void addCityWindowSetEnglishName(String english_name) {
		set(add_city_window_english_name_input, english_name);
	}
	
	public void addCityWindowSelectCountry(String arabic_name,String english_name) {
		click(add_city_window_countries_dropdown_list);
		String countryEnglish = english_name;
		String countryArabic = arabic_name;
		String xpathExpression = String.format("//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ',"
				+ " 'abcdefghijklmnopqrstuvwxyz'), '%s') or contains(text(), '%s')]", countryEnglish, countryArabic);
		click(By.xpath(xpathExpression));
		
	}
	
	public void addCityWindowSelectCountryArabic(String arabic_name) {
		click(add_city_window_countries_dropdown_list);
		String countryArabic = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", countryArabic);
		click(By.xpath(xpathExpression));
		
	}
	
	public void addCityWindowSelectCountryEnglish(String english_name) {
		click(add_city_window_countries_dropdown_list);
		String countryEnglish = english_name;
		String xpathExpression = String.format("//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ',"
				+ " 'abcdefghijklmnopqrstuvwxyz'), '%s')]", countryEnglish);
		click(By.xpath(xpathExpression));
		
	}
	
	public void addCityWindowSetIsoCode(String iso_code) {
		set(add_city_window_iso_code_input, iso_code);
	}
	
	public void addCityWindowClickAddButton() {
		
		click(add_city_window_add_button);
	}
	
	public boolean AddCitySuccessMessageIsDisplayed() {		
		
		return find(add_city_success_message).isDisplayed();
	}

}
