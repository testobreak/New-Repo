package org.tetsing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
	
	ChromeDriver driver;
	Properties pr;
	public loginPage(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	
	
	
	
	public void signIn(String username, String password) 
	{
		WebElement login = driver.findElement(By.xpath(pr.getProperty("LoginButton")));
		login.click();
	}
	
	

}
