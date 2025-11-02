package Day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{
	WebDriver driver;
	
	
	//constructor
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//Loc
	
	//@FindBy(xpath="//*[@name='username']") WebElement txt_Username;
	
	//aproche 2
	@FindBy(how=How.XPATH, using="//*[@name='username']") WebElement txt_Username;
	
	
	@FindBy(xpath="//*[@name='password']") WebElement txt_Password;
	@FindBy(xpath="//*[@type='submit']") WebElement txt_Btn;
	
	@FindBy(tagName="a") 
	List<WebElement> links;
	
	//Action methods
	public void setUsername(String user) 
	{
		txt_Username.sendKeys(user);
	}
	
	public void setPassword(String pass) 
	{
		txt_Password.sendKeys(pass);	
	}
	
	public void ClickOnLogin() 
	{
		txt_Btn.click();	
	}
	
	

}
