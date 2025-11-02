package Day11;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet =workbook.createSheet("Data");
		
		XSSFRow row0=sheet.createRow(0);
			row0.createCell(0).setCellValue("Java");
			row0.createCell(0).setCellValue(10);
			row0.createCell(0).setCellValue("Automation");
		
		XSSFRow row1=sheet.createRow(1);
			row1.createCell(1).setCellValue("Python");
			row1.createCell(1).setCellValue(11);
			row1.createCell(1).setCellValue("Automation");
		
		XSSFRow row2=sheet.createRow(2);
			row2.createCell(2).setCellValue("C#");
			row2.createCell(2).setCellValue(12);
			row2.createCell(2).setCellValue("Automation");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is Created...");
		
		
		
		
		
	}
}
