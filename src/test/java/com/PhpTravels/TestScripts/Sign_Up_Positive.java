package com.PhpTravels.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PhpTravels.Constants.Browsers;
import com.PhpTravels.Constants.ExcelLibrary;
import com.PhpTravels.pom.AHomePage_Object;
import com.PhpTravels.pom.SignUp_Object;

public class Sign_Up_Positive {

	WebDriver driver;
	AHomePage_Object homepageobject;
	SignUp_Object signupobject;
	ExcelLibrary excelLibrary = new ExcelLibrary();

	@BeforeClass

	public void openBrowser() {
		driver = Browsers.getBrowser();
		homepageobject = PageFactory.initElements(driver, AHomePage_Object.class);
		signupobject = PageFactory.initElements(driver, SignUp_Object.class);
	}

	@Test

	public void SignUp() throws Throwable {

		homepageobject.Sign_Up();
		Thread.sleep(3000);
		
		
		String FirstName = excelLibrary.getExceldata("Signup_Poitive", 0, 0);
		String LastName = excelLibrary.getExceldata("Signup_Poitive", 1, 0);
		String MobileNumber = excelLibrary.getExceldata("Signup_Poitive", 2, 0);
		String Email = excelLibrary.getExceldata("Signup_Poitive", 3, 0);
		String Password = excelLibrary.getExceldata("Signup_Poitive", 4, 0);
		String ConfirmPassword = excelLibrary.getExceldata("Signup_Poitive", 5, 0);

		signupobject.SignUp_PhpTravels(FirstName, LastName, MobileNumber, Email, Password, ConfirmPassword);
		Thread.sleep(3000);
		
		homepageobject.verify_account_Login.click();
		Thread.sleep(2000);
		

	}

	@AfterClass(enabled=true)
	public void close_Browser() {
		driver.close();

	}

}
