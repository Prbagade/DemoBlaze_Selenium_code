package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Iframe {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Frame 1
		WebElement Frame_1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(Frame_1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Testing");
		
		driver.switchTo().defaultContent(); // to comeback Parent/main page
		
		//Frame 2
		WebElement Frame_2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(Frame_2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		
		//Frame 3
		WebElement Frame_3=driver.findElement(By.xpath("//*[@src='frame_3.html']"));
		
		driver.switchTo().frame(Frame_3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Software");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class='d7L4fc bJNwt  FXLARc aomaEc ECvBRb']//div[@id=\"i9\"]")).click();
		
		driver.switchTo().defaultContent();
		
		

		
		
		
		
		
		//driver.close();
		
		
	}

}
