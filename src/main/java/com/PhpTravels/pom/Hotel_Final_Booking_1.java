package com.PhpTravels.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.PhpTravels.Constants.Waits;

public class Hotel_Final_Booking_1 extends Waits {

	WebDriver driver;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][2]/div/table/tbody/tr/td[contains(text(),28)]")
	public WebElement checkin_Date;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][4]/div/table/tbody/tr[6]/td[contains(text(), 30)]")
	public WebElement checkout_Date;

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

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div/div/input[@value='28/06/2019']")
	public WebElement Verify_checkin_Date;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div[2]//input[@value='30/06/2019']")
	public WebElement Verify_checkout_Date;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div/div/input[@value='28/06/2019']")
	public WebElement Verify_checkin_Date_1;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div[1]/div/input")
	public WebElement Attribute_1;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div[2]/div/input")
	public WebElement Attribute_2;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div[3]/div/select")
	public WebElement Attribute_3;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div[4]/div/select")
	public WebElement Attribute_4;

	String Actual_1 = "28/06/2019";
	String Actual_2 = "30/06/2019";
	String Actual_3 = "2";
	String Actual_4 = "1";

	public void confirm_hotel_booking_1() throws Throwable {
		
		
		System.out.println("\n");

		System.out.println("**********************");
        System.out.println("********After ReSelecting****");
        

		SoftAssert assertion = new SoftAssert();
		System.out.println("**********************");
		String expect_1 = Attribute_1.getAttribute("value");
		System.out.println("After Redefing the Checkindate is :: " + expect_1);
        assertion.assertEquals(Actual_1, expect_1);
		Reporter.log(" After Redefing, The checkin Date is True continue booking", true);
		System.out.println("**********************");
		
		String expect_2 = Attribute_2.getAttribute("value");
		System.out.println("Checkinout is ::" + expect_2);
		assertion.assertEquals(Actual_2, expect_2);
		Reporter.log("After Redefing, The, THe checkout Date is true", true);
		System.out.println("**********************");

		String expect_3 = Attribute_3.getAttribute("value");
		System.out.println("THe no of Adults is ::" + expect_3);
		assertion.assertEquals(Actual_3, expect_3);
		Reporter.log("After Redefing, The  no of Adults is true", true);
		System.out.println("**********************");

		String expect_4 = Attribute_4.getAttribute("value");
		System.out.println("THe no of Adults is ::" + expect_4);
		assertion.assertEquals(Actual_4, expect_4);
		Reporter.log("After Redefing, The THe no of Child is true ", true);
		System.out.println("**********************");

		Hotel_Check.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		Book_Button.click();

	}

}
