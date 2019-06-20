package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Tours_Confirm_1 {

	@FindBy(xpath = "//button[text()='Got it!']")
	public WebElement Got_Button;

	@FindBy(id = "selectedChild")
	public WebElement Select_CHild;

	@FindBy(id = "selectedInfants")
	public WebElement Select_infants;

	@FindBy(xpath = "//button[text()='Book Now']")
	public WebElement Tours_BookNow_Button;

	public void Tours_Confirm() throws Throwable {

		Thread.sleep(3000);
		Got_Button.click();
		Thread.sleep(3000);
		Select_CHild.click();
		Thread.sleep(3000);
		Select dropdown4 = new Select(Select_CHild);
		dropdown4.selectByVisibleText("1");
		Thread.sleep(2000);
		Select_infants.click();
		Thread.sleep(2000);
		Select dropdown5 = new Select(Select_infants);
		dropdown5.selectByVisibleText("1");
		Thread.sleep(2000);
		Tours_BookNow_Button.click();

	}

}
