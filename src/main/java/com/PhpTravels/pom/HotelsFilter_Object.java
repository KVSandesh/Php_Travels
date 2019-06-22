package com.PhpTravels.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class HotelsFilter_Object {

	WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "//input[@value='2 Adult 0 Child']")
	public WebElement Select_People_No;

	@FindBy(id = "childPlusBtn")
	public WebElement Select_Child;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div/div/input[@name='checkin']")
	public WebElement checkin;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div/div/input[@name='checkout']")
	public WebElement checkout;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div/div/input[@value='28/06/2019']")
	public WebElement Verify_checkin_Date_1;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div/div/input[@value='21/06/2019']")
	public WebElement Verify_checkin_Date_2;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div[2]//input[@value='30/06/2019']")
	public WebElement Verify_checkout_Date;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][2]/div/table/tbody/tr[5]/td[contains(text(),28)]")
	public WebElement checkin_Date;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][4]/div/table/tbody/tr[6]/td[contains(text(), 30)]")
	public WebElement checkout_Date;

	@FindBy(xpath = "//h4/a[@href='https://www.phptravels.net/hotels/detail/singapore/rendezvous-hotels']")
	public WebElement Hotel;

	@FindBy(xpath = "//table[@class='bgwhite table table-striped']/tbody/tr[1]/td[1]/div[1]")
	public WebElement Select_Hotel_1;

	@FindBy(xpath = "//table[@class='bgwhite table table-striped']/tbody/tr[3]/td[1]/div[1]")
	public WebElement Select_Hotel_2;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div/div/select[@name='adults']")
	public WebElement Select_Filer_Adult;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div/div/select[@name='child']")
	public WebElement Select_Filer_Child;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form[@name='fModifySearch']/div[5]/input[3]")
	public WebElement Modify_BUtton;

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

	public void Hotel_Select() throws Throwable {

		Select_Hotel_2.click();

		Thread.sleep(2000);
		Got_Button.click();

		Thread.sleep(3000);

		SoftAssert assertion = new SoftAssert();

		

		System.out.println("********Before Redefining****");

		String expect_1 = Attribute_1.getAttribute("value");
		System.out.println("Before  Redefing the Checkindate is ::" + expect_1);
		assertion.assertNotEquals(Actual_1, expect_1);
		Reporter.log("THe checkin Date is Wrong Try to Redefine", true);

		String expect_2 = Attribute_2.getAttribute("value");
		System.out.println("Checkinout is ::" + expect_2);
		assertion.assertNotEquals(Actual_2, expect_2);
		Reporter.log("THe checkout Date is Wrong Try to Redefine", true);

		String expect_3 = Attribute_3.getAttribute("value");
		System.out.println("THe no of Adults is ::" + expect_3);
		assertion.assertNotEquals(Actual_3, expect_3);
		Reporter.log("THe no of Adults is true", true);

		String expect_4 = Attribute_4.getAttribute("value");
		System.out.println("THe no of chils is ::" + expect_4);
		assertion.assertNotEquals(Actual_4, expect_4);
		Reporter.log("THe no of chils is Wrong Try to Redefine", true);

		Thread.sleep(3000);
		checkin.click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		checkin_Date.click();
		Thread.sleep(2000);

		checkout.click();
		Thread.sleep(2000);
		checkout_Date.click();
		Thread.sleep(2000);

		Select dropdown = new Select(Select_Filer_Adult);
		dropdown.selectByVisibleText("2");
		Thread.sleep(1000);

		Select dropdown2 = new Select(Select_Filer_Child);
		dropdown2.selectByVisibleText("1");
		Thread.sleep(3000);

		Modify_BUtton.click();
		Thread.sleep(3000);

	}
}
