package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RegistrationPage;
import TestBase.BaseClass;

public class TC001_RegistrationPageTest extends BaseClass
{

	@Test
	public void verify_account_Registratioin()
	{
		logger.info("*** Starting TC001_RegistrationPageTest ***");
		
		try {
		HomePage hp = new HomePage(driver);
		hp.ClickAccount();
		logger.info("Clicked on MyAccount link");
		
		hp.ClickRegister();
		logger.info("Clicked on Register link");
		
		RegistrationPage rp= new RegistrationPage(driver);
		
		
		logger.info("Providing customer details...");
		
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
		
		logger.info("validating expected message..");
		String confmsg= rp.getConfirmationMsg();
		
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else 
		{
			logger.error("Test Failed...");
			logger.debug("Debug log..");
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		rp.ClickConfMsg();
		}
		catch(Exception e)
		{

			Assert.fail();
		}
		
		logger.info("*** Finished TC001_RegistrationPageTest ***");
	}
	

}
