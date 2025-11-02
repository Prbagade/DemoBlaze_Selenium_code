package Day15_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//@Listeners(Day15_TestNG.ClassLister.class)
public class OrangeHRM
{
	WebDriver driver;
	
	
	@BeforeClass
	void Setup() 
	{
		driver = new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	@Test (priority=1)
	void TestLogo() throws InterruptedException 
	{
		Thread.sleep(2000);
		boolean logo=driver.findElement(By.xpath("//*[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logo, true);
	}
	
	@Test(priority=2)
	void TestURL() 
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=3, dependsOnMethods= {"TestURL"})
	void HomePageTitle() 
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void TearDown() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
		
	}


}
