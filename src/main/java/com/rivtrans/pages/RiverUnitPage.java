package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.JavaScriptUtility;

public class RiverUnitPage extends BasePage{


	//add unit use buttons
	private By add_river_unit_button = By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']> :first-child");
	private By add_river_unit_window_name_input = By.cssSelector("input[formcontrolname='unitName']");
	private By add_river_unit_window_code_input = By.cssSelector("input[formcontrolname='unitCode']");
	private By add_river_unit_window_registiration_number =By.cssSelector("input[formcontrolname='registrationNo']");
	private By add_river_unit_window_manufacture_year =By.cssSelector("input[formcontrolname='manufactureYear']");
	private By add_river_unit_window_unit_nature_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='unitNatureId']");
	private By add_river_unit_window_unit_Use_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='unitUseId']");
	private By add_river_unit_window_is_engine_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='isEngine']");
	private By add_river_unit_window_is_licensed_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='isLicensed']");
	private By add_river_unit_window_is_company_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='companyId']");
	private By add_river_unit_window_motors_number =By.cssSelector("input[formcontrolname='motorNo']");
	private By add_river_unit_window_trade_mark =By.cssSelector("input[formcontrolname='tradeMark']");
	private By add_river_unit_window_unit_length =By.cssSelector("input[formcontrolname='unitLength']");
	private By add_river_unit_window_unit_width =By.cssSelector("input[formcontrolname='unitWidth']");
	private By add_river_unit_window_unit_height =By.cssSelector("input[formcontrolname='unitHeight']");
	private By add_river_unit_window_is_dimensions_measure_unit_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='dimensionalMeasureId']");
	private By add_river_unit_window_maximum_load =By.cssSelector("input[formcontrolname='maximumLoad']");
	private By add_river_unit_window_net_load =By.cssSelector("input[formcontrolname='netLoad']");
	private By add_river_unit_window_is_load_measure_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='loadMeasureId']");
	private By add_river_unit_window_is_fuel_type_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='fuelTypeId']");
	private By add_river_unit_window_engine_capacity =By.cssSelector("input[formcontrolname='engineCapacity']");
	private By add_river_unit_window_passengers_number =By.cssSelector("input[formcontrolname='passengerNo']");
	private By add_river_unit_window_crew_number =By.cssSelector("input[formcontrolname='crewNo']");
	private By add_river_unit_window_is_maintenance_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='maintenanceStatusId']");
	private By add_river_unit_window_last_maintenance_date =By.cssSelector("input['lastDateMainten']");
	private By add_river_unit_window_description_input = By.cssSelector("textarea[formcontrolname='licenseDesc']");
	private By add_river_unit_window_add_button = By.xpath("//span[normalize-space(text())='save' or normalize-space(text())='إضافة']");
	private By add_river_unit_success_message = By.cssSelector("div[class='snackbar success ng-star-inserted']");
	private By add_river_unit_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//delete unit use buttons
	private By delete_river_unit_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font delete-icon mat-icon-no-color\']"); //delete buttons list
	private By delete_river_unit_confirm_button =By.xpath("//span[normalize-space(text())='delete' or normalize-space(text())='حذف']");
	private By delete_river_unit_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By delete_river_unit_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	//edit unit use buttons
	private By edit_river_unit_buttons =By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
			+ "-icons mat-ligature-font edit-icon mat-icon-no-color\']"); //edit buttons list
	private By edit_river_unit_window_name_input = By.cssSelector("input[formcontrolname='unitName']");
	private By edit_river_unit_window_english_name_input = By.cssSelector("input[formcontrolname='nameEn']");
	private By edit_river_unit_window_status_dropdown_list = By.cssSelector("mat-select[aria-haspopup='listbox'][formcontrolname='isActive']");
	private By edit_river_unit_window_update_button = By.xpath("//span[normalize-space(text())='update' or normalize-space(text())='تحديث']");
	private By edit_river_unit_success_message = By.cssSelector("div[class=\'snackbar success ng-star-inserted\']");
	private By edit_river_unit_success_message_close_button = By.cssSelector("div.snackbar.success.ng-star-inserted > *:nth-child(2)");
	////mat-label[contains(text(), 'طبيعة الوحدات النهرية')]/parent::*/parent::*
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
	public void clickAddRiverUnitButton() {
		findToClick(add_river_unit_button);
		JavaScriptUtility.clickJS(add_river_unit_button);
	}
	
	public void addRiverUnitWindowSetName(String name) {
		JavaScriptUtility.setJS(add_river_unit_window_name_input, name);
	}
	public void addRiverUnitWindowSetCode(String code) {
		JavaScriptUtility.setJS(add_river_unit_window_code_input, code);
	}
	
	public void addRiverUnitWindowRegistirationNumber(String registiration_number) {
		JavaScriptUtility.setJS(add_river_unit_window_registiration_number, registiration_number);
	}
	
	
	public void addRiverUnitWindowManufactureYear(String manufacture_year) {
		JavaScriptUtility.setJS(add_river_unit_window_manufacture_year, manufacture_year);
	}
	
	
	
	public void addRiverUnitWindowSelectUnitNatureArabic(String unit_nature) {
		JavaScriptUtility.clickJS(add_river_unit_window_unit_nature_dropdown_list);
		String statusArabic = unit_nature;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addRiverUnitWindowSelectUnitUseArabic(String unit_use) {
		JavaScriptUtility.clickJS(add_river_unit_window_unit_Use_dropdown_list);
		String statusArabic = unit_use;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addRiverUnitWindowSelectIsEngineArabic(String is_engine) {
		JavaScriptUtility.clickJS(add_river_unit_window_is_engine_dropdown_list);
		String statusArabic = is_engine;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	public void addRiverUnitWindowSelectIsLicensedArabic(String is_licensed) {
		JavaScriptUtility.clickJS(add_river_unit_window_is_licensed_dropdown_list);
		String statusArabic = is_licensed;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	public void addRiverUnitWindowSelectCompanyArabic(String company) {
		JavaScriptUtility.clickJS(add_river_unit_window_is_company_dropdown_list);
		String statusArabic = company;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	public void addRiverUnitWindowMotorsNumber(String motors_numbers) {
		JavaScriptUtility.setJS(add_river_unit_window_motors_number, motors_numbers);
	}
	
	public void addRiverUnitWindowSetTradeMark(String trade_mark) {
		JavaScriptUtility.setJS(add_river_unit_window_trade_mark, trade_mark);
	}
	
	public void addRiverUnitWindowSetlength(String length) {
		JavaScriptUtility.setJS(add_river_unit_window_unit_length, length);
	}
	
	public void addRiverUnitWindowSetwidth(String width) {
		JavaScriptUtility.setJS(add_river_unit_window_unit_width, width);
	}
	
	public void addRiverUnitWindowSetheight(String height) {
		JavaScriptUtility.setJS(add_river_unit_window_unit_height, height);
	}
	
	public void addRiverUnitWindowSelectDimensionsMeasureUnitArabic(String dimensions_measure_unit) {
		JavaScriptUtility.clickJS(add_river_unit_window_is_dimensions_measure_unit_dropdown_list);
		String statusArabic = dimensions_measure_unit;
		String xpathExpression = String.format("//*[@role='option']//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addRiverUnitWindowSetMaximumLoad(String maximum_load) {
		JavaScriptUtility.setJS(add_river_unit_window_maximum_load, maximum_load);
	}
	
	public void addRiverUnitWindowSetNetLoad(String net_load) {
		JavaScriptUtility.setJS(add_river_unit_window_net_load, net_load);
	}
	
	public void addRiverUnitWindowSelectMeasureLoadArabic(String load_measure_unit) {
		JavaScriptUtility.clickJS(add_river_unit_window_is_load_measure_dropdown_list);
		String statusArabic = load_measure_unit;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	public void addRiverUnitWindowSelectFuelTypeArabic(String fuel_type) {
		JavaScriptUtility.clickJS(add_river_unit_window_is_fuel_type_dropdown_list);
		String statusArabic = fuel_type;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addRiverUnitWindowSetEnginCapacity(String engine_capacity) {
		JavaScriptUtility.setJS(add_river_unit_window_engine_capacity, engine_capacity);
	}
	
	public void addRiverUnitWindowSetPassengersNumber(String passengers_number) {
		JavaScriptUtility.setJS(add_river_unit_window_passengers_number, passengers_number);
	}
	
	public void addRiverUnitWindowSetCrewNumber(String crew_number) {
		JavaScriptUtility.setJS(add_river_unit_window_crew_number, crew_number);
	}
	
	
	public void addRiverUnitWindowSelectMaintenaceStatusArabic(String maintenance_status) {
		JavaScriptUtility.clickJS(add_river_unit_window_is_maintenance_status_dropdown_list);
		String statusArabic = maintenance_status;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void addRiverUnitWindowSetMaintenanceDate(String maintenance_date) {
		JavaScriptUtility.setJS(add_river_unit_window_last_maintenance_date, maintenance_date);
	}
	
	public void addRiverUnitWindowSetDescription(String description) {
		JavaScriptUtility.setJS(add_river_unit_window_description_input, description);
	}
	

	


	

	
	public void addRiverUnitWindowClickAddButton() {
		
		JavaScriptUtility.clickJS(add_river_unit_window_add_button);
	}
	
	public boolean addRiverUnitSuccessMessageIsDisplayed() {		
		
		return find(add_river_unit_success_message).isDisplayed();
	}
	
	public void clickAddRiverUnitSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(add_river_unit_success_message_close_button);	
	}
	/////////////////////////////////////////////////////////////////////////////////////
	///
	///
	
	
	//delete unit use methods
	public void clickDeleteRiverUnitButtonByOrder(int order) {
		clickOfList(delete_river_unit_buttons,order);
		
	}
	
	public void clickDeleteRiverUnitButtonByRiverUnitName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@cell='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteRiverUnitButtonByRiverUnitName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickDeleteRiverUnitButtonByRiverUnitNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteRiverUnitButtonByRiverUnitNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickDeleteRiverUnitButtonByRiverUnitNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteRiverUnitButtonByRiverUnitNameEnglish(englishName);
		} else {
			
			//find(By.xpath(xpathExpression)).findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]")).JavaScriptUtility.clickJS();
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[2]"));
			
		}
	}
	
	public void clickDeleteRiverUnitConfirmButton() {
		JavaScriptUtility.clickJS(delete_river_unit_confirm_button);
		
	}
	
	public boolean deleteRiverUnitSuccessMessageIsDisplayed() {		
		
		return find(delete_river_unit_success_message).isDisplayed();
	}
	
	public void clickDeleteRiverUnitSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(delete_river_unit_success_message_close_button);	
	}
	//////////////////////////////////////////////////////////////////////
	///
	///
	
	//edit unit use methods

	public void clickEditRiverUnitButtonByOrder(int order) {
		clickOfList(edit_river_unit_buttons,order);
		
	}
	
	public void clickEditRiverUnitButtonByRiverUnitName(String arabic_name,String english_name) {
		String arabicName = arabic_name;
		String englishName = english_name;
		String xpathExpression = String.format("//*[@role='cell']//span[contains(text(),'%s') or contains(text(), '%s')]", englishName, arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickDeleteRiverUnitButtonByRiverUnitName(arabicName,english_name);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[3]"));
			
		}
	}
	
	public void clickEditRiverUnitButtonByRiverUnitNameArabic(String arabic_name) {
		String arabicName = arabic_name;
		String xpathExpression = String.format("//span[contains(text(), '%s')]", arabicName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditRiverUnitButtonByRiverUnitNameArabic(arabicName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[3]"));
			
		}
	}
	public void clickEditRiverUnitButtonByRiverUnitNameEnglish(String english_name) {
		String englishName = english_name;
		String xpathExpression = String.format("//span[contains(text(),'%s')]", englishName);
		if(find(next_rows_button).isEnabled()==true && isElementVisible(By.xpath(xpathExpression))==false) {
				JavaScriptUtility.clickJS(next_rows_button);
				clickEditRiverUnitButtonByRiverUnitNameArabic(englishName);
		} else {
			
			JavaScriptUtility.clickJS(By.xpath(xpathExpression+"//parent::*/following-sibling::*[3]/*[3]"));
			
		}
	}
	
	public void editRiverUnitWindowSetArabicName(String name) {
		JavaScriptUtility.setJS(edit_river_unit_window_name_input, name);
	}
	
	public void editRiverUnitWindowSetEnglishName(String english_name) {
		JavaScriptUtility.setJS(edit_river_unit_window_english_name_input, english_name);
	}
	
	public void editRiverUnitWindowSelectStatus(String arabic_name,String english_name)  {
		JavaScriptUtility.clickJS(edit_river_unit_window_status_dropdown_list);
		String statusEnglish = english_name;
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish, statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editRiverUnitWindowSelectStatusArabic(String arabic_name) {
		JavaScriptUtility.clickJS(edit_river_unit_window_status_dropdown_list);
		String statusArabic = arabic_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(), '%s')]", statusArabic);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	
	public void editRiverUnitWindowSelectStatusEnglish(String english_name) {
		JavaScriptUtility.clickJS(edit_river_unit_window_status_dropdown_list);
		String statusEnglish = english_name;
		String xpathExpression = String.format("//*[@role=\"option\"]//span[contains(text(),'%s')]", statusEnglish);
		JavaScriptUtility.clickJS(By.xpath(xpathExpression));
		
	}
	

	
	public void editRiverUnitWindowClickUpdateButton() {
		
		JavaScriptUtility.clickJS(edit_river_unit_window_update_button);
	}
	
	public boolean editRiverUnitSuccessMessageIsDisplayed() {		
		
		return find(edit_river_unit_success_message).isDisplayed();
	}
	
	
	public void clickEditRiverUnitSuccessMessageCloseButton() {
		
		JavaScriptUtility.clickJS(edit_river_unit_success_message_close_button);	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	///
	
	public void reloadRiverUnitPage() {
		
		reloadPage();
	}
	


}
