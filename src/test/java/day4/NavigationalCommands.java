package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        
        d.navigate().to("https://www.amazon.com/");
        System.out.println(d.getCurrentUrl());
        
        d.navigate().to("https://www.flipkart.com/");
        System.out.println(d.getCurrentUrl());
        
        d.navigate().back();
        System.out.println(d.getCurrentUrl());
        
        d.navigate().forward();
        System.out.println(d.getCurrentUrl());
        
        d.navigate().refresh();
        
        
	}

}
