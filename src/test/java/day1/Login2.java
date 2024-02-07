package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement t1=d.findElement(By.xpath("//input[@id='Email']"));
		t1.clear();
		t1.sendKeys("admin@yourstore.com");
		
		WebElement t2=d.findElement(By.xpath("//input[@id='Password']"));
		t2.clear();
		t2.sendKeys("admin");
		
		d.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String A_title=d.getTitle();
		String E_title="Dashboard";
		
		if(A_title.equals(E_title))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failled");
		}
		
	}

}
