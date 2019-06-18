package com.PhpTravels.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PhpTravels.Constants.Browsers;
import com.PhpTravels.Constants.ExcelLibrary;
import com.PhpTravels.pom.AHomePage_Object;
import com.PhpTravels.pom.SignUp_Object;

public class SIgn_Up_Negative {
	
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
		
		
		String FirstName = excelLibrary.getExceldata("Signup_Negative", 0, 0);
		String LastName = excelLibrary.getExceldata("Signup_Negative", 1, 0);
		String MobileNumber = excelLibrary.getExceldata("Signup_Negative", 2, 0);
		String Email = excelLibrary.getExceldata("Signup_Negative", 3, 0);
		String Password = excelLibrary.getExceldata("Signup_Negative", 4, 0);
		String ConfirmPassword = excelLibrary.getExceldata("Signup_Negative", 5, 0);

		signupobject.SignUp_PhpTravels(FirstName, LastName, MobileNumber, Email, Password, ConfirmPassword);
		Thread.sleep(3000);

		String loginnameValue = excelLibrary.getExceldata("Signup_Negative", 7, 0);
		String Actlogin = signupobject.SignUp.getText();
	
		  
		Assert.assertEquals(Actlogin, loginnameValue);
		System.out.println("\n\n");
		System.out.println("*********************************");
		Reporter.log("Email Id already Exist, Cross Verify", true);
		System.out.println("*********************************");
	}

	@AfterClass(enabled=true)
	public void close_Browser() {
		driver.close();

	}

}
