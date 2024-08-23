package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotCapture 
{
	


	public static void takeScreenShot(ChromeDriver driver, String filePath) throws IOException 
	{
		File f = driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File(filePath));
		
	}

}
