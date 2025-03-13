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
import org.openqa.selenium.chrome.ChromeDriver;
//import java.io.IOException;
import com.google.gson.Gson;
//import com.google.gson.JsonIOException;
//import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

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
    	driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys("ramadan");
    	driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys("123456");
    	Thread.sleep(5000);
    	driver.findElement(By.cssSelector("span[class='mdc-button__label']")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@id=\\\"sidebarnav\\\"]/li/ul/li/ul/li[1]/a")).click();
    	Thread.sleep(5000);

         driver.quit();

    }

}