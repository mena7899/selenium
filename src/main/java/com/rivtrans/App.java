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
    	WebDriver driver1;
    	driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	String url = "C:/Users/melias/Desktop/Login.html";
    	driver.get(url);
    	//System.out.println( "Hell o' World!app" );
    	driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys("mena2");
    	driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys("123456");
    	Thread.sleep(5000);
    	driver.findElement(By.cssSelector("span[class='mdc-button__label']")).click();
    	
    	 Set<Cookie> cookies = driver.manage().getCookies();
    	 
    	 

         // Convert cookies to a JSON string using Gson
         Gson gson = new Gson();
         String cookiesJson = gson.toJson(cookies);

         //Save the cookies to a file (cookies.json)
         try (FileWriter writer = new FileWriter("cookies.json")) {
             writer.write(cookiesJson);
             System.out.println("Cookies have been saved to cookies.json");
         } catch (IOException e) {
             e.printStackTrace();
         }
         driver.quit();
         // Print each cookie
//         for (Cookie cookie : cookies) {
//             System.out.println("Cookie Name: " + cookie.getName());
//             System.out.println("Cookie Value: " + cookie.getValue());
//             System.out.println("Cookie Domain: " + cookie.getDomain());
//             System.out.println("Cookie Path: " + cookie.getPath());
//             System.out.println("Cookie Expiry: " + cookie.getExpiry());
//             System.out.println("Cookie Is Secure: " + cookie.isSecure());
//             System.out.println("----------");
//         }
    	//String ele=driver.findElement(By.xpath("//*[@id=\"j_idt13:j_idt14_content\"]/div[1]/div/span")).getText();
    	//System.out.print(ele);
        driver1 = new ChromeDriver();
        //Gson gson = new Gson();
        Type cookieListType = new TypeToken<List<Cookie>>() {}.getType();
        List<Cookie> cookies1 = gson.fromJson(new FileReader("cookies.json"), cookieListType);

        // Add cookies to the browser
        for (Cookie cookie : cookies1) {
            driver1.manage().addCookie(cookie);
            System.out.println("Cookie Name: " + cookie.getName());
        }

        // Refresh the page to apply cookies
        driver1.navigate().refresh();
        driver1.navigate().refresh();
        driver1.navigate().refresh();
    	Thread.sleep(5000);
    	driver1.quit();
       
    }
}
