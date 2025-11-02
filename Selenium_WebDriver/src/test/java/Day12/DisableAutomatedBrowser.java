package Day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedBrowser {

	public static void main(String[] args) {
		
		ChromeOptions op = new ChromeOptions();
		op.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		
		WebDriver driver = new ChromeDriver(op); //run in backend 
		
		driver.get("https://www.google.com/");

	}

}
