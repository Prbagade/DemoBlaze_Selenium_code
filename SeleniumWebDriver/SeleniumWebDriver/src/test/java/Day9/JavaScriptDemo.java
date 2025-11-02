package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class JavaScriptDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement ele1 =driver.findElement(By.xpath("//*[@name='start']"));
		
		WebElement ele2 =driver.findElement(By.xpath("//*[@placeholder='Enter Name']"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();",ele1);
		
		//js.executeScript("argumets[0].value='Praful'",ele2);
//		js.executeScript(“argument[0].value=’nameofuser’ ”,element);
		
		
		js.executeScript("arguments[0].setAttribute('value','praful')", ele2);
		
		
		
		
		
		
		
	}

}
