package com.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_process_ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\epavithra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        
        Driver.get("https://in.ebay.com");
       
        Driver.findElement(By.linkText("register")).click();
        
        
        String Search_term = "pavithra";
        Driver.findElement(By.id("firstname")).sendKeys(Search_term);
        String lastname = "pavithra";
        Driver.findElement(By.id("lastname")).sendKeys(lastname);
        String last_name = "pavithra";
        Driver.findElement(By.id("lastname")).sendKeys(lastname);
        String email_add="pavithra@gmail.com";
        Driver.findElement(By.id("email")).sendKeys(email_add);
        String password="Pavi@1234";
        Driver.findElement(By.id("PASSWORD")).sendKeys(password);
        
        Driver.findElement(By.id("ppaFormSbtBtn")).click();
        
        Driver.close();
	}

}
