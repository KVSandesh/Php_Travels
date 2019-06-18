package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightBooking_Object {

	@FindBy(xpath = "//span[text()='Flights   ']")
	public WebElement Flights;

	@FindBy(id = "s2id_location_from")
	public WebElement From_Flight;

	@FindBy(id = "s2id_location_to")
	public WebElement To_FLight;

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

	@FindBy(id = "sumManualPassenger")
	public WebElement Sum;

	@FindBy(xpath = "//label[@for='round']")
	public WebElement Round_Trip;

	@FindBy(xpath = "//*[@id='flights']/form/div[6]/button")

	public WebElement Search_Button;

}

/*
 * @FindBy(xpath="") public WebElement ;
 * 
 * @FindBy(id = "telugu") public WebElement
 */
