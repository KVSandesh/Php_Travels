package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Cars_Confirm_Object {

	@FindBy(xpath = "//button[text()='Got it!']")
	public WebElement Got_Button;

	@FindBy(xpath = "//form[@role='search' and @method='GET']/div[1]/div[1]/div/div/a/span[1]")
	public WebElement Attribute_1;
	@FindBy(xpath = "//form[@role='search' and @method='GET']/div[1]/div[2]/div/div/a/span[1]")
	public WebElement Attribute_2;
	@FindBy(xpath = "//form[@role='search' and @method='GET']/div[1]/div[3]/div[2]/input")
	public WebElement Attribute_3;
	@FindBy(xpath = "//form[@role='search' and @method='GET']/div[1]/div[5]/div[2]/input")
	public WebElement Attribute_4;

	@FindBy(xpath = "//form[@role='search' and @method='GET']/div[1]/div[4]/div[2]/select/option[3]")
	public WebElement Attribute_5;
	@FindBy(xpath = "//form[@role='search' and @method='GET']/div[1]/div[6]/div[2]/select/option[7]")
	public WebElement Attribute_6;

	@FindBy(xpath = "//button[text()='Book Now']")
	public WebElement Book_Now_Button;

	@FindBy(xpath = "//button[text()='CONFIRM THIS BOOKING']")
	public WebElement Confirm_Book_Car;

	String Actual_1 = "Manchester";
	String Actual_2 = "Manchester";
	String Actual_3 = "25/06/2019";
	String Actual_4 = "30/06/2019";
	String Actual_5 = "01:00";
	String Actual_6 = "03:00";

	public void Cars_Confirm() throws Throwable {

		SoftAssert assertion = new SoftAssert();

		System.out.println("\n");

		System.out.println("**********************");
		System.out.println("Details after selecting Cars");
		System.out.println("**********************");

		String expect_1 = Attribute_1.getText();
		System.out.println("FromPlace is ::" + expect_1);
		assertion.assertEquals(Actual_1, expect_1);
		Reporter.log("FromPlace is True", true);
		System.out.println("**********************");

		String expect_2 = Attribute_2.getText();
		System.out.println("Destination is ::" + expect_2);
		assertion.assertEquals(Actual_2, expect_2);
		Reporter.log("Destination is True", true);
		System.out.println("**********************");

		String expect_3 = Attribute_3.getAttribute("value");
		System.out.println("Checkin Date is ::" + expect_3);
		assertion.assertEquals(Actual_3, expect_3);
		Reporter.log("Checkin Date is True", true);
		System.out.println("**********************");

		String expect_4 = Attribute_4.getAttribute("value");
		System.out.println("Checkout Date is ::" + expect_4);
		assertion.assertEquals(Actual_4, expect_4);
		Reporter.log("Checkout Date is true", true);
		System.out.println("**********************");

		String expect_5 = Attribute_5.getAttribute("value");
		System.out.println("PickUP TIme is ::" + expect_5);
		assertion.assertNotEquals(Actual_5, expect_5);
		Reporter.log("PickUP TIme is true", true);
		System.out.println("**********************");

		String expect_6 = Attribute_6.getAttribute("value");
		System.out.println("Dropoff time ::" + expect_6);
		assertion.assertNotEquals(Actual_6, expect_6);
		Reporter.log("Dropoff time is true", true);
		System.out.println("**********************");

		Got_Button.click();

		Thread.sleep(4000);
		Book_Now_Button.click();
		Thread.sleep(3000);

	}

}
