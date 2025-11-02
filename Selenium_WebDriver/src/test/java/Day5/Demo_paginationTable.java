package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_paginationTable {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
			
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scroll(0,2500)");

		//driver.findElement(By.xpath("//*[@class='table-container']//tbody/tr"));
		
		for(int p=1;p<=4;p++) 
		{
			
			WebElement act_page =driver.findElement(By.xpath("//a[text()="+p+"]"));
			Thread.sleep(1000);
			act_page.click();
			
		}
		
		int rows=driver.findElements(By.xpath("//*[@class='table-container']//tbody/tr[2]")).size();
		
		for(int r=0;r<=rows;r++) 
		{
			String Name=driver.findElement(By.xpath("//*[@class='table-container']//tbody/tr["+r+"]/td[2]")).getText();
			
			System.out.println(Name);
		}
		
	}

}
