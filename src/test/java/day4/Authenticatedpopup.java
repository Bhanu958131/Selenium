package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authenticatedpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		String text=d.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
  
		if(text.contains("Congratulations"))
		{
			System.out.println("Successfully");
		}
		else
		{
			System.out.println("login failed");
		}
	}

}
