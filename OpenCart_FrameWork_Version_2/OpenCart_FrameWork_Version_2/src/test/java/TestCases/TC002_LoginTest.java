package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import PageObjectModel.MyAccountPage;
import TestBase.BaseClass;

public class TC002_LoginTest extends BaseClass
{
	@Test(groups={"Sanity","Master"})
	public void verify_login() 
	{
		logger.info("**** Starting TC002_LoginTest ****");
		try {
		//HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//LoginPage  //add properties file data
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		//MyAccountPage
		MyAccountPage myac = new MyAccountPage(driver);
		myac.clickLogout();
		
		boolean targetPage=myac.isMyAccountPageExists();
		Assert.assertTrue(targetPage);
		}
		catch(Exception e) 
		{
			Assert.fail();
		}
		logger.info("**** Finished TC002_LoginTest ****");
	}
}
