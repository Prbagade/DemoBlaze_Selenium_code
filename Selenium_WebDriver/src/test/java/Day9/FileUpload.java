package Day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		/* driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Prafull\\OneDrive\\Documents\\SQL data\\practice 1.sql");
		
		if(driver.findElement(By.xpath("//*[@id='fileList']//li")).getText().equals("bootstrap.txt"))
		{
			System.out.println("Test Passed");
			
		}
		else
		{
			System.out.println("Test Failed");
		} */
		
		String file1="";
		


	}

}
