package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flightconfirm_Object {

	/*@FindBy(xpath = "//input[@placeholder='Depart']")
	public WebElement Depart_Flight;

	@FindBy(xpath = "//input[@placeholder='Return']")
	public WebElement Return_Flight;
	
	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][1]/div[1]/table/tbody/tr/td[contains(text(),25)]")
	public WebElement from_Date;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][2]/div/table/tbody/tr[6]/td[contains(text(),30) and @class='day ']")
	public WebElement Deaprt_Date;

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
	
	@FindBy(xpath = "//*[@id='body-section']/div[2]/div/form/div[6]/button")
    public WebElement Search_Button;*/
	
	@FindBy(xpath="//table[@class='bgtable table table-striped flight-listing flights']/child::tbody/child::tr[1]/td/div[2]/p/button ") 
	public WebElement Book_FLight;
	
	@FindBy(xpath="//button[text()='CONFIRM THIS BOOKING']")
	public WebElement COnfirm_Book_FLight;
	
	public void Confirm_Flight() throws Throwable {
		Book_FLight.click();
		Thread.sleep(5000);
		COnfirm_Book_FLight.click();
		
	}
	
	
}
/*
 * @FindBy(xpath="") public WebElement ;
 * @FindBy(id = "telugu") public WebElement
 */