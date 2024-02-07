package loginandannotations;

//import org.testng.annotations.*;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {
	
	WebDriver d;
  @Test(priority=1)
  public void OpenApp() 
  {
	  WebDriverManager.chromedriver().setup();
	  d=new ChromeDriver();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  d.manage().window().maximize();
	  
  }
  
  @Test(priority=2)
  void Login()
  {
	  d.findElement(By.name("username")).sendKeys("Admin");
	  d.findElement(By.name("password")).sendKeys("admin123");
	  d.findElement(By.xpath("//button[normalize-space()='Login']")).click();
  }
  
  @Test(priority=3)
  void Closeapp()
  {
	  d.quit();
  }
}
