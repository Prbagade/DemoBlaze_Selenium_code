package Day13;

import org.testng.annotations.Test;

public class FirdtTestCase 
{
	@Test (priority=1)
	void openapp() 
	{
		System.out.println("Opening application...");
	}
	
	@Test (priority=2)
	void loginapp() 
	{
		System.out.println("Login to application");
	}
	
	@Test (priority=3)
	void logout() 
	{
		System.out.println("Logout from application");
	}

}
