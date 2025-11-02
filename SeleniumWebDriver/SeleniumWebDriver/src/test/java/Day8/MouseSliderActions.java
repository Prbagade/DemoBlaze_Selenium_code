package Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSliderActions {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		
		//Min Slider
		WebElement min_slider= driver.findElement(By.xpath("(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		
		System.out.println("Default Location of min slider befor :"+min_slider.getLocation()); //59,250
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(min_slider, 100, 250).build().perform();
		
		System.out.println("Default Location of min slider after :"+min_slider.getLocation()); //158,250
		
		
		System.out.println("===========================================");
		
	
		//max slider
		//WebElement max_slider= driver.findElement(By.xpath("(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		WebElement max_slider= driver.findElement(By.xpath("//*[@style='left: 100%;']"));
		
		System.out.println("Default Location of max slider befor :"+max_slider.getLocation()); //613,250
				
		act.dragAndDropBy(max_slider, -100, 250).build().perform();
		
		System.out.println("Default Location of max slider after :"+max_slider.getLocation()); //513,250
	
		
	
	}

}
