package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import TestBase.BaseClass;

public class TC002_LoginTest extends BaseClass
{
	
	@Test
	public void verify_login() throws InterruptedException 
	{
		logger.info("**** Starting TC002_LoginTest ****");
		
		try {
		//HomePage
		HomePage hp = new HomePage(driver);
		hp.ClickAccount();
		hp.ClickLogin();
		
		//LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.LoginButtom();
		
		//MyAccountPage
		MyAccountPage myac = new MyAccountPage(driver);
		myac.ClickLogout();
		boolean targetPage =myac.isMyAccountPageExists();
		
		//Assert.assertEquals(targetPage, true,"Login failed");
		Assert.assertTrue(targetPage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
//		MyAccountPage myac = new MyAccountPage(driver);
//		
//		Thread.sleep(2000);
//		myac.ClickLogout();
		
		logger.info("**** Finished TC002_LoginTest ****");
	}

}
