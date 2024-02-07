package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		d.get("https://practicetestautomation.com/practice-test-login/");
		
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		d.findElement(By.id("username")).sendKeys("student");
		d.findElement(By.id("password")).sendKeys("Password123");
		d.findElement(By.id("submit")).click();
		
	   String Current_url=d.getCurrentUrl();
	   if(Current_url.contains("https://practicetestautomation.com/practice-test-login/"))
	   {
		   System.out.println("test is passed");
	   }
	   else
	   {
		   System.out.println("test is failled");
	   }
	   
	   String pageSource = d.getPageSource();
       if (pageSource.contains("Congratulations") || pageSource.contains("successfully logged in")) {
           System.out.println("Text verification passed");
       } else {
           System.out.println("Text verification failed");
       }

		
		

	}

}
