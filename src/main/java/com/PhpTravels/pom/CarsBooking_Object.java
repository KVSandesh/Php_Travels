package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CarsBooking_Object {

	@FindBy(xpath = "//span[text()='Cars      ']")
	public WebElement Cars_Tab;

	@FindBy(id = "s2id_carlocations")
	public WebElement carfrom;

	@FindBy(id = "s2id_carlocations2")
	public WebElement carTo;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][4]/div[1]/table/tbody/tr/td[contains(text(),25)]")
	public WebElement checkin_Date;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][5]/div[1]/table/tbody/tr/td[contains(text(),30) and @class='day ']")
	public WebElement checkout_Date;

	@FindBy(id = "departcar")
	public WebElement departcar;

	@FindBy(id = "returncar")
	public WebElement returncar;

	@FindBy(xpath = "//*[@id='cars']/form/div[7]/button")
	public WebElement Seacrch;

	@FindBy(xpath = "//select[@name='pickupTime']")
	public WebElement pickupTime;

	@FindBy(xpath = "//select[@name='dropoffTime']")
	public WebElement dropoffTime;

	public void Cars_Booking() throws Throwable {
		Cars_Tab.click();

		carfrom.click();
		Thread.sleep(2000);

		Select Drop1 = new Select(carfrom);
		Drop1.selectByVisibleText("Manchester");

		carTo.click();

		Select Drop2 = new Select(carTo);
		Drop2.selectByVisibleText("Nile Egypt");

		checkin_Date.click();
		checkout_Date.click();

		departcar.click();

		returncar.click();

		pickupTime.click();
		Select Drop4 = new Select(pickupTime);
		Drop4.selectByValue("3");

		dropoffTime.click();

		Select Drop3 = new Select(dropoffTime);
		Drop3.selectByValue("6");

		Seacrch.click();

	}

}
