package day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(d,Duration.ofSeconds(10));
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		 
//		Alert window=d.switchTo().alert();
		Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alertwindow.getText());
		
//		alertwindow.accept();
		
		alertwindow.dismiss();

	}

}
