 package Day14;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class demo {
	
	WebDriver driver;
	
	@BeforeClass
	void Setup() 
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	@Test (dataProvider="dp")
	void TestLogin(String user, String pwd) throws InterruptedException 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(user);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
		boolean logo =driver.findElement(By.xpath("//*[@alt='client brand banner']")).isDisplayed();
		if(logo==true) 
		{
			driver.findElement(By.xpath("//*[@class='oxd-userdropdown-tab']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[text()='Logout']")).click();
			Assert.assertTrue(true);
			
		}
		else 
		{
			Assert.fail();
		}
		
	}
	
	@AfterClass
	void TearDown() 
	{
		driver.close();
	}
	
	@DataProvider(name="dp",indices= {0,2})
	Object [][] LoginData() 
	{
		Object data [][]= {
				{"Admin","admin123"},
				{"Admin","admin"},
				{"Adm","admin123"},
				};
		
		return data;
	}

}
