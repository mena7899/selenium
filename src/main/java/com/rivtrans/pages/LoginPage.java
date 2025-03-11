package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;
import com.rivtrans.utilities.WaitUtility;

public class LoginPage extends BasePage {
	
	private By user_name_input = By.cssSelector("input[formcontrolname='username']");
	private By password_input = By.cssSelector("input[formcontrolname='password']");
	private By login_button = By.cssSelector("span[class='mdc-button__label']");
	private By error_message= By.xpath("/html/body/app-root/app-auth-layout/app-login/div/div/div/div[2]/div[2]/div/div[2]/form/div[1]");
	
	
	
	public void setLoginpageUserName(String text) {
		
		set(user_name_input,text);
		
	}
	
	public void setLoginpagePassword(String text) {
		
		set(password_input,text);
		
	}
	
	public void clickLogingPageLoingButton() {
		
		click(login_button);
	}
	
//	public void invalidLogin(String user_name,String Password)  {
//		setLoginpageUserName(user_name);
//		setLoginpagePassword(Password);
//		clickLogingPageLoingButton();
//	}
	
	
	public HomePage validLogin(String user_name,String Password) throws InterruptedException  {
		setLoginpageUserName(user_name);
		
		setLoginpagePassword(Password);

		clickLogingPageLoingButton();
		//Thread.sleep(5000);
		WaitUtility.implicitWait(10000);
		return new HomePage();
	}
	public String getErrormessage() {
		return find(error_message).getText();
		
	}
}
