package com.rivtrans.pages;

import org.openqa.selenium.By;
import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.JavaScriptUtility;

public class CountriesPage extends BasePage {
	
	//add country buttons
	private By add_country_button = By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']> :first-child");
	private By add_country_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By add_country_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By add_country_window_iso_code_input= By.cssSelector("input[formcontrolname='countryCode']");
	private By add_country_window_add_button = By.cssSelector("button[type='submit']");
	private By add_country_success_message = By.cssSelector("div[class=\"snackbar success ng-star-inserted\"]");
	private By add_country_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	
	//delete country buttons
	private By delete_country_buttons = By.cssSelector("mat-icon[class=\'mat-icon notranslate material-icons mat-ligature-font delete-icon mat-icon-no-color\']");
	private By delete_country_confirm_button =By.xpath("//span[normalize-space(text())='delete' or normalize-space(text())='حذف']");
	private By delete_country_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By delete_country_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
		//edit country buttons
	private By edit_country_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
				+ "-icons mat-ligature-font edit-icon mat-icon-no-color\']"); //edit buttons list
	private By edit_country_window_arabic_name_input = By.cssSelector("input[formcontrolname='nameAr']");
	private By edit_country_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By edit_country_window_iso_code_input= By.cssSelector("input[formcontrolname='countryCode']");
	private By edit_country_window_update_button= By.cssSelector("button[type='submit']");
	private By edit_country_success_message = By.cssSelector("div[class=\"snackbar success ng-star-inserted\"]");
	private By edit_country_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	
	
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
		//add country methods
		public void clickAddCountryButton() {
			findToClick(add_country_button);
			JavaScriptUtility.clickJS(add_country_button);
		}
		
		public void addCountryWindowSetArabicName(String arabic_name) {
			JavaScriptUtility.setJS(add_country_window_arabic_name_input, arabic_name);
		}
		
		public void addCountryWindowSetEnglishName(String english_name) {
			JavaScriptUtility.setJS(add_country_window_english_name_input, english_name);
		}
		
		
		public void addCountryWindowSetIsoCode(String iso_code) {
			JavaScriptUtility.setJS(add_country_window_iso_code_input, iso_code);
		}
		
		public void addCountryWindowClickAddButton() {
			
			JavaScriptUtility.clickJS(add_country_window_add_button);
		}
		
		public boolean addCountrySuccessMessageIsDisplayed() {		
			
			return find(add_country_success_message).isDisplayed();
		}
		
		public void clickAddCountrySuccessMessageCloseButton() {
			
			JavaScriptUtility.clickJS(add_country_success_message_close_button);	
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
						JavaScriptUtility.clickJS(next_rows_button);
						clickEditCountryButtonByCountryIsoCode(IsoCode);
				} else {
					
					//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[2]/*[1]")).JavaScriptUtility.clickJS();
					JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[2]/*[1]"));
					
				}
			}
			
			public void editCountryWindowSetArabicName(String arabic_name) {
				JavaScriptUtility.setJS(edit_country_window_arabic_name_input, arabic_name);
			}
			
			public void editCountryWindowSetEnglishName(String english_name) {
				JavaScriptUtility.setJS(edit_country_window_english_name_input, english_name);
			}
			
			
			public void editCountryWindowSetIsoCode(String iso_code) {
				JavaScriptUtility.setJS(edit_country_window_iso_code_input, iso_code);
			}
			
			public void editCountryWindowClickUpdateButton() {
				
				JavaScriptUtility.clickJS(edit_country_window_update_button);
			}
			
			public boolean editCountrySuccessMessageIsDisplayed() {		
				
				return find(edit_country_success_message).isDisplayed();
			}
			
			public void clickEditCountrySuccessMessageCloseButton() {
				
				JavaScriptUtility.clickJS(edit_country_success_message_close_button);	
			}
				

			




		
		//delete country methods
		public void clickDeleteCountryButtonByOrder(int order) {
			clickOfList(delete_country_buttons,order);
			
		}
		
		public void clickDeleteCountryButtonByCountryIsoCode(String iso_code) {
			String IsoCode = iso_code;
			String xpathExpression = String.format("//mat-cell[@role='cell']//span[contains(text(), '%s')]", IsoCode);
			if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
					JavaScriptUtility.clickJS(next_rows_button);
					clickDeleteCountryButtonByCountryIsoCode(IsoCode);
			} else {
				System.out.print("123");
				//findToClick(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[2]/*[2]")).JavaScriptUtility.clickJS();
				JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[2]/*[2]"));
			}
		}
		
		
		public void clickDeleteCountryConfirmButton() {
		
			
			JavaScriptUtility.clickJS(delete_country_confirm_button);
		}
		
		public boolean deleteCountrySuccessMessageIsDisplayed() {		
			
			return find(delete_country_success_message).isDisplayed();
		}
		public void clickDeleteCountrySuccessMessageCloseButton() {
			
			JavaScriptUtility.clickJS(delete_country_success_message_close_button);	
		}
		///////////////////////////////////////////////////
		///
		///
		public void reloadCountriesPage() {
			
			reloadPage();
		}
}
		//////////////////////////////////////////////////////////////////////
		///
		///
		
		