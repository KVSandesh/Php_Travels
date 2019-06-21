package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cars_Filter_Object {

	@FindBy(xpath = "//table[@class='bgwhite table table-striped']/tbody/tr[1]/td[1]/div[1]")
	public WebElement Select_Car;

	@FindBy(xpath = "//button[text()='Book Now']")
    public WebElement Book_Now_Button;

	@FindBy(xpath = "//button[text()='CONFIRM THIS BOOKING']")
	public WebElement COnfirm_Book_Car;
	
	
	public void Cars_Filter() throws Throwable {
		
		Select_Car.click();
		Thread.sleep(3000);
		
	}

}
