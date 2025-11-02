package TestBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass 
{

public WebDriver driver;
public Logger logger;
public Properties p;

	
	@BeforeClass
	@Parameters({"os","browser"})
	public void Setup(String os,String br) throws IOException 
	{
		//Loading config.properties file
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		logger = LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase()) 
		{
		case "chrome" : 	driver = new ChromeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		case "edge" : 	driver = new EdgeDriver(); break;
		default : System.out.println("Invalid browser..."); return;
		}
		
		driver.manage().deleteAllCookies();
		//driver.get("https://tutorialsninja.com/demo/");
		driver.get(p.getProperty("appURL1")); //reading url from properties file
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	
	public String randomString() 
	{
		String generatedString =RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomNumber() 
	{
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}
	
	public String randomalphaNumeric() 
	{
		String generatedSring = RandomStringUtils.randomNumeric(3);
		String generatedNumber = RandomStringUtils.randomNumeric(3);
		return generatedSring+"@"+generatedNumber;
	}
	
	@AfterClass
	public void TearDown() 
	{
		
		driver.close();
	}
}
