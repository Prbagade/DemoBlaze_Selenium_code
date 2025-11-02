package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.HomePage;
import TestBase.BaseClass;

public class TC001_HomePageTest extends BaseClass
{

	@Test
	void Verify_HomePage_UI() throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
	
		
		hp.LogoValidation();
		hp.BrandValidate();
		hp.CategoryCount();
		hp.ImagesCount();
		hp.ValidateTitle();
		
		
		
	}
}
