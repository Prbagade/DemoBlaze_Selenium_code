package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	@FindBy(xpath="//input[@id='loginusername']") WebElement txt_Username;
	@FindBy(xpath="//input[@id='loginpassword']") WebElement txt_Password;
	@FindBy(xpath="//button[@onclick='logIn()']") WebElement btn_Login;
	
	
	public void EnterUsername(String username) 
	{
		txt_Username.sendKeys(username);
	}
	
	public void EnterPassword(String pass) 
	{
		txt_Password.sendKeys(pass);
	}
	
	public void LogInButton() 
	{
		btn_Login.click();
	}
	
	
	
	
}
