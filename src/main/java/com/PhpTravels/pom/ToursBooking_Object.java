package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToursBooking_Object {
	
	
	@FindBy(xpath="//span[text()='Tours     ']") 
	public WebElement Tours;
	
	@FindBy(xpath="//span[text()='Search by Listing or City Name']") 
	public WebElement Select_City;
	
	@FindBy(xpath="//input[@placeholder='Check in' and @name='date']") 
	public WebElement checkin;
	
	@FindBy(id="adults") 
	public WebElement adults;
	
	@FindBy(id="tourtype") 
	public WebElement tourtype;
	
	@FindBy(xpath="//*[@id='tours']/form/div[5]/button") 
	public WebElement Seach_button;
	

	
}

/*
 * @FindBy(xpath="") public WebElement ;
 * @FindBy(id = "telugu") public WebElement
 */


