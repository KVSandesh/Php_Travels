package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ToursBooking_Object {

	@FindBy(xpath = "//span[text()='Tours     ']")
	public WebElement Tours;

	@FindBy(xpath = "//span[text()='Search by Listing or City Name']")
	public WebElement Select_City;
	
	@FindBy(xpath = "//div[@class='select2-result-label' and text()='Big Bus Tour of Dubai']")
	public WebElement Select_City_in_List;
	
	

	@FindBy(xpath = "//input[@placeholder='Check in' and @name='date']")
	public WebElement checkin;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][3]/div[1]/table/tbody/tr/td[contains(text(),25)]")
	public WebElement PickDate;

	@FindBy(id = "adults")
	public WebElement adults;

	@FindBy(id = "tourtype")
	public WebElement tourtype;

	@FindBy(xpath = "//*[@id='tours']/form/div[5]/button")
	public WebElement Seach_button;

	@FindBy(id = "selectedChild")
	public WebElement Select_CHild;

	@FindBy(id = "selectedInfants")
	public WebElement Select_infants;

	@FindBy(xpath = "//button[text()='Book Now']")
	public WebElement Tours_BookNow_Button;

	public void Tours() throws Throwable {
		
		
		Tours.click();
		Thread.sleep(3000);
		Select_City.click();
		Thread.sleep(1000);

		Select_City_in_List.click();
		Thread.sleep(2000);
		checkin.click();
		Thread.sleep(2000);
		PickDate.click();
		Thread.sleep(2000);
		adults.click();
		Thread.sleep(2000);
		Select dropdown2 = new Select(adults);
		dropdown2.selectByVisibleText("2 Guests");

		Thread.sleep(2000);
		tourtype.click();
		Select dropdown3 = new Select(tourtype);
		dropdown3.selectByVisibleText("Private");
		Thread.sleep(2000);
		
		Seach_button.click();

	

	}

}


