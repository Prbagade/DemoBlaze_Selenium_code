package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage 
{
	
	public RegistrationPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//*[@name='firstname']") WebElement txt_FirstName;
	
	@FindBy(xpath = "//*[@name='lastname']") WebElement txt_LastName;
	
	@FindBy(xpath = "//*[@name='email']") WebElement txt_Email;
	
	@FindBy(xpath = "//*[@name='telephone']") WebElement txt_TelePhone;
	
	@FindBy(xpath = "//*[@name='password']") WebElement txt_Password;
	
	@FindBy(xpath = "//input[@name='confirm']") WebElement txt_ConfPassword;
	
	@FindBy(xpath = "//*[@name='agree']") WebElement Chk_Policy;
	
	@FindBy(xpath = "//*[@value='Continue']") WebElement btn_Continue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']") WebElement MsgConfirmation;
	
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
		txt_Email.sendKeys(email);
	} 
	
	public void setTelephone(String tele) 
	{
		txt_TelePhone.sendKeys(tele);
	} 
	
	public void setPassword(String pass) 
	{
		txt_Password.sendKeys(pass);
	} 
	
	public void setConfPassword(String ConfPass) 
	{
		txt_ConfPassword.sendKeys(ConfPass);
	} 
	
	public void clickPolicy() 
	{
		Chk_Policy.click();
	} 
	
	public void clickContinue() 
	{
		btn_Continue.click();
	}
	
	public String getConfirmationMsg() 
	{
		try {
			return (MsgConfirmation.getText());
		}
		catch (Exception e) {
			return(e.getMessage());
		}
	}	
}
