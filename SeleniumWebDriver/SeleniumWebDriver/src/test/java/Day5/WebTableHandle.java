package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//rows
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
//		System.out.println("no. of rows :"+rows);
//		
		//colms
		int colms=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
//		System.out.println("no. of colms :"+colms);

		//specfic row & colum
		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[2]")).getText();
		//System.out.println(value);
		
		//All Table data
		System.out.println("BookName"+"   "+"Author"+"   "+"Subject"+"   "+"Price");
		
//		for(int r=2;r<=rows;r++) 
//		{
//			for(int c=1;c<=colms;c++) 
//			{
//				String ss=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(ss+"   ");
//			}
//			System.out.println();	
//		}
		
		//print book names whose auther is Mukesh
//		for(int s=2;s<=rows;s++) 
//		{
//			String AuthorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+s+"]//td[2]")).getText();
//			//System.out.println(Bookauthor);
//			
//			if(AuthorName.equals("Mukesh")) 
//			{
//				String BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+s+"]//td[1]")).getText();
//				System.out.println(BookName+"   "+AuthorName);
//			}
//		}
		
		// Total Price
		int total=0;
		for(int s=2;s<=rows;s++) 
		{
			String Price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+s+"]//td[4]")).getText();
			//System.out.println(price);
			total=total+Integer.parseInt(Price);
		}
		System.out.println("total price = "+total); //7100
		
		
	}

}
