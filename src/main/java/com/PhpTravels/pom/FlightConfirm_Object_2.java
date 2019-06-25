package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightConfirm_Object_2 {

	@FindBy(xpath = "//button[text()='CONFIRM THIS BOOKING']")
	public WebElement Confirm_Book_FLight;

	@FindBy(xpath = "//button[text()='Pay on Arrival']")
	public WebElement Invoice;

	public void Confirm_Flight() throws Throwable {

		Thread.sleep(2000);

		Confirm_Book_FLight.click();
	}

}
