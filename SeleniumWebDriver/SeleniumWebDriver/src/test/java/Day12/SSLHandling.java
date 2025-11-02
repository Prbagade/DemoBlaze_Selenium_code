package Day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLHandling {

	public static void main(String[] args)
	{
		ChromeOptions op = new ChromeOptions();
		op.setAcceptInsecureCerts(true);  //accepts ssl certificate
		
		WebDriver driver = new ChromeDriver(op); //run in backend 
		
		driver.get("https://expired.badssl.com/");

		
		
		
		
		
	}

}
