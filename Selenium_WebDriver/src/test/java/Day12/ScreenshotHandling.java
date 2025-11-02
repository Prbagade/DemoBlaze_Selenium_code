package Day12;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotHandling {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.flipkart.com/");
		driver.manage().window().maximize();
		
//		//1) full page
		TakesScreenshot ts = (TakesScreenshot)driver;
//		File sourcefile =ts.getScreenshotAs(OutputType.FILE);
//		File targetFile =new File(System.getProperty("user.dir")+"\\Screenshots\\Fullpage.png");
//		sourcefile.renameTo(targetFile); //copy sourcefile to targetfile

		
		//2) Specific Area
//		WebElement futuredProduct=driver.findElement(By.xpath("//*[@class='tLbyDf']"));
//		File sourcefile=futuredProduct.getScreenshotAs(OutputType.FILE);
//		File targetfile= new File(System.getProperty("user.dir")+"\\Screenshots\\FuturedProduct.png");
//		sourcefile.renameTo(targetfile);
		
		//3) Specific WebElement
		WebElement logo=driver.findElement(By.xpath("(//*[@title='Flipkart'])[3]"));
		File sourcefile =logo.getScreenshotAs(OutputType.FILE);
		File targetfile =new File(System.getProperty("user.dir")+"\\Screenshots\\Product.jpg");
		sourcefile.renameTo(targetfile);
		
		driver.close();
		
		
		
	}

}
