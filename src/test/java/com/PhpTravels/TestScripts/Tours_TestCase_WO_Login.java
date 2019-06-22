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
import com.PhpTravels.pom.Login_Object;
import com.PhpTravels.pom.ToursBooking_Object;
import com.PhpTravels.pom.Tours_Confirm_1;
import com.PhpTravels.pom.Tours_Confirm_2;

public class Tours_TestCase_WO_Login {

	WebDriver driver;

	AHomePage_Object homepageobject;
	Login_Object loginobject;
	ToursBooking_Object tour;
	Tours_Confirm_1 toursconfirm;
	Tours_Confirm_2 toursconfirm2;

	ExcelLibrary excelLibrary = new ExcelLibrary();

	@BeforeClass

	public void openBrowser() {
		driver = Browsers.getBrowser();
		homepageobject = PageFactory.initElements(driver, AHomePage_Object.class);
		loginobject = PageFactory.initElements(driver, Login_Object.class);
		tour = PageFactory.initElements(driver, ToursBooking_Object.class);
		toursconfirm = PageFactory.initElements(driver, Tours_Confirm_1.class);
		toursconfirm2 = PageFactory.initElements(driver, Tours_Confirm_2.class);
	}

	@Test

	public void Tours_Booking_Without_Login() throws Throwable {

		tour.Tours();
		Thread.sleep(3000);

		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		action.sendKeys(Keys.PAGE_DOWN).perform();

		toursconfirm.Tours_Confirm();
		Thread.sleep(3000);

		action.sendKeys(Keys.PAGE_DOWN).perform();
		action.sendKeys(Keys.PAGE_DOWN).perform();

		toursconfirm2.Tours_Confirm_22();
		Thread.sleep(3000);
		toursconfirm2.Invoice.click();

	}

	@AfterClass(enabled = true)
	public void close_Browser() {
		driver.close();
	}

}