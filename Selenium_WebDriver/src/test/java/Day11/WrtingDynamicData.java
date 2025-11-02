package Day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrtingDynamicData {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file =  new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\my_dynamicFile.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many rows?");
		int noOFrows=sc.nextInt();
		
		System.out.println("Enter how many cells?");
		int noOfcells=sc.nextInt();
		
		for(int r=0;r<=noOFrows;r++) 
		{
			XSSFRow currentRow=sheet.createRow(r);
			
			for(int c=0;c<=noOfcells;c++) 
			{
				XSSFCell cell=currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}			
			
		}	
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is Created...");
		
	}

}
