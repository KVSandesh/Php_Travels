package com.PhpTravels.Constants;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

	public static void disableimage(ChromeOptions ops) {
		HashMap<String, Object> images = new HashMap<String, Object>();
		images.put("images", 2);
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values", images);
		ops.setExperimentalOption("prefs", prefs);

	}

	public static WebDriver driver;

	public static WebDriver getBrowser() {
		if (Constants.Browser.equals("Firefox")) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(Constants.url);

		} else if (Constants.Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src\\main\\resources\\chromedriver.exe");
			ChromeOptions ops = new ChromeOptions();
			disableimage(ops);
			ops.addArguments("--disable-notifications"); /* To disable the Notifications */
			driver = new ChromeDriver(ops);
			//WebDriver driver = new ChromeDriver(ops);

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(Constants.url);

		}

		else if (Constants.Browser.equals("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver", "./src\\main\\resources\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(Constants.url);
		}
		return driver;
	}

}
