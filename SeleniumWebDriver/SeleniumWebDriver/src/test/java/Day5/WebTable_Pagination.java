package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Pagination {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/TlbeVW/index.php?route=common/login");
		
		Thread.sleep(10000);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='input-password']"));
		pass.clear();
		pass.sendKeys("demo");
		
		driver.findElement(By.xpath("//*[text()=' Customers']")).click();
		driver.findElement(By.xpath("//*[@id='collapse-5']")).click();
		
		String text=driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
		
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		for(int p=1;p<=total_pages;p++) 
		{
			
			if(p>1) 
			{
				WebElement act_pages=driver.findElement(By.xpath("//ul[@class='pagination']//a[text()="+p+"]"));
			}
		}
		

		int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		
		for(int r=1;r<=rows;r++) 
		{
			String CustName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
			String Email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
			String Status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();
			
			System.out.println(CustName+"  "+Email+"  "+Status);
		
		}
		
		
		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("window.scroll(0,2500)");
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
