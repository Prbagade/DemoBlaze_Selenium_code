package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//1) Select specific checkbox
		//driver.findElement(By.xpath("//*[@id='sunday']")).click();
		
		//2)Select all the checkbox
		
		List<WebElement>CheckBoxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
//		for(int i=0;i<CheckBoxes.size();i++) 
//		{
//			CheckBox.get(i).click();
//		}
		
		//Inehance forloop
//		for(WebElement ChqBox:CheckBoxes) 
//		{
//			ChqBox.click();
//		}
		
		//3) Select last 3 Checkbox 
		// 7-3= 4 (4 is indexing start)
//		for(int i=4;i<CheckBoxes.size();i++) 
//			{
//				CheckBoxes.get(i).click();
//			}
		
		//4)select first 3 checkbox
//		for(int i=0;i<3;i++) 
//		{
//			CheckBoxes.get(i).click();
//		}
		
		//5) unselected checkbox if they are selected
//		for(int i=0;i<3;i++) 
//		{
//			CheckBoxes.get(i).click();	
//		}
//		
//		Thread.sleep(2000);
//		
//		for(int i=0;i<CheckBoxes.size();i++) 
//		{
//			CheckBoxes.get(i).click();	
//		}
		
		//6)selected checkbox unselected
		for(int i=0;i<3;i++) 
		{
			CheckBoxes.get(i).click();	
		}
		
		Thread.sleep(2000);
		
		for(int i=0;i<CheckBoxes.size();i++) 
		{
			if(CheckBoxes.get(i).isSelected())
			{
				CheckBoxes.get(i).click();	
			}
			}
		}
		
	}


