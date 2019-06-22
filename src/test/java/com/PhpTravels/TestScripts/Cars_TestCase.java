package com.PhpTravels.TestScripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PhpTravels.Constants.Browsers;
import com.PhpTravels.Constants.ExcelLibrary;
import com.PhpTravels.pom.AHomePage_Object;
import com.PhpTravels.pom.Cars_Booking_Object;
import com.PhpTravels.pom.Cars_Confirm_Object;
import com.PhpTravels.pom.Cars_Confirm_Object_2;
import com.PhpTravels.pom.Cars_Filter_Object;
import com.PhpTravels.pom.Login_Object;

public class Cars_TestCase {

	WebDriver driver;

	AHomePage_Object homepageobject;
	Login_Object loginobject;
	Cars_Booking_Object carsbooking;
	Cars_Filter_Object carsfilter;
	Cars_Confirm_Object carsconfirm;
	Cars_Confirm_Object_2 carsconfirm2;

	ExcelLibrary excelLibrary = new ExcelLibrary();

	@BeforeClass

	public void openBrowser() {
		driver = Browsers.getBrowser();
		homepageobject = PageFactory.initElements(driver, AHomePage_Object.class);
		loginobject = PageFactory.initElements(driver, Login_Object.class);
		carsbooking = PageFactory.initElements(driver, Cars_Booking_Object.class);
		carsfilter = PageFactory.initElements(driver, Cars_Filter_Object.class);
		carsconfirm = PageFactory.initElements(driver, Cars_Confirm_Object.class);
		carsconfirm2 = PageFactory.initElements(driver, Cars_Confirm_Object_2.class);
	}

	@Test

	public void Car_Booking() throws Throwable {

		homepageobject.Home_Login();
		Thread.sleep(2000);

		String username = excelLibrary.getExceldata("Hotel_Data", 0, 0);
		String password = excelLibrary.getExceldata("Hotel_Data", 1, 0);

		loginobject.login_1(username, password);

		carsbooking.Cars_Booking();

		carsfilter.Cars_Filter();

		Thread.sleep(3000);

		Actions action = new Actions(driver);

		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		carsconfirm.Cars_Confirm();

		action.sendKeys(Keys.PAGE_DOWN).perform();
		action.sendKeys(Keys.PAGE_DOWN).perform();
		carsconfirm2.Cars_Confirm();
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);

	}

	
	public void Car_Booking_Without_Login() throws Throwable {

	
		carsbooking.Cars_Booking();

		carsfilter.Cars_Filter();

		Thread.sleep(3000);

		Actions action = new Actions(driver);

		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		carsconfirm.Cars_Confirm();

		action.sendKeys(Keys.PAGE_DOWN).perform();
		action.sendKeys(Keys.PAGE_DOWN).perform();
		carsconfirm2.Cars_Confirm();
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);

	}
	
	
	@AfterClass(enabled = true)
	public void close_Browser() {
		driver.close();
	}

}
