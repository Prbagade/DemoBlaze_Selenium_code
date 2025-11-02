package Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) 
	{
		
		WebDriver drv = new ChromeDriver();
		
		drv.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		drv.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		Set<String>windowID=drv.getWindowHandles(); //
		
//		//Approch_1
//		List<String>windowList=new ArrayList(windowID);
//		
//		String parentID =windowList.get(0);
//		String chilID =windowList.get(1);
//		
//		//switch to child
//		drv.switchTo().window(chilID);
//		System.out.println(drv.getTitle());
//		
//		//switch to parent
//		drv.switchTo().window(parentID);
//		System.out.println(drv.getTitle());
//		
		
		//Approch_2
		for(String winID:windowID) 
		{
			String title=drv.switchTo().window(winID).getTitle();
		
			if(title.equals("Human Resources Management Software | OrangeHRM HR Software")) 
		{
			System.out.println(drv.getCurrentUrl());
			
		}
		
		}
		
		
	}

}
