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

public class Tours_TestCase {

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
		toursconfirm =PageFactory.initElements(driver, Tours_Confirm_1.class);
		toursconfirm2=PageFactory.initElements(driver, Tours_Confirm_2.class);
	}

	@Test

	public void Tours_Booking() throws Throwable {

		homepageobject.Home_Login();
		Thread.sleep(2000);

		String username = excelLibrary.getExceldata("Hotel_Data", 0, 0);
		String password = excelLibrary.getExceldata("Hotel_Data", 1, 0);

		loginobject.login_1(username, password);

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
		

	}

	@AfterClass(enabled = false)
	public void close_Browser() {
		driver.close();
	}

}
