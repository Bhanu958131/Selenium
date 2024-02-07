package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.opencart.com/");
		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		System.out.println(d.getTitle());
		
		System.out.println(d.getCurrentUrl());
		
//		System.out.println(d.getPageSource());
		
		System.out.println(d.getWindowHandle());
		
		System.out.println(d.getWindowHandles());
		
		d.quit();
		
	}

}
