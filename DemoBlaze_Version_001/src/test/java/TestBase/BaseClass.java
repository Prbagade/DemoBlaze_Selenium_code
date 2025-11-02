package TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public static WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser() 
	{
		//driver = new ChromeDriver();
		driver = new EdgeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	
	 public String captureScreen(String tname)throws IOException
	    {
	        String timeStamp= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	        
	        TakesScreenshot takesScreenshot= (TakesScreenshot)driver;
	        File sourceFile= takesScreenshot.getScreenshotAs(OutputType.FILE);
	        
	        String targetFilePath= System.getProperty("user.dir")+"\\Screenshots\\"+ tname + "_" + timeStamp + ".jpg";
	        File targetFile= new File(targetFilePath);
	        sourceFile.renameTo(targetFile);
	        return targetFilePath;
	    }
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
