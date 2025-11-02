package AlertsORPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_AuthoticaatsAlert {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		//without id&password
		//driver.get("http://the-internet.herokuapp.com/basic_auth");

		//with id/pass
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
