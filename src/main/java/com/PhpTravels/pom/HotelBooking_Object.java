package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelBooking_Object {
	
	@FindBy(xpath="//div[@class='control__indicator']/parent::*/child::*[@value='53']") 
	
	public WebElement Hotel_CHeck;
	
	
	
	@FindBy(xpath="	//*[@id='ROOMS']/div/button")
	
	public WebElement Book_Button;


}
