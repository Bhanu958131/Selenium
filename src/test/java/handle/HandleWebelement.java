package handle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebelement {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		System.out.println("bhanu");
		d.get("https://www.selenium.dev/");
		
		System.out.println("prakash");

	}

}
