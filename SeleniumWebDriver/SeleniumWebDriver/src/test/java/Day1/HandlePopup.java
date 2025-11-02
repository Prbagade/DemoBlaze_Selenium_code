package Day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1) Normal alert with ok button
//		driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();
//		Thread.sleep(3000);
//		
//		//driver.switchTo().alert().accept();
//		
//		Alert myalert=driver.switchTo().alert();
//		System.out.println(myalert.getText());
//		myalert.accept();
		
		//2) Confirmation alert - ok *& cancel button
//		driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();
//		Thread.sleep(3000);
//		
//		//driver.switchTo().alert().accept();
//		//driver.switchTo().alert().dismiss();
//		
//		Alert myalert=driver.switchTo().alert();
//		System.out.println(myalert.getText());
//		myalert.accept();
		
		//3) Prompt alert - input box
		driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		
//		driver.switchTo().alert().sendKeys("Tester");
//		driver.switchTo().alert().accept();
		
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("Test Leader");
		System.out.println(myalert.getText());
		myalert.accept();
		
		driver.close();

	}

}
