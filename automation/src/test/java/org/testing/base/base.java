package org.testing.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class base {

	public ChromeDriver driver;
	public Properties pr;
	
    @BeforeTest
	public void init() throws IOException 
	{
    	File f = new File("../automation/Object.properties");
    	FileReader fr = new FileReader(f);
    	pr = new Properties();
    	pr.load(fr);
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		Options op = driver.manage();
		Window w = op.window();
		w.maximize();
	}

}
