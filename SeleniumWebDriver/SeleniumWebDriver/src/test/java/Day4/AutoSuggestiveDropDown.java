package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("selenium");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("(//*[text()='selenium'])[4]")).click();
		
		//ul[@role='listbox']//li//div[@role='option']
		List<WebElement>list=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		//count of list
		System.out.println("No. of List count = "+list.size());
		
		//print 
		for(int i=0;i<list.size();i++) 
		{
			System.out.println(i+" "+list.get(i).getText());
			
			//select one
			if(list.get(i).getText().equals("selenium java")) 
			{
				list.get(i).click();
				break;
			}
		}
		
	
	}

}
