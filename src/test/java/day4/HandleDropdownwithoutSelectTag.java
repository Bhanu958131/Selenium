package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdownwithoutSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver d=new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		d.manage().window().maximize();
		
        d.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
        List<WebElement> options=d.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
        
        System.out.println(options.size());
        
        
       for( int i=0;i<options.size();i++)
       {
    	   System.out.println(options.get(i).getText());
    	   
       }
       
//       for(int i=0;i<options.size();i++)
//       {
//    	   String op=options.get(i).getText();
//    	   if(op.equals("Java") ||op.equals(" Python") )
//    	   {
//    		   options.get(i).click();
//    	   }
//    	   
//       }
       
       for(WebElement op:options)
       {
    	   String text=op.getText();
    	   if(text.equals("Java") || text.equals("python"))
    	   {
    		   op.click();
    	   }
       }
        
        
	}

}
