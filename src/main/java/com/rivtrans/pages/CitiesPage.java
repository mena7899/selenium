package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;

public class CitiesPage extends BasePage {
	
	private By add_city_button = By.cssSelector("mat-icon[class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color']");
	private By add_city_window_arabic_name_input = By.cssSelector("mat-icon[class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color']");
	private By add_city_window_english_name_input = By.cssSelector("mat-icon[class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color']");
	private By add_city_window_countries_dropdown_list = By.cssSelector("mat-icon[class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color']");
	private By add_city_window_iso_code= By.cssSelector("mat-icon[class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color']");
	private By add_city_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");

}
