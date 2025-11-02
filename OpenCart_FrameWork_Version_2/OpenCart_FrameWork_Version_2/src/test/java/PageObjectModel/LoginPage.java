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
	
	@FindBy(xpath = "//input[@name='email']") WebElement txt_emailID;
	
	@FindBy(xpath = "//input[@name='password']") WebElement txt_password;
	
	@FindBy(xpath = "//input[@type='submit']") WebElement btn_login;
	
	public void setEmail(String userName) 
	{
		txt_emailID.sendKeys(userName);
	}
	
	public void setPassword(String password) 
	{
		txt_password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
}
