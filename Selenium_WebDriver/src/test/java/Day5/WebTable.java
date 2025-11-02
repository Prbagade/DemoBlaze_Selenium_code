package Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
	
		//total row 
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		//System.out.println("No of rows = "+rows);
		
		//total colums
		int colms=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		//System.out.println("No of columns = "+colms);
		
		//Specific table cell
		String cell=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[2]")).getText();
		//System.out.println("Name of cell = "+cell);
		
		//Whole table data
		//for loop
		System.out.println("BookName"+"   "+"Author"+"   "+"Subject"+"   "+"Price");
		
		for(int r=2;r<=rows;r++) //for row loop
		{
			for(int c=1;c<=colms;c++) //for columns loop
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"   ");
			}
			System.out.println();
		}
		
		

	}

}
