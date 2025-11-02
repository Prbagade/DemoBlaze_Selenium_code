package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver drv = new ChromeDriver();
		
		//drv.get("https://www.opencart.com/");
		
		drv.navigate().to("https://www.opencart.com/");
		drv.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		drv.navigate().back();
		System.out.println(drv.getCurrentUrl());
		
		Thread.sleep(2000);
		
		drv.navigate().forward();
		System.out.println(drv.getCurrentUrl());
		
		drv.navigate().refresh();
	}

}
