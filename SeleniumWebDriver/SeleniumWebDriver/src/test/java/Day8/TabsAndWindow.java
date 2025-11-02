package Day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindow {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//Selenium 4 onward
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//For seperate window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.yahoo.com/");
		
		
		
		
		
	}

}
