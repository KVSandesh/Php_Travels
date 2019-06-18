package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flightconfirm_Object {

	
	@FindBy(xpath="//table[@class='bgtable table table-striped flight-listing flights']/child::tbody/child::tr[1]/td/div[2]/p/button ") 
	
	public WebElement Book_FLight;
	
	@FindBy(xpath="//button[text()='CONFIRM THIS BOOKING']")
	public WebElement COnfirm_Book_FLight;
}
/*
 * @FindBy(xpath="") public WebElement ;
 * @FindBy(id = "telugu") public WebElement
 */