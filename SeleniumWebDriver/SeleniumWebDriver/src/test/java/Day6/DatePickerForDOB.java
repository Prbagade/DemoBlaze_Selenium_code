package Day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerForDOB {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		//Input DOB
		String Year ="2020";
		String Month ="May";
		String Day ="4";
		
		
		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("window.scroll(0,2000");
		
		Thread.sleep(1000);
		
		//ClickOnCalander
		driver.findElement(By.xpath("//*[@id='txtDate']")).click();
		
		Thread.sleep(1000);
		
		//Month
		WebElement month =driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
	
		Select mm= new Select(month);
		mm.selectByVisibleText(Month);
		
		//Year
		WebElement year =driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
		
		Select yy= new Select(year);
		yy.selectByVisibleText(Year);
		
		//Day
		List<WebElement>Dy=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		
		
		for(WebElement dt:Dy) 
		{
			if(dt.equals(Day)) 
			{
				//System.out.println("Todays Date ="+ dt.getText());
				dt.click();
				break;
				
			}
		
		}
		
		driver.close();
		
		
		

		
	}

}
