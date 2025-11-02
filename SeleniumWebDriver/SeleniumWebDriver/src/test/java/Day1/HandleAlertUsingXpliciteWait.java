package Day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingXpliciteWait {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();

		WebDriverWait maywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();		
		Thread.sleep(3000);
		
		Alert myalert=maywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(myalert.getText());
		myalert.accept();
		
		
		
		
		
		


	}

}
