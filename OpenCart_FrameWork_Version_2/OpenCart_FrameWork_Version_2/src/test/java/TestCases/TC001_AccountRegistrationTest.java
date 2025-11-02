package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjectModel.HomePage;
import PageObjectModel.RegistrationPage;
import TestBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass 
{
	
	@Test(groups={"Regression","Master"})
	void Verify_acc_Registration() 
	{
		logger.info("**** Starting TC001_AccountRegistrationTest ****");		
		
		try {
		HomePage hp = new HomePage(driver);
		
		hp.clickMyAccount();
		logger.info("**** Clicked on MyAccount Link ****");	
		
		hp.clickRegisteration();
		logger.info("**** Clicked on Register Link ****");
		
		RegistrationPage rp= new RegistrationPage(driver);
		
		logger.info("**** Providing Custmor Deatils ****");
		rp.setFirstName(randomString().toUpperCase());
		rp.setLastName(randomString().toUpperCase());
		rp.setEmail(randomString()+"@gmail.com");
		rp.setTelephone(randomNumber());
		
		String password=randomAlphaNumber();
		
		rp.setPassword(password);
		rp.setConfPassword(password);
		rp.clickPolicy();
		rp.clickContinue();
		
		logger.info("**** Validating expected massage ****");
	String confMsg=rp.getConfirmationMsg();
	
	if(confMsg.equals("Your Account Has Been Created!")) 
	{
		Assert.assertTrue(true);
	}
	else 
	{
		logger.error("Test Failed...");
		logger.debug("Debug logs...");
		Assert.assertTrue(false);
	}
	//Assert.assertEquals(confMsg, "Your Account Has Been Created!!!!");
		}
		catch(Exception e) 
		{
		
			Assert.fail();
		}
		logger.info("**** Finished TC001_AccountRegistrationTest ****");	
	}
}
