package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.PhpTravels.Constants.Waits;

public class Hotel_Final_Booking_2  {

	@FindBy(xpath = "//button[text()='CONFIRM THIS BOOKING']")
	public WebElement Confirm_Booking;
	
	@FindBy(xpath = "//button[text()='Got it!']")
	public WebElement Got_Button;

	public void confirm_hotel_booking_2() throws Throwable {
		
       Confirm_Booking.click();
       
       Thread.sleep(4000);
	}

}
