package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_hover {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement m1=driver.findElement(By.xpath("//*[@class='dropbtn']"));
		
		WebElement m2=driver.findElement(By.xpath("//*[text()='Laptops']"));
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(m1).moveToElement(m2).click().build().perform();
		
		
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));
		
		
		
	}

}
