package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.opencart.com/");
		
		d.manage().window().maximize();
		
		String product=d.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();
		 
		System.out.println(product);
		
		
	}

}
