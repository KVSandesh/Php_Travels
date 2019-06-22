package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class FlightBooking_Object {

	@FindBy(xpath = "//span[text()='Flights   ']")
	public WebElement Flights;

	@FindBy(id = "s2id_location_from")
	public WebElement From_Flight;

	@FindBy(xpath = "//button[text()='Got it!']")
	public WebElement Got_Button;

	@FindBy(xpath = "//ul[@class='select2-results']/li")
	public WebElement Select_from_List;

	@FindBy(xpath = "//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active'][1]/div/input")
	public WebElement Add_FLight_Name_from;

	@FindBy(xpath = "//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active'][2]/div/input")
	public WebElement Add_FLight_Name_TO;

	@FindBy(id = "s2id_location_to")
	public WebElement To_FLight;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][6]/div[1]/table/tbody/tr[5]/td[contains(text(),28)]")
	public WebElement from_Date;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][7]/div/table/tbody/tr[6]/td[contains(text(),30) and @class='day ']")
	public WebElement Deaprt_Date;

	@FindBy(xpath = "//input[@placeholder='Depart']")
	public WebElement Depart_Flight;

	@FindBy(xpath = "//input[@placeholder='Return']")
	public WebElement Return_Flight;

	@FindBy(xpath = "//input[@name='totalManualPassenger']")
	public WebElement totalManualPassenger;

	@FindBy(xpath = "//select[@name='madult']")
	public WebElement Adult;

	@FindBy(xpath = "//select[@name='mchildren']")
	public WebElement Children;

	@FindBy(xpath = "//select[@name='minfant']")
	public WebElement minfant;

	@FindBy(id = "sumManualPassenger")
	public WebElement Sum;

	@FindBy(xpath = "//label[@for='round']")
	public WebElement Round_Trip;

	@FindBy(xpath = "//*[@id='flights']/form/div[6]/button")

	public WebElement Search_Button;

	@FindBy(xpath = "//span[text()='Flights   ']")
	public WebElement Flight_Tab;

	@FindBy(xpath = "//table[@class='bgtable table table-striped flight-listing flights']/child::tbody/child::tr[1]/td/div[2]/p/button ")
	public WebElement Book_FLight;

	
	
	

	public void Book_Flight() throws Throwable {
		
	

		Flight_Tab.click();
		Thread.sleep(3000);

		From_Flight.click();
		Thread.sleep(3000);
		Add_FLight_Name_from.click();
		Thread.sleep(3000);
		Add_FLight_Name_from.sendKeys("BLR");
		Thread.sleep(6000);
		Select_from_List.click();
		Thread.sleep(2000);

		To_FLight.click();
		Add_FLight_Name_TO.click();
		Thread.sleep(2000);
		Add_FLight_Name_TO.sendKeys("BLR");
		Thread.sleep(6000);
		Select_from_List.click();

		Round_Trip.click();
		Thread.sleep(2000);

		Depart_Flight.click();
		Thread.sleep(2000);
		from_Date.click();
		Thread.sleep(2000);
		Deaprt_Date.click();
		Thread.sleep(2000);
		totalManualPassenger.click();
		Thread.sleep(2000);

		Select dropdown = new Select(Adult);
		dropdown.selectByVisibleText("2");
		Thread.sleep(1000);

		Select dropdown2 = new Select(Children);
		dropdown2.selectByVisibleText("1");
		Thread.sleep(1000);

		Select dropdown3 = new Select(minfant);
		dropdown3.selectByVisibleText("1");
		Thread.sleep(1000);

		Sum.click();
		Thread.sleep(3000);

		Search_Button.click();

		Thread.sleep(6000);

	}

}

/*
 * @FindBy(xpath="") public WebElement ;
 * 
 * @FindBy(id = "telugu") public WebElement
 */
