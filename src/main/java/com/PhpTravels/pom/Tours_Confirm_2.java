package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tours_Confirm_2 {

	@FindBy(xpath = "//button[text()='CONFIRM THIS BOOKING']")
	public WebElement Confirm_Booking;
	
	@FindBy(xpath = "//button[text()='Pay on Arrival']")
	public WebElement Invoice;


	public void Tours_Confirm_22() throws Throwable {

		Thread.sleep(2000);
		Confirm_Booking.click();
		
		Thread.sleep(5000);

	

	}
}
