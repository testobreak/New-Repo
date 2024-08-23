package automation.automation;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class blaunch {
	
	@BeforeTest
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		Options op = driver.manage();
	   Window w 	= op.window();
	   w.maximize();
	}

}
