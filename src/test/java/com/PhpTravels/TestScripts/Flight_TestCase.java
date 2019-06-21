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
import com.PhpTravels.pom.FlightBooking_Object;
import com.PhpTravels.pom.Flightconfirm_Object;
import com.PhpTravels.pom.HotelsFilter_Object;
import com.PhpTravels.pom.Login_Object;
import com.PhpTravels.pom.MyAccount_Object;

public class Flight_TestCase {

	WebDriver driver;

	AHomePage_Object homepageobject;
	Login_Object loginobject;
	MyAccount_Object myaccountobject;
	FlightBooking_Object flight;
	Flightconfirm_Object flightconfirm;
	
	
	ExcelLibrary excelLibrary = new ExcelLibrary();

	@BeforeClass

	public void openBrowser() {
		driver = Browsers.getBrowser();
		homepageobject = PageFactory.initElements(driver, AHomePage_Object.class);
		myaccountobject = PageFactory.initElements(driver, MyAccount_Object.class);
		loginobject = PageFactory.initElements(driver, Login_Object.class);
		flight = PageFactory.initElements(driver, FlightBooking_Object.class);
		flightconfirm = PageFactory.initElements(driver, Flightconfirm_Object.class);
	}

	@Test(enabled=false)

	public void FLight_Booking() throws Throwable {

		homepageobject.Home_Login();
		Thread.sleep(2000);

		String username = excelLibrary.getExceldata("Hotel_Data", 0, 0);
		String password = excelLibrary.getExceldata("Hotel_Data", 1, 0);

		loginobject.login_1(username, password);
		flight.Book_Flight();
		Thread.sleep(3000);

		Actions action = new Actions(driver);

		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		flightconfirm.Confirm_Flight();
		
		

	}
	
	@Test(enabled=true)
	public void FLight_Booking_Without_Login() throws Throwable {

		homepageobject.Home_Login();
		Thread.sleep(2000);

		/*String username = excelLibrary.getExceldata("Hotel_Data", 0, 0);
		String password = excelLibrary.getExceldata("Hotel_Data", 1, 0);

		loginobject.login_1(username, password);*/
		flight.Book_Flight();
		Thread.sleep(3000);

		Actions action = new Actions(driver);

		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		flightconfirm.Confirm_Flight();
		
		

	}

	@AfterClass(enabled = false)
	public void close_Browser() {
		driver.close();

	}

}
