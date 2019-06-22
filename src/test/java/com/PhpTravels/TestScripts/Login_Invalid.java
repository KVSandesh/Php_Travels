package com.PhpTravels.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PhpTravels.Constants.Browsers;
import com.PhpTravels.Constants.ExcelLibrary;
import com.PhpTravels.pom.AHomePage_Object;
import com.PhpTravels.pom.Login_Object;
import com.PhpTravels.pom.MyAccount_Object;

public class Login_Invalid {

	WebDriver driver;
	AHomePage_Object homepageobject;
	
	Login_Object loginobject;
	MyAccount_Object myaccountobject;
	ExcelLibrary excelLibrary = new ExcelLibrary();

	@BeforeClass

	public void openBrowser() {
		driver = Browsers.getBrowser();
		homepageobject = PageFactory.initElements(driver, AHomePage_Object.class);

		loginobject = PageFactory.initElements(driver, Login_Object.class);
	}

	@Test

	public void SignUp() throws Throwable {

		homepageobject.Home_Login();
		Thread.sleep(2000);

		String username = excelLibrary.getExceldata("Login_Negative", 0, 0);
		String password = excelLibrary.getExceldata("Login_Negative", 1, 0);

		loginobject.login_1(username, password);
		Reporter.log("Login Unsuccessful, Cross Verify the credentials", true);

		Thread.sleep(2000);

		homepageobject.verify_account_Login.click();
		Thread.sleep(2000);
	

	}

	@AfterClass(enabled = true)
	public void close_Browser() {
		driver.close();

	}

}
