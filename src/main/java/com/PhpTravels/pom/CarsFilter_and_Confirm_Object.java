package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsFilter_and_Confirm_Object {
	
	
	@FindBy(xpath="//h4/a[@href='https://www.phptravels.net/cars/united-kingdom/manchester/Kia-Pacanto-2014?&pickupLocation=7&dropoffLocation=7&pickupDate=20/06/2019&pickupTime=00:00&dropoffDate=30/06/2019&dropoffTime=02:00']") 
	
	public WebElement Car_Select;
	
	
	@FindBy(xpath="//button[text()='Book Now']")
	
	public WebElement Book_Now_Button;

}
