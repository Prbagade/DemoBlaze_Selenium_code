package TestCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import PageObjects.HomePage;
import PageObjects.RegistrationPage;

public class TC001_RegistrationPageTest2 {

	public WebDriver driver;
	
	@BeforeClass
	public void Setup() 
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void verify_account_Registratioin()
	{
		HomePage hp = new HomePage(driver);
		hp.ClickAccount();
		hp.ClickRegister();
		
		RegistrationPage rp= new RegistrationPage(driver);
		
		rp.setFirstName(randomString().toUpperCase());
		rp.setLastName(randomString().toUpperCase());
		rp.setEmail(randomString()+"@gmail.com");
		rp.setPhone(randomNumber());
		
		//for same pass
		String pass=randomalphaNumeric(); 
		
		rp.setPassword(pass);
		rp.setConfmPassword(pass);
		
		rp.setPolicy();
		rp.ClickContinue();
		
		String confmsg= rp.getConfirmationMsg();
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
		rp.ClickConfMsg();
	}
	
	
	public String randomString() 
	{
		String generatedString =RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomNumber() 
	{
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}
	
	public String randomalphaNumeric() 
	{
		String generatedSring = RandomStringUtils.randomNumeric(3);
		String generatedNumber = RandomStringUtils.randomNumeric(3);
		return generatedSring+"@"+generatedNumber;
	}
	
	@AfterClass
	public void TearDown() 
	{
		
		driver.close();
	}
}
