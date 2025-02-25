package com.rivtrans.pages;

import org.openqa.selenium.By;

import com.rivtrans.base.BasePage;

public class SecurityCheckPage extends BasePage {
	
  private By error_message = By.xpath("//*[@id=\"j_idt13:j_idt14_content\"]/div[1]/div/span");
  
  public String getSecurityCheckErrorMesage() {
	
	  return find(error_message).getText();
	  
	  
  }
  
}
