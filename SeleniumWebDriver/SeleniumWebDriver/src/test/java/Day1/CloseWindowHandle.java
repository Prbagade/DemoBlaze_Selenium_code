package Day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindowHandle {

	public static void main(String[] args)
	{
	WebDriver drv = new ChromeDriver();
		
		drv.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		drv.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		Set<String>windowID=drv.getWindowHandles(); 
		
		for(String winID:windowID) 
		{
			String title=drv.switchTo().window(winID).getTitle();
			System.out.println(title);
			
//			if(title.equals("Human Resources Management Software | OrangeHRM HR Software")) 
//			{
//				drv.close();
//				break;
//				
//			}
			if(title.equals("Human Resources Management Software | OrangeHRM HR Software") || title.equals("OrangeHRM")); 
			{
				drv.close();
				
			}
		}
		


	}

}
