package Utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class DataProviders
{
	//DataProvider 1
		@DataProvider(name="LoginData")
		public String [][] getData() throws IOException
		{
			String path=".\\TestData\\OpenCart_LoginData.xlsx";  //taking xl file from testData
			
			ExcelUtility xlutil= new ExcelUtility(path); //creating an object for xlUtility
			
			int totalrows= xlutil.getRowCount("Sheet1");
			int totalcols=xlutil.getCellCount("Sheet1", 1);
			
			String logindata[][]= new String[totalrows][totalcols]; //creating for 1 dimension array which canstore
			
			for(int i=1;i<=totalrows;i++) //1
			{
				for(int j=0;j<totalcols;j++)
				{
					logindata[i-1][j]=xlutil.getCellData("Sheet1",i,j);  //1,0
				}
			}
			return logindata;  //returning 2 dimension array	
		}
}
