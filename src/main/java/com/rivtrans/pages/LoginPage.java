package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;

public class LoginPage extends BasePage {
	
	private By user_name_input = By.cssSelector("input[formcontrolname='username']");
	private By password_input = By.cssSelector("input[formcontrolname='password']");
	private By login_button = By.cssSelector("span[class='mdc-button__label']");
	
	
	
	public void setLoginpageUserName(String text) {
		
		set(user_name_input,text);
		
	}
	
	public void setLoginpagePassword(String text) {
		
		set(password_input,text);
		
	}
	
	public void clickLogingPageLoingButton() {
		
		click(login_button);
	}
	
	
	
	public HomePage validLogin(String user_name,String Password)  {
		setLoginpageUserName(user_name);
		setLoginpagePassword(Password);
		clickLogingPageLoingButton();
		return new HomePage();
	}
}
