package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrcollAction {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		WebElement PGTable=driver.findElement(By.xpath("//*[text()='Pagination Web Table']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scroll(0,1500)");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		// at specific ele
		//js.executeScript("arguments[0].scrollIntoView();",PGTable);
		
		//bottom of browser
		js.executeScript("window.scroll(0,document.body.scrollHeight)");
		
		Thread.sleep(1000);
		
		js.executeScript("window.scroll(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
	
		js.executeScript("document.body.style.zoom='50%'");
		
	}

}
