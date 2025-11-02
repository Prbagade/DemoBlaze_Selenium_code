package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	
	//Constructor
	public HomePage(WebDriver driver) 
	{	
		super(driver);
	}
	
	@FindBy(xpath = "//span[text()='My Account']") WebElement LinkAccount;
	@FindBy(xpath = "//a[text()='Register']") WebElement LinkRegister;

	@FindBy(xpath = "//*[text()='Login']") WebElement LinkLogin;
	
	
	public void ClickAccount() 
	{
		LinkAccount.click();
	}
	
	public void ClickRegister() 
	{
		LinkRegister.click();
	}
	
	public void ClickLogin() 
	{
		LinkLogin.click();
	}
	
}
