package Day12;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ADblockerExtention {

	public static void main(String[] args) {
		
		ChromeOptions op = new ChromeOptions();
		
		File file = new File("C:\\Users\\Prafull\\Downloads\\New folder\\uBlock-Chrome-Web-Store.crx");
		op.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		

	}

}
