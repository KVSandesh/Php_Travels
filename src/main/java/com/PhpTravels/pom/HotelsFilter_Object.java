package com.PhpTravels.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HotelsFilter_Object {

	WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "//input[@value='2 Adult 0 Child']")
	public WebElement Select_People_No;

	@FindBy(id = "childPlusBtn")
	public WebElement Select_Child;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div/div/input[@name='checkin']")
	public WebElement checkin;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div/div/input[@name='checkout']")
	public WebElement checkout;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][2]/div/table/tbody/tr/td[contains(text(),25)]")
	public WebElement checkin_Date;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][4]/div/table/tbody/tr[6]/td[contains(text(), 30)]")
	public WebElement checkout_Date;

	@FindBy(xpath = "//h4/a[@href='https://www.phptravels.net/hotels/detail/singapore/rendezvous-hotels']")
	public WebElement Hotel;

	@FindBy(xpath = "//table[@class='bgwhite table table-striped']/tbody/tr[1]/td[1]/div[1]")
	public WebElement Select_Hotel_1;

	@FindBy(xpath = "//table[@class='bgwhite table table-striped']/tbody/tr[3]/td[1]/div[1]")
	public WebElement Select_Hotel_2;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div/div/select[@name='adults']")
	public WebElement Select_Filer_Adult;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form/div/div/select[@name='child']")
	public WebElement Select_Filer_Child;

	@FindBy(xpath = "//div[@class='container mob-row']/div/div/div/form[@name='fModifySearch']/div[5]/input[3]")
	public WebElement Modify_BUtton;

	@FindBy(xpath = "//tbody/tr[1]/td/div/div/div/div/div/label/div[1]")
	public WebElement Hotel_Check;

	@FindBy(xpath = "	//*[@id='ROOMS']/div/button")
	public WebElement Book_Button;

	@FindBy(xpath = "//button[text()='CONFIRM THIS BOOKING']")
	public WebElement Confirm_Booking;

	@FindBy(xpath = "//div[text()='Available Rooms']")
	public WebElement Scroll_Down_element;

	// div[@class='datepicker
	// dropdown-menu'][2]/div/table/tbody/tr/td[contains(text(),25)]
	// div[@class='datepicker
	// dropdown-menu'][4]/div/table/tbody/tr[6]/td[contains(text(),30 )and
	// @class='day active']
	// div[@class='datepicker dropdown-menu'][1]/div[1]/table/tbody/tr[5]

	public void Hotel_Select() throws Throwable {

		Select_Hotel_2.click();

		Thread.sleep(5000);

		//js.executeScript("arguments[0].scrollIntoView();", Scroll_Down_element);
		
		
		//js.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(3000);
		checkin.click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		checkin_Date.click();
		Thread.sleep(2000);

		checkout.click();
		Thread.sleep(5000);
		checkout_Date.click();
		Thread.sleep(5000);

		Select dropdown = new Select(Select_Filer_Adult);
		dropdown.selectByVisibleText("2");
		Thread.sleep(1000);

		Select dropdown2 = new Select(Select_Filer_Child);
		dropdown2.selectByVisibleText("1");
		Thread.sleep(1000);
		Modify_BUtton.click();

		Thread.sleep(5000);
		Hotel_Check.click();

		Thread.sleep(1000);
		Book_Button.click();

		Thread.sleep(3000);
		Confirm_Booking.click();

	}
}
