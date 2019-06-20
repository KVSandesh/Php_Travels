package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tours_Confirm_2 {

	@FindBy(xpath = "//button[text()='CONFIRM THIS BOOKING']")
	public WebElement Confirm_Booking;

	public void Tours_Confirm_22() throws Throwable {
		
	
    
		Confirm_Booking.click();

}
}
