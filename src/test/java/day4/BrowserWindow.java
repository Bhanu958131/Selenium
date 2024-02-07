package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
	    WebDriver d=new ChromeDriver();
	    
	    d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    d.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    
	    
	    

	}

}
