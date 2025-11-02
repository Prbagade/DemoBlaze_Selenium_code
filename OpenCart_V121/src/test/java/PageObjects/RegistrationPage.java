package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage 
{
	public RegistrationPage(WebDriver driver) 
	{
		super(driver);
	}

	//Locators
	@FindBy(xpath = "//*[@name='firstname']") WebElement txt_FirstName;
	@FindBy(xpath = "//*[@name='lastname']") WebElement txt_LastName;
	@FindBy(xpath = "//*[@name='email']") WebElement txt_EmailID;
	@FindBy(xpath = "//*[@name='telephone']") WebElement txt_PhoneNo;
	@FindBy(xpath = "//*[@name='password']") WebElement txt_Password;
	@FindBy(xpath = "//*[@name='confirm']") WebElement txt_ConfPassword;
	@FindBy(xpath = "//*[@name='agree']") WebElement ChkPolicy;
	@FindBy(xpath = "//*[@value='Continue']") WebElement BtnContinue;
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']") WebElement MsgConfirmation;
	@FindBy(xpath = "//a[text()='Continue']") WebElement BtnFinish;
	
	
	//Action Methods
	public void setFirstName(String fname) 
	{
		txt_FirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) 
	{
		txt_LastName.sendKeys(lname);
	}

	public void setEmail(String email) 
	{
		txt_EmailID.sendKeys(email);
	}
	
	public void setPhone(String tel) 
	{
		txt_PhoneNo.sendKeys(tel);
	}
	public void setPassword(String pass) 
	{
		txt_Password.sendKeys(pass);
	}
	public void setConfmPassword(String confmpass) 
	{
		txt_ConfPassword.sendKeys(confmpass);
	}
	public void setPolicy() 
	{
		ChkPolicy.click();
	}
	
	public void ClickContinue() 
	{
		BtnContinue.click();
	}
	
	
	//Validatio script
	public String getConfirmationMsg() 
	{
		try 	{
			return (MsgConfirmation.getText());
		}
		catch (Exception e) 
		{
			return (e.getMessage());
		}
	}
	
	public void ClickConfMsg() 
	{
		BtnFinish.click();
	}
	
	
}
