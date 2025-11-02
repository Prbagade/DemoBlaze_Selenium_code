package Day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParallTest {

	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
	void Setup(String br) 
	{
		switch(br.toLowerCase()) {
		case "chrome" :driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		default: System.out.println("Invalid browser"); return;
		
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	@Test (priority=1)
	void TestLogo() throws InterruptedException 
	{
		Thread.sleep(1000);
		boolean logo=driver.findElement(By.xpath("//*[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logo, true);
		
		
	}
	
	@Test(priority=2)
	void TestTitle() 
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority=3)
	void TestURL() 
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=4)
	void TearDown() 
	{
		driver.quit();
		
	}
	
}
