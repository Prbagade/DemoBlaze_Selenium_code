package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetWindowHanldesDemo {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/login");
		
		WebElement RegLink=driver.findElement(By.xpath("//*[text()='Register']"));
		
		Actions act = new Actions(driver);
		
		//Ctrol+RegLink
		act.keyDown(Keys.CONTROL).click(RegLink).keyUp(Keys.CONTROL).perform();
		
	//	driver.getWindowHandle(1);

		
		
		
		
		
	}

}
