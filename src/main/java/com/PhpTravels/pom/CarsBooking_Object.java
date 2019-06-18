package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsBooking_Object {
	
	@FindBy(xpath="//span[text()='Cars      ']") 
	public WebElement Cars;	
	
	@FindBy(id="s2id_carlocations") 
	public WebElement carfrom;	
	
	@FindBy(id="s2id_carlocations2") 
	public WebElement carTo;	
	
	@FindBy(id="departcar") 
	public WebElement departcar;	
	
	@FindBy(id="returncar") 
	public WebElement returncar;	
		
	
	@FindBy(xpath="//*[@id='cars']/form/div[7]/button") 
	public WebElement Seacrch;	
	
	@FindBy(xpath="//select[@name='dropoffTime']") 
	public WebElement dropoffTime;	

}

/*
 * @FindBy(xpath="") public WebElement ;
 * @FindBy(id = "telugu") public WebElement
 */



