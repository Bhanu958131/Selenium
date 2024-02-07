package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandledropdownwithSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		WebElement dropcount=d.findElement(By.xpath("//select[@id='country-list']"));
		Select dropcount1=new Select(dropcount);
		
		dropcount1.selectByVisibleText("India");
		dropcount1.selectByIndex(5);
		dropcount1.selectByValue("4");
		
		List<WebElement>options=dropcount1.getOptions();
		System.out.println(options.size());
		
//		for(int i=0;i<options.size();i++)
//		{
//			System.out.println(options.get(i).getText());
//			
//		}
		
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		
		

	}

}
