package com.PhpTravels.TestScripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PhpTravels.Constants.Browsers;
import com.PhpTravels.Constants.ExcelLibrary;
import com.PhpTravels.pom.AHomePage_Object;
import com.PhpTravels.pom.Hotel_Final_Booking_1;
import com.PhpTravels.pom.Hotel_Final_Booking_2;
import com.PhpTravels.pom.HotelsFilter_Object;
import com.PhpTravels.pom.Login_Object;
import com.PhpTravels.pom.MyAccount_Object;

public class Hotel_TestCase {

	WebDriver driver;

	AHomePage_Object homepageobject;
	Login_Object loginobject;
	MyAccount_Object myaccountobject;
	HotelsFilter_Object hotelsfilterobject;
	Hotel_Final_Booking_1 finalbook_1;
	Hotel_Final_Booking_2 finalbook_2;

	ExcelLibrary excelLibrary = new ExcelLibrary();

	@BeforeClass

	public void openBrowser() {
		driver = Browsers.getBrowser();
		homepageobject = PageFactory.initElements(driver, AHomePage_Object.class);
		myaccountobject = PageFactory.initElements(driver, MyAccount_Object.class);
		loginobject = PageFactory.initElements(driver, Login_Object.class);
		hotelsfilterobject = PageFactory.initElements(driver, HotelsFilter_Object.class);

		finalbook_1 = PageFactory.initElements(driver, Hotel_Final_Booking_1.class);
		finalbook_2 = PageFactory.initElements(driver, Hotel_Final_Booking_2.class);
	}

	@Test

	public void Hotel_Booking() throws Throwable {

		homepageobject.Home_Login();
		Thread.sleep(2000);

		String username = excelLibrary.getExceldata("Hotel_Data", 0, 0);
		String password = excelLibrary.getExceldata("Hotel_Data", 1, 0);

		loginobject.login_1(username, password);
		homepageobject.Hotel();
		hotelsfilterobject.Hotel_Select();

		Thread.sleep(3000);

		Actions action = new Actions(driver);

		action.sendKeys(Keys.PAGE_DOWN).perform();
		action.sendKeys(Keys.PAGE_DOWN).perform();

		/*
		 * Assert.assertEquals(hotelsfilterobject.Verify_checkin_Date_1,
		 * hotelsfilterobject.Verify_checkin_Date_2);
		 * Reporter.log("Checkind date is wrong try to modify", true);
		 * 
		 * Thread.sleep(3000);
		 */
		finalbook_1.confirm_hotel_booking_1();
		Thread.sleep(3000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);

		finalbook_2.confirm_hotel_booking_2();
		Thread.sleep(3000);

	}

	@AfterClass(enabled = true)
	public void close_Browser() {
		driver.close();

	}

}
