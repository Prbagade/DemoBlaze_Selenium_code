package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement DoubleClick=driver.findElement(By.xpath("//*[text()='Copy Text']"));
		
		Actions act = new Actions(driver);
		
		//Double click
		act.doubleClick(DoubleClick).build().perform();
		
		//ContextClick
		act.contextClick(DoubleClick).build().perform();
		
		
		
	}

}
