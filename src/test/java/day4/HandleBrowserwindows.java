package day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		d.manage().window().maximize();
		d.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String > windowid=d.getWindowHandles();
		List<String> windowid2=new ArrayList(windowid);
		 
		String parentwindow=windowid2.get(0);
		String childwindow=windowid2.get(1);
		
		d.switchTo().window(childwindow);
		d.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		
		d.switchTo().window(parentwindow);
		d.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");

	}

}
