package Day8;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Tabs {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/login");
		
		WebElement RegLink=driver.findElement(By.xpath("//*[text()='Register']"));
		
		Actions act = new Actions(driver);
		
//		//Ctrol+RegLink
//		act.keyDown(Keys.CONTROL).click(RegLink).keyUp(Keys.CONTROL).perform();
//		
//		//switch to registration page
//		List<String> ids=new ArrayList(driver.getWindowHandles());
//		
//		//Registration 
//		driver.switchTo().window(ids.get(1)); //switch to registration page
//		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Jagdish");
//		
//		//Home Page
//		driver.switchTo().window(ids.get(0));
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Bagade");
		
		
		
	
		
	}

}
