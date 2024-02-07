package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithInputBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);

		d.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert window=d.switchTo().alert();
		System.out.println(window.getText());
		
		window.sendKeys("bhanuprakash");
		window.accept();
		
		String A_text=d.findElement(By.xpath("//p[@id='result']")).getText();
		String E_text="You entered: bhanuprakash";
		
		System.out.println(A_text);
		System.out.println(E_text);
		
		if(A_text.equals(E_text))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
	}

}
