package com.PhpTravels.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PhpTravels.Constants.Browsers;
import com.PhpTravels.Constants.ExcelLibrary;
import com.PhpTravels.pom.AHomePage_Object;
import com.PhpTravels.pom.HotelsFilter_Object;
import com.PhpTravels.pom.Login_Object;
import com.PhpTravels.pom.MyAccount_Object;

public class Hotel_TestCase {

	WebDriver driver;

	AHomePage_Object homepageobject;
	Login_Object loginobject;
	MyAccount_Object myaccountobject;
	HotelsFilter_Object hotelsfilterobject;

	ExcelLibrary excelLibrary = new ExcelLibrary();

	@BeforeClass

	public void openBrowser() {
		driver = Browsers.getBrowser();
		homepageobject = PageFactory.initElements(driver, AHomePage_Object.class);
		myaccountobject = PageFactory.initElements(driver, MyAccount_Object.class);
		loginobject = PageFactory.initElements(driver, Login_Object.class);
		hotelsfilterobject = PageFactory.initElements(driver, HotelsFilter_Object.class);
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

	}

	@AfterClass(enabled = true)
	public void close_Browser() {
		driver.close();

	}

}
