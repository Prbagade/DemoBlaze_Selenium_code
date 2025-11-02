package Day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		// click on PIM
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		//Dropdown select
		driver.findElement(By.xpath("(//*[@class=\"oxd-select-text-input\"])[3]")).click();		
		
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//*[text()='Automaton Tester']")).click();
		
		List<WebElement>DropBoxes=driver.findElements(By.xpath("//*[@role=\"listbox\"]//div[@class='oxd-select-option']"));
		
		System.out.println("No of Option = "+DropBoxes.size());
		
		
		for(WebElement Drop:DropBoxes) 
		{
			System.out.println("Title of option = "+Drop.getText());
		}
		
	}

}
