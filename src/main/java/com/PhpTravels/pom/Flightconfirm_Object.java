package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Flightconfirm_Object {

	@FindBy(xpath = "//button[text()='Got it!']")
	public WebElement Got_Button;

	/*
	 * @FindBy(xpath = "//input[@placeholder='Depart']") public WebElement
	 * Depart_Flight;
	 * 
	 * @FindBy(xpath = "//input[@placeholder='Return']") public WebElement
	 * Return_Flight;
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='datepicker dropdown-menu'][1]/div[1]/table/tbody/tr/td[contains(text(),25)]"
	 * ) public WebElement from_Date;
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='datepicker dropdown-menu'][2]/div/table/tbody/tr[6]/td[contains(text(),30) and @class='day ']"
	 * ) public WebElement Deaprt_Date;
	 * 
	 * @FindBy(xpath = "//input[@name='totalManualPassenger']") public WebElement
	 * totalManualPassenger;
	 * 
	 * @FindBy(xpath = "//select[@name='madult']") public WebElement Adult;
	 * 
	 * @FindBy(xpath = "//select[@name='mchildren']") public WebElement Children;
	 * 
	 * @FindBy(xpath = "//select[@name='minfant']") public WebElement minfant;
	 * 
	 * @FindBy(id = "sumManualPassenger") public WebElement Sum;
	 * 
	 * @FindBy(xpath = "//*[@id='body-section']/div[2]/div/form/div[6]/button")
	 * public WebElement Search_Button;
	 */

	@FindBy(xpath = "//table[@class='bgtable table table-striped flight-listing flights']/child::tbody/child::tr[1]/td/div[2]/p/button ")
	public WebElement Book_FLight;

	@FindBy(id = "sumManualPassenger")
	public WebElement Sum;

	@FindBy(xpath = "//input[@name='totalManualPassenger']")
	public WebElement totalManualPassenger;

	@FindBy(xpath = "//button[text()='CONFIRM THIS BOOKING']")
	public WebElement COnfirm_Book_FLight;

	@FindBy(xpath = "//body[@style='overflow: visible;']/div[5]/div[4]/div/div[3]/div/table/tbody/tr[1]/td/div/div/div[2]/p/strong/span[1]")
	public WebElement Attribute_1;
	@FindBy(xpath = "//body[@style='overflow: visible;']/div[5]/div[4]/div/div[3]/div/table/tbody/tr[1]/td/div/div/div[2]/p/strong/span[2]")
	public WebElement Attribute_2;

	@FindBy(xpath = "//body[@style='overflow: visible;']/div[5]/div[4]/div/div[3]/div/table/tbody/tr[1]/td/div/div[1]/div[3]/p/small/strong")
	public WebElement Attribute_3;
	@FindBy(xpath = "//body[@style='overflow: visible;']/div[5]/div[4]/div/div[3]/div/table/tbody/tr[2]/td/div[1]/div[3]/div[3]/p/small/strong")
	public WebElement Attribute_4;
	@FindBy(xpath = "//select[@name='madult']/option[1]")
	public WebElement Attribute_5;
	@FindBy(xpath = "//select[@name='mchildren']/option[1]")
	public WebElement Attribute_6;
	@FindBy(xpath = "//select[@name='minfant']/option[1]")
	public WebElement Attribute_7;
	
	@FindBy(xpath = "//button[text()='Pay on Arrival']")
	public WebElement Invoice;
	
	
	String Actual_1 = "BLR";
	String Actual_2 = "BLR";
	String Actual_3 = "2019-06-28";
	String Actual_4 = "2019-06-30";
	String Actual_5 = "2";
	String Actual_6 = "1";
	String Actual_7 = "1";

	public void Confirm_Flight() throws Throwable {

		SoftAssert assertion = new SoftAssert();

		System.out.println("\n");
		
		System.out.println("**********************");
		System.out.println("Deatils after selecting Flights");
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

		String expect_3 = Attribute_3.getText();
		System.out.println("Checkin Date is ::" + expect_3);
		assertion.assertEquals(Actual_3, expect_3);
		Reporter.log("Checkin Date is True", true);
		System.out.println("**********************");

		String expect_4 = Attribute_4.getText();
		System.out.println("Checkout Date is ::" + expect_4);
		assertion.assertEquals(Actual_4, expect_4);
		Reporter.log("Checkout Date is true", true);
		System.out.println("**********************");

		totalManualPassenger.click();
		Thread.sleep(2000);

		String expect_5 = Attribute_5.getAttribute("value");
		System.out.println("THe no of Adult is ::" + expect_5);
		assertion.assertNotEquals(Actual_5, expect_5);
		Reporter.log("THe no of Adult is false", true);
		System.out.println("**********************");

		String expect_6 = Attribute_6.getAttribute("value");
		System.out.println("THe no of child is ::" + expect_6);
		assertion.assertNotEquals(Actual_6, expect_6);
		Reporter.log("THe no of child is false", true);
		System.out.println("**********************");

		String expect_7 = Attribute_7.getAttribute("value");
		System.out.println("THe no of Infants is ::" + expect_7);
		assertion.assertNotEquals(Actual_7, expect_7);
		Reporter.log("THe no of Infants is False", true);
		System.out.println("**********************");

		Sum.click();
		Thread.sleep(3000);

		Got_Button.click();

		Thread.sleep(1000);

		Book_FLight.click();
		Thread.sleep(3000);
		
		
	/*	Got_Button.click();
		Thread.sleep(2000);*/

		COnfirm_Book_FLight.click();
		
		
		Thread.sleep(4000);
       

	}

}


