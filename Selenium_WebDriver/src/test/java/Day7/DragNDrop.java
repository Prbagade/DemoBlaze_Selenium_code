package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		Actions act = new Actions(driver);
		
		//Drag & Drop
		WebElement box1=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement box2=driver.findElement(By.xpath("//*[@id='droppable']"));
		
		act.dragAndDrop(box1, box2).perform();
		
		
		
	}

}
