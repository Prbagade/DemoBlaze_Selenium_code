package Day11_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException
	{
		
		//Location of properies
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");
		
		//Loading Properties
		Properties propertiesObj = new Properties();
		propertiesObj.load(file);
		
		//Reading data from properties file
		String url=propertiesObj.getProperty("appurl");
		String email=propertiesObj.getProperty("email");
		String pwd=propertiesObj.getProperty("password");
		String orid=propertiesObj.getProperty("orderid");
		String custid=propertiesObj.getProperty("customerid");
		
		System.out.println(url+" "+email+" "+pwd+" "+orid+" "+custid);
		
		//Reading all the keys from properties file
		
//		Set<String> keys=propertiesObj.stringPropertyNames();
//		System.out.println(keys);
		
		Set<Object> keys=propertiesObj.keySet();
		System.out.println(keys);
		
		// Reading all the value from properies file
		Collection<Object>values=propertiesObj.values();
		System.out.println(values);
		
		
		
		
		
		
		
	}

}
