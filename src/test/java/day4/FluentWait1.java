package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		FluentWait my=new FluentWait(d)	 ;
		my.withTimeout(Duration.ofSeconds(10));
		my.pollingEvery(Duration.ofSeconds(10));
		my.ignoring(NoSuchElementException.class);
		
//		WebElement usename=(WebElement) my.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username")));
	
		WebElement username=(WebElement) my.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
	}

}
