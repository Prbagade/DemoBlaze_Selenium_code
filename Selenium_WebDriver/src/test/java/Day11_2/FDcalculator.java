package Day11_2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDcalculator {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String filepath=System.getProperty("user.dir")+"\\TestData\\CalData.xlsx";
		
		int rows=ExcelUtilityClass.getRowCount(filepath, "Sheet1");	
		
		for(int i=1;i<=rows;i++) 
		{
			//1) read data from excel
			String pric=ExcelUtilityClass.getCellData(filepath, "Sheet1", i,0);
			String rateofinterset=ExcelUtilityClass.getCellData(filepath, "Sheet1", i,1);
			String per1=ExcelUtilityClass.getCellData(filepath, "Sheet1", i,2);
			String per2=ExcelUtilityClass.getCellData(filepath, "Sheet1", i,3);
			String frq=ExcelUtilityClass.getCellData(filepath, "Sheet1", i,4);
			String exp_Mvalue=ExcelUtilityClass.getCellData(filepath, "Sheet1", i,5);
			  
			//2) Pass above data into application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterset);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			
			Select perdrp=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrp.selectByVisibleText(per2);
			
			Select frqdrp=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			frqdrp.selectByVisibleText(frq);
			
			//Click on 
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			//Validation
			String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_Mvalue)==Double.parseDouble(act_mvalue)) 
			{
				System.out.println("Test passed");
				ExcelUtilityClass.setCellData(filepath, "Sheet1", i,7,"Passed");
				ExcelUtilityClass.fillGreeColor(filepath, "Sheet1", i,7);
			}
			else 
			{
				System.out.println("Test failed");
				ExcelUtilityClass.setCellData(filepath, "Sheet1", i,7, "Failed");
				//ExcelUtilityClass.fillRedColor(filepath,"Sheet1",i,7);
			}

			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		}
		//Ending forloop
		driver.quit();
		

	}

}
