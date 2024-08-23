package org.testing.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.assertion.Assertt;
import org.testing.base.base;
import org.testing.utilities.ScreenShotCapture;
import org.testing.utilities.logsCapture;
import org.testng.Assert;
import org.tetsing.pages.Homepage;
import org.tetsing.pages.loginPage;

public class TestCase1 extends base
{
	
	public void TC1() throws IOException {
		
		loginPage page = new loginPage(driver, pr);
		page.signIn("ashishtomar0016@gmail.com", "Blanket@123");
		ScreenShotCapture.takeScreenShot(driver, "C:\\Users\\HP\\Pictures\\Screenshots\\first.png");
		logsCapture.takeLogs("TC1", "Login Success");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com");
		//Assertt.assert1( expected, actual);
		Homepage home = new Homepage(driver, pr);
		home.clickTrending();
	}

}
 