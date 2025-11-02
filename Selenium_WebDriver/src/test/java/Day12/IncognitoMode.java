package Day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {

	public static void main(String[] args) 
	{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");  //incognito mode /hidden mode
		
		
		WebDriver driver = new ChromeDriver(op); //run in backend 
		
		driver.get("https://www.google.com/");
	}

}
