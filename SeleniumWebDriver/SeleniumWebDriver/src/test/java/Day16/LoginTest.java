package Day16;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest
{
	WebDriver driver;
	
	@BeforeClass
	void Setup() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@Test
	void TestLogin() 
	{
		LoginPage2 lp = new LoginPage2(driver); 
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.ClickOnLogin();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void TearDown() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
