package com.PhpTravels.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.PhpTravels.Constants.Waits;

public class AHomePage_Object extends Waits {

	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']/child::ul/child::li[1]")
	public WebElement Add_account;

	@FindBy(xpath = "//button[text()='Got it!']")
	public WebElement Got_Button;

	@FindBy(xpath = "//li[@class='open']/ul/li/a[@href='https://www.phptravels.net/register']")
	public WebElement Sign_Up_Button;

	@FindBy(xpath = "//li[@class='open']/ul/li//a[@href='https://www.phptravels.net/login']")
	public WebElement Home_Login_Buton;
	
	@FindBy(xpath="//*[@id='body-section']/div[2]/div[2]/div/div[1]/ul/li[2]/a")
	public WebElement verify_account_Login;
	
	@FindBy(xpath="//span[text()='Hotels    ']")
	  public WebElement Hotel;

	@FindBy(xpath = "//span[text()='Search by Hotel or City Name']")
	public WebElement Search_Hotel;

	@FindBy(xpath = "//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active']/div/input")
	public WebElement Search_Hotel_2;

	@FindBy(xpath = "//input[@class='form input-lg dpd1' and @name='checkin']")
	public WebElement checkin;

	@FindBy(xpath = "//input[@class='form input-lg dpd2' and @name='checkout']")
	public WebElement checkout;;

	@FindBy(xpath = "//input[@value='2 Adult 0 Child']")
	public WebElement Select_People_No;

	@FindBy(id = "childPlusBtn")
	public WebElement Select_Child;

	@FindBy(xpath = "//button[text()=' Search']")
	public WebElement Search_Button;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[2]")
	public WebElement Month;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][1]/div[1]/table/tbody/tr[5]/td[contains(text(),28)]")
	public WebElement checkin_Date;

	@FindBy(xpath = "//div[@class='datepicker dropdown-menu'][2]/div[1]/table/tbody/tr/td[contains(text(),30) and @class='day ']")
	public WebElement checkout_Date;

	@FindBy(xpath = "//span[text()='Hotels    ']")
	public WebElement Hotel_Tab;

	@FindBy(xpath = "//span[text()='Flights   ']")
	public WebElement Flight_Tab;

	@FindBy(xpath = "//span[text()='Bangalore']")
	public WebElement Hotel_Name;

	@FindBy(xpath = "//ul[@class='select2-results']/li/ul/li[1]")
	public WebElement Generic_Hotel_Name;

	public void Sign_Up() throws Throwable {

		Got_Button.click();
		Thread.sleep(1000);
		Add_account.click();
		Thread.sleep(1000);
		Sign_Up_Button.click();

	}

	public void Home_Login() throws Throwable {
		// Thread.sleep(5000);
		// Got_Button.click();
		Thread.sleep(1000);
		Add_account.click();
		Thread.sleep(1000);
		Home_Login_Buton.click();

	}

	public void Hotel() throws Throwable {
		Hotel_Tab.click();
		Thread.sleep(5000);
		Search_Hotel.click();
		Thread.sleep(1000);
		Search_Hotel_2.sendKeys("star");
		Thread.sleep(5000);
		Generic_Hotel_Name.click();
		Thread.sleep(2000);

		checkin.click();
		Thread.sleep(2000);
		checkin_Date.click();
		Thread.sleep(2000);

		// heckout.click();
		Thread.sleep(1000);
		checkout_Date.click();
		Thread.sleep(3000);

		Select_People_No.click();
		Thread.sleep(3000);
		Select_Child.click();
		Thread.sleep(3000);

		Select_People_No.click();
		Thread.sleep(1000);
		Search_Button.click();
		Thread.sleep(3000);

	}

}