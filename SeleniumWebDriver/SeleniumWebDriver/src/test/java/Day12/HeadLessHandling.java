package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessHandling {

	public static void main(String[] args) 
	{
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(op); //run in backend 
		
		driver.get("https:www.flipkart.com/");
		driver.manage().window().maximize();
		
		String Act_Title = driver.getTitle();
		//System.out.println(driver.getTitle());
		
		//validate Title
		if(Act_Title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) 
		{
			System.out.println("Test Passed");
			
		}
		else
		{
			System.out.println("Test Failed");
		}
		
	}

}
