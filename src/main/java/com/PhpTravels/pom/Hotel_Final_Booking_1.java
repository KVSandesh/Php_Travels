package com.PhpTravels.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.PhpTravels.Constants.Waits;

public class Hotel_Final_Booking_1 extends Waits {

	WebDriver driver;

	@FindBy(xpath = "//tbody/tr[1]/td/div/div/div/div/div/label/div[1]")
	public WebElement Hotel_Check;

	@FindBy(xpath = "//*[@id='ROOMS']/div/button")
	public WebElement Book_Button;

	@FindBy(xpath = "//button[text()='CONFIRM THIS BOOKING']")
	public WebElement Confirm_Booking;

	@FindBy(xpath = "//div[text()='Available Rooms']")
	public WebElement Scroll_Down_element;

	@FindBy(xpath = "//button[text()='Got it!']")
	public WebElement Got_Button;

	@FindBy(xpath = "//table[@class='bgwhite table table-striped']/tbody/tr[1]/td[1]/div[2]/div[2]/div/div[1]/button[1][text()='More Details']")
	public WebElement More_Details;

	public void confirm_hotel_booking_1() throws Throwable {

		
/*		waitForElementPresent(More_Details);
		More_Details.click();
		Thread.sleep(2000);
		More_Details.click();
		Thread.sleep(2000);*/
		Hotel_Check.click();
		Thread.sleep(2000);
		Book_Button.click();
		//Thread.sleep(6000);
		//Confirm_Booking.click();
	}

}
