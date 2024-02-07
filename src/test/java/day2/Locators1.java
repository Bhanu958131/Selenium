package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("http://www.automationpractice.pl/index.php?id_category=3&controller=category");
		
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		d.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		d.findElement(By.xpath("//button[@name='submit_search']")).click();
//		d.findElement(By.xpath("//a[normalize-space()='Blouse']")).click();
//		d.findElement(By.xpath("//button[normalize-space()='Tweet']")).click();
		d.findElement(By.partialLinkText("T-shir")).click();
		
		List<WebElement >slider=d.findElements(By.className("content_scene_cat_bg"));
		System.out.println(slider.size());
		
		List<WebElement >images =d.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		List<WebElement >links =d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		d.quit();

	}

}
