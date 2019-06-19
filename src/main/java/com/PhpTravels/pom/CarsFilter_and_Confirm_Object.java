package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsFilter_and_Confirm_Object {

	@FindBy(xpath = "//table[@class='bgwhite table table-striped']/tbody/tr[1]/td[1]/div[1]")
	public WebElement Select_Car;

	@FindBy(xpath = "//button[text()='Book Now']")
    public WebElement Book_Now_Button;

	@FindBy(xpath = "//button[text()='CONFIRM THIS BOOKING']")
	public WebElement COnfirm_Book_FLight;
	
	
	public void Cars_Confirm() throws Throwable {
		
		Select_Car.click();
		Thread.sleep(3000);
		Book_Now_Button.click();
		Thread.sleep(3000);
		COnfirm_Book_FLight.click();
		Thread.sleep(3000);
	}

}
