package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;

public class LoginPage extends BasePage {
	
	private By user_name_input = By.xpath("/html/body/div/div/div/form/div[1]/input");
	private By password_input = By.xpath("/html/body/div/div/div/form/div[2]/input");
	private By login_button = By.xpath("/html/body/div/div/div/form/div[3]/button");
	
	
	
	public void setLoginpageUserName(String text) {
		
		set(user_name_input,text);
		
	}
	
	public void setLoginpagePassword(String text) {
		
		set(password_input,text);
		
	}
	
	public void clickLogingPageLoingButton() {
		
		click(login_button);
	}
	
	
	
	public SecurityCheckPage invalidLogin(String user_name,String Password) throws InterruptedException {
		setLoginpageUserName(user_name);
		setLoginpagePassword(Password);
		clickLogingPageLoingButton();
		return new SecurityCheckPage();
	}
}
