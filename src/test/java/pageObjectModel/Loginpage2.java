package pageObjectModel;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {

	public WebDriver driver;
	
	//Constructor
	Loginpage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	// locators
    @FindBy(xpath=("//img[@alt='company-branding']"))
    WebElement Logo;
	@FindBy(name=("username")) WebElement txt_username;
	
	@FindBy(css=("input[placeholder='Password']")) WebElement txt_password;
	@FindBy(xpath=("//button[normalize-space()='Login']")) WebElement Btn_submit;
	
	
	//Action methods
	
	public void setUserName(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		Btn_submit.click();
	}
	
	public boolean checkLogoPresence()
	{
		boolean status=Logo.isDisplayed();
		return status;
	}

	
	
	
}
