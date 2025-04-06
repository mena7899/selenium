package com.rivtrans.pages;

import org.openqa.selenium.By;
import com.rivtrans.base.BasePage;

public class CountriesPage extends BasePage {
	
	//add country buttons
	private By add_country_button = By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']");
	private By add_country_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By add_country_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By add_country_window_iso_code_input= By.cssSelector("input[formcontrolname='countryCode']");
	private By add_country_window_add_button = By.cssSelector("button[type='submit']");
	private By add_country_success_message = By.cssSelector("div[class=\"snackbar success ng-star-inserted\"]");
	
	//delete country buttons
	private By delete_country_buttons = By.cssSelector("mat-icon[class=\'mat-icon notranslate material-icons mat-ligature-font delete-icon mat-icon-no-color\']");
	private By delete_country_confirm_button =By.xpath("//span[normalize-space(text())='delete' or normalize-space(text())='حذف']");
	private By delete_country_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
		//edit country buttons
	private By edit_country_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
				+ "-icons mat-ligature-font edit-icon mat-icon-no-color\']"); //edit buttons list
	private By edit_country_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By edit_country_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By edit_country_window_iso_code_input= By.cssSelector("input[formcontrolname='countryCode']");
	private By edit_country_window_update_button= By.cssSelector("button[type='submit']");
	private By edit_country_success_message = By.cssSelector("div[class=\"snackbar success ng-star-inserted\"]");
	//row number button
	private By rows_number_drop_down_list=By.cssSelector("mat-select[aria-haspopup='listbox']");
	private By rows_number_drop_down_list_100_row_option=By.cssSelector("mat-option[id='mat-option-3']");
	
	//next rows button
	
	private By next_rows_button = By.xpath("//mat-icon[contains(text() ,'chevron_right')]/parent::*");
	
	//rows number methods
		public void select100Row() {
			click(rows_number_drop_down_list);
			click(rows_number_drop_down_list_100_row_option);
		}
		
		
		///////////////////////////////////////////////////////////////////////////////////////////
		//add country methods
		public void clickAddCountryButton() {
			click(add_country_button);
		}
		
		public void addCountryWindowSetArabicName(String arabic_name) {
			set(add_country_window_arabic_name_input, arabic_name);
		}
		
		public void addCountryWindowSetEnglishName(String english_name) {
			set(add_country_window_english_name_input, english_name);
		}
		
		
		public void addCountryWindowSetIsoCode(String iso_code) {
			set(add_country_window_iso_code_input, iso_code);
		}
		
		public void addCountryWindowClickAddButton() {
			
			click(add_country_window_add_button);
		}
		
		public boolean addCountrySuccessMessageIsDisplayed() {		
			
			return find(add_country_success_message).isDisplayed();
		}
		/////////////////////////////////////////////////////////////////////////////////////
		///
		///
		///
		
		
		//edit country methods

				public void clickEditCountryButtonByOrder(int order) {
					clickOfList(edit_country_buttons,order);
					
				}
				
				public void clickEditCountryButtonByCountryIsoCode(String iso_code) {
					String IsoCode = iso_code;
					String xpathExpression = String.format("//mat-cell[@role='cell']//span[contains(text(), '%s')]", IsoCode);
					if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
							click(next_rows_button);
							clickEditCountryButtonByCountryIsoCode(IsoCode);
					} else {
						
						find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[2]/*[1]")).click();
						
					}
				}
				
				public void editCountryWindowSetArabicName(String arabic_name) {
					set(edit_country_window_arabic_name_input, arabic_name);
				}
				
				public void editCountryWindowSetEnglishName(String english_name) {
					set(edit_country_window_english_name_input, english_name);
				}
				
				
				public void editCountryWindowSetIsoCode(String iso_code) {
					set(edit_country_window_iso_code_input, iso_code);
				}
				
				public void editCountryWindowClickUpdateButton() {
					
					click(edit_country_window_update_button);
				}
				
				public boolean editCountrySuccessMessageIsDisplayed() {		
					
					return find(edit_country_success_message).isDisplayed();
				}
				

			




		
		//delete country methods
		public void clickDeleteCountryButtonByOrder(int order) {
			clickOfList(delete_country_buttons,order);
			
		}
		
		public void clickDeleteCountryButtonByCountryIsoCode(String iso_code) {
			String IsoCode = iso_code;
			String xpathExpression = String.format("//span[contains(text(), '%s')]", IsoCode);
			if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
					click(next_rows_button);
					clickDeleteCountryButtonByCountryIsoCode(IsoCode);
			} else {
				
				find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[2]/*[2]")).click();
				
			}
		}
		
		
		public void clickDeleteCountryConfirmButton() {
		
			
			click(delete_country_confirm_button);
		}
		
		public boolean deleteCountrySuccessMessageIsDisplayed() {		
			
			return find(delete_country_success_message).isDisplayed();
		}
		
}
		//////////////////////////////////////////////////////////////////////
		///
		///
		
		