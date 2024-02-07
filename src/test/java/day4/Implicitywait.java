package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitywait {
   public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	
	d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	
	d.findElement(By.xpath("//button[normalize-space()='Login']")).click();
}
}
