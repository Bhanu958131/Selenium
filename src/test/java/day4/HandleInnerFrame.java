package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleInnerFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get("https://ui.vision/demo/webtest/frames/");
		d.manage().window().maximize();
		Thread.sleep(1000);
		//frame1
		WebElement frame1=d.findElement(By.xpath("//frame[@src='frame_1.html']"));
		d.switchTo().frame(frame1);
		d.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("bhanu");
		d.switchTo().defaultContent();
		
		//frame 2
		
		WebElement frame2=d.findElement(By.xpath("//frameset//frameset//frame[1]"));
		d.switchTo().frame(frame2);
		d.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Swathi");
		d.switchTo().defaultContent();
		
		//frame 3
		
		WebElement frame3=d.findElement(By.cssSelector("frame[src='frame_3.html']"));
		d.switchTo().frame(frame3);
		d.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Bujji");
		d.switchTo().frame(0);
		 
		d.findElement(By.className("AB7Lab")).click();
		
		d.switchTo().defaultContent();
		
		//frame 4
		WebElement frame4=d.findElement(By.cssSelector("frame[src='frame_4.html']"));
		d.switchTo().frame(frame4);
		d.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("1234");
		
		
		
	}

}
