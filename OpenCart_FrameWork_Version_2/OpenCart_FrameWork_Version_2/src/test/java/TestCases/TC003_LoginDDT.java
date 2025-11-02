package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import PageObjectModel.MyAccountPage;
import TestBase.BaseClass;
import Utilities.DataProviders;

/*
 * Data is valid- login success- test pass- logout
 * Data is valid- login failed- test failed
 * 
 * Data is invalid- login success- test fail- logout
 * Data is invalid- login failed- test pass
 */

public class TC003_LoginDDT extends BaseClass
{
		@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="datadriven")
		public void verify_loginDDT(String email, String pwd, String exp)
		{
			logger.info("**Starting TC003_LoginDDT****");
			try {
			//HomePage
			HomePage hp= new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			//LoginPage
			LoginPage lp= new LoginPage(driver);
			lp.setEmail(email);
			lp.setPassword(pwd);
			lp.clickLogin();
			
			//MyAccount
			MyAccountPage myac= new MyAccountPage(driver);
			boolean targetPage= myac.isMyAccountPageExists(); 
		
			System.out.println("ExpectedRes : "+ exp +"\t"+"Email : "+ email + "\t"+"Password : "+pwd);
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
				myac.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
				myac.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			}
			}
			catch(Exception e)
			{
				Assert.fail();
			}
			logger.info("**Finished TC003_LoginDDT****");
		}
}
