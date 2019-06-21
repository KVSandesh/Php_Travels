package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Cars_Confirm_Object_2 {

	@FindBy(xpath = "//button[text()='CONFIRM THIS BOOKING']")
	public WebElement Confirm_Book_Car;

	@FindBy(xpath = "//button[text()='Got it!']")
	public WebElement Got_Button;

	public void Cars_Confirm() throws Throwable {

		Got_Button.click();
		Thread.sleep(1000);

		Confirm_Book_Car.click();
		Thread.sleep(3000);
	}

}
