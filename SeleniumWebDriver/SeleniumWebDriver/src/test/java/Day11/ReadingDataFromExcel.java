package Day11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException
	{
		// Method 1
		//FileInputStream file = new FileInputStream("C:\\Users\\Prafull\\eclipse-workspace\\SeleniumWebDriver\\TestData\\TestData1.xlsx");
		
		//Method 2
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\TestData1.xlsx");
	
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//type 1
		XSSFSheet sheet =workbook.getSheet("sheet1");	
		//type 2
		//XSSFSheet sheet =workbook.getSheetAt(0);
		
		int totalRows =sheet.getLastRowNum();
		
		int totalCells=sheet.getRow(0).getLastCellNum();
		
		System.out.println("No of rows = "+totalRows); //5
		
		System.out.println("No of cells = "+totalCells); //4
		
		for(int r=0;r<=totalRows;r++) 
		{
			XSSFRow currentRow=sheet.getRow(r);
			
			for(int c=0;c<totalCells;c++) 
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
			
		}
		
		workbook.close();
		file.close();
	}

}
