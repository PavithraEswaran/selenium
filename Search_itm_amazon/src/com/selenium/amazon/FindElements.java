package com.selenium.amazon;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\epavithra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.amazon.in/");
        
        // 2. The user should select 'Books' from the category select / list box
       WebElement Ele = Driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
       Select Select_Category = new Select(Ele);
       Select_Category.selectByIndex(11);
       
       //3. The user should type 'Da Vinci code' books in search text box
       String Search_term = "Da Vinci Code";
       Driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Search_term);
       
       //4. The user should click on the magnifier button        
       Driver.findElement(By.xpath("//input[@tabindex = '10']")).click();
       
       //5. The user should get titles of all the items listed on the page
       List<WebElement> Titles = Driver.findElements(By.xpath("//span[@class = 'a-size-medium a-color-base a-text-normal']"));
       
       for(WebElement ttl : Titles) {
           System.out.println(ttl.getText());
       }
       
       Driver.close();
	}

}
