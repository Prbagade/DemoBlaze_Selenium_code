package Day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_Calander {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		
		//Switch to frame 
		driver.switchTo().frame(0);
		
		//Method 1: Using sendKey();
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/14/2025"); //mm/dd/yy
		
		//Method 2: Using Date Picker/Calander 
		//expeccted date
		String year="2025";
		String month="July";
		String date="15";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true)
		{
			String CurrentMonth=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
			String CurrentYear=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
			
			if(CurrentMonth.equals(month) && CurrentYear.equals(year)) 
			{
				break;
			}
			
			//driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next
			
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //previous
		}
		
		//For dates
		List<WebElement>Dates=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement DT:Dates) 
		{
			if(DT.getText().equals(date)) 
			{
				DT.click();
				break;		 
			}
		}
		
		
		
		
		
	}

}
