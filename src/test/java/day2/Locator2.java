package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=14925814379708776625&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061994&hvtargid=kwd-311187680635&hydadcr=5841_2362028&gclid=Cj0KCQiA-62tBhDSARIsAO7twbb52yHcONrQa5aOx6jco9uNDmei3NVW5QxTsd9eENy2Mnw9757bNLUaAuSmEALw_wcB");
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("pants men");
		d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		d.findElement(By.xpath("//div[@class='rush-component s-featured-result-item s-expand-height']//span[@class='a-size-base-plus a-color-base a-text-normal'][normalize-space()='Men Pants']")).click();

		List<WebElement>slider=d.findElements(By.className("a-carousel-card"));
		System.out.println(slider.size());
		
		List<WebElement> img=d.findElements(By.tagName("img"));
		System.out.println(img.size());
		
		List<WebElement> links=d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
	}

}
