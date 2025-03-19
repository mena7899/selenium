package com.rivtrans;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.io.IOException;
import com.google.gson.Gson;
//import com.google.gson.JsonIOException;
//import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import org.openqa.selenium.support.ui.Select;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {
    	
    	WebDriver driver;
    	driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	String url = "http://rta.isfpdomain.com/login";
    	driver.get(url);
    	//System.out.println( "Hell o' World!app" );
    	//enter name
    	driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys("ramadan");
    	//enter password
    	driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys("123456");
    	Thread.sleep(3000);
    	//click login button
    	driver.findElement(By.cssSelector("span[class='mdc-button__label']")).click();
    	Thread.sleep(3000);
    	//click licenses
    	driver.findElement(By.cssSelector("span[class*='ng-star-inserted']")).click();
    	Thread.sleep(3000);
    	//click main data
    	driver.findElement(By.cssSelector("a[class*='ml-sub-menu']")).click();
    	Thread.sleep(3000);
    	//click cites
    	driver.findElement(By.cssSelector("a[href='/cities']")).click();
    	Thread.sleep(3000);
    	//click add button
    	driver.findElement(By.cssSelector("mat-icon[class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color']")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.cssSelector("div[class='mat-mdc-form-field-infix ng-tns-c508571215-12']")).click();
    	Thread.sleep(3000);
    	
    	// //*[@id="mat-select-54-panel"]//*[@role="option"]  all the options in this list
    	// //*[@id='mat-select-54-panel']//*[@role='option']//span[contains(text(),'مصر')]  //find the option by inner text
    	List<WebElement> list =driver.findElements(By.cssSelector("span[class='mdc-list-item__primary-text']"));
    	//List<WebElement> list =driver.findElements(By.cssSelector("mat-option[role='option']"));
    	System.out.print(list);
    	list.get(1).click();
    	System.out.print(list);
    	//Select select =new Select(driver.findElement(By.cssSelector("div[class='mat-mdc-form-field-infix ng-tns-c508571215-12']")));
    	//select.selectByIndex(1);
    	
    	
    	
    	Thread.sleep(3000);
         driver.quit();

    }

}