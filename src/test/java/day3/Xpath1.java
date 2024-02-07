package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.nopcommerce.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		//d.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mac Book");
		//d.findElement(By.cssSelector("button[type='submit']")).click();
		
		d.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mac Book");
		
		d.findElement(By.cssSelector(".button-1")).click();
		
		
		//d.findElement(By.cssSelector("[type='text']")).sendKeys("Mac Book");
		//d.findElement(By.cssSelector("[type='submit']")).click();

		//d.findElement(By.cssSelector("input.search-box-text[type='text']")).sendKeys("Mac Book");
		//d.findElement(By.cssSelector(".button-1[type='submit']")).click();
		
		
		d.quit();
	}

}
