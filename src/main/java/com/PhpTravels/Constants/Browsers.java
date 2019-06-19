package com.PhpTravels.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

public static WebDriver driver;
public static WebDriver getBrowser()
{
	if(Constants.Browser.equals("Firefox"))
	{
		driver  = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get(Constants.url);
		
	}
	else if (Constants.Browser.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./src\\main\\resources\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications"); /* To disable the Notifications */
		driver = new ChromeDriver(ops);
		
		//driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.url);
		
	}
	
	else if (Constants.Browser.equals("InternetExplorer"))
	{
		System.setProperty("webdriver.ie.driver","./src\\main\\resources\\chromedriver.exe");
		driver  = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.url);
	}
	return driver;
}


}
