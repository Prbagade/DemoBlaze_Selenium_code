package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DropDownHandle {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.findElement(By.xpath("//select[@id='country']")).click();
		
		WebElement DropDown=driver.findElement(By.xpath("//select[@id='country']"));
		Select DropDownBox = new Select(DropDown);
		
		// method
		//Select specific 
		//DropDownBox.selectByVisibleText("Japan");
		//DropDownBox.selectByValue("canada");
		//DropDownBox.selectByIndex(3);
		
		List<WebElement>Options=DropDownBox.getOptions();
		System.out.println("No of Options : "+Options.size());
		
		System.out.println("*********************************************");
		
		//Using For loop
//		for(int i=0;i<Options.size();i++)
//		{
//			System.out.println(Options.get(i).getText());	
//		}
		
		//Enhanced for loop
//		for(WebElement Ops:Options) 
//		{
//			System.out.println(Ops.getText());
//		}
		

		
		
		
		
	}

}
