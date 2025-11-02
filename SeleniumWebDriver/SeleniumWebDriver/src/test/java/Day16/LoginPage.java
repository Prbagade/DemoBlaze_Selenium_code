package Day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	By txt_Username=By.xpath("//*[@name='username']");
	By txt_Pass=By.xpath("//*[@name='password']");
	By txt_Submit=By.xpath("//*[@type='submit']");
	
	
	//Action methods
	public void setUsername(String user) 
	{
		driver.findElement(txt_Username).sendKeys(user);	
	}
	
	public void setPassword(String pass) 
	{
		driver.findElement(txt_Pass).sendKeys(pass);	
	}
	
	public void ClickOnLogin() 
	{
		driver.findElement(txt_Submit).click();	
	}

}
