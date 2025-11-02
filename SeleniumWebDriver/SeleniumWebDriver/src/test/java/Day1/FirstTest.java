package Day1;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {

	public static void main(String[] args)
	{		
		WebDriver drv = new ChromeDriver();
		
		WebDriverWait wait= new WebDriverWait(drv,Duration.ofSeconds(10));
		
		drv.get("https://www.facebook.com/");
		
		drv.manage().window().maximize();
	
		//FluentWait
		Wait<WebDriver> mywait= new FluentWait<WebDriver>(drv)  
		       .withTimeout(Duration.ofSeconds(30))   //Given time
		       .pollingEvery(Duration.ofSeconds(5))   //cycle time
		       .ignoring(NoSuchElementException.class); 
 
		   WebElement UserEle = mywait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//*[@name='email']"));
		   
		     }
		   });
		   UserEle.sendKeys("9960748548");
		   
		   WebElement PassEle = mywait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//*[@name='pass']"));
			   
			     }
			   });
		   	PassEle.sendKeys("Praful@123");
		
		   	WebElement BTNEle = mywait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//*[@name='login']"));
			   
			     }
			   });
		   	BTNEle.click();
		   	
	//	drv.close();
		
		
	
	}

}
