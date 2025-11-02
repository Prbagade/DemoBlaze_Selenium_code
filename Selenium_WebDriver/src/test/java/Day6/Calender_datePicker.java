package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender_datePicker {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		
	//	screenshot("applicationopened");
		
		//script to select From city and to city
		driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]//input")).click();
		driver.findElement(By.xpath("//div[text()=\"BOM\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"GOI\"]")).click();
		Thread.sleep(2000);
		
		//screenshot("origindestinationselected");
		
		//script is to close calender
		driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1loqt21 r-1otgn73\"])[1]")).click();
		Thread.sleep(2000);
		
		//script to add passengers
		driver.findElement(By.xpath("//div[text()=\"Passengers\"]")).click();
		Thread.sleep(2000);
		WebElement adult=driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
		int i=1;
		while(i<5)
		{
			adult.click();
			i++;
		}
		WebElement child=driver.findElement(By.xpath("//div[@data-testid=\"Children-testID-plus-one-cta\"]"));
		WebElement infant= driver.findElement(By.xpath("//div[@data-testid=\"Infant-testID-plus-one-cta\"]"));
		for(int j=1;j<3;j++)
		{
			child.click();
		}
		Thread.sleep(2000);
		for(int k=1;k<4;k++)
		{
			  infant.click();
		}
		Thread.sleep(2000);
		
		//screenshot("passengerselected");
		
		//script to add currency
		driver.findElement(By.xpath("//div[text()=\"Currency\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"CNY\"]")).click();
		Thread.sleep(2000);
		
		//screenshot("currencyselected");
		
		//script to search flight
		
		Actions act= new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//div[text()=\"Search Flight\"]"));
		
		act.click(ele).perform();
		Thread.sleep(10000);
		
		//screenshot("resultpageopened");
		
	}
//	public static void screenshot(String filename) throws IOException
//	{
//		TakesScreenshot screen=(TakesScreenshot)driver;
//		File src=screen.getScreenshotAs(OutputType.FILE);
//		File dest= new File("C:\\Users\\shree\\Desktop\\Velocity 16 July B\\screenshots\\"+filename+".jpg");
//		FileHandler.copy(src, dest);
//	}


	

}
