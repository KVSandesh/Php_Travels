package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Cars_Booking_Object {

	@FindBy(xpath = "//span[text()='Cars      ']")
	public WebElement Cars_Tab;

	@FindBy(id = "s2id_carlocations")
	public WebElement carfrom;

	@FindBy(xpath = "//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active']/ul/li[2]/div")
	public WebElement from_city;

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

		from_city.click();
		Thread.sleep(2000);
		// carTo.click();

		departcar.click();
		Thread.sleep(2000);
		checkin_Date.click();
		Thread.sleep(2000);
		// returncar.click();
		Thread.sleep(2000);
		checkout_Date.click();

		Thread.sleep(2000);

		pickupTime.click();
		Select Drop4 = new Select(pickupTime);
		Drop4.selectByIndex(3);
		Thread.sleep(2000);
		dropoffTime.click();
		Thread.sleep(2000);
		Select Drop3 = new Select(dropoffTime);
		Drop3.selectByIndex(7);

		Seacrch.click();
		Thread.sleep(2000);

	}

}
