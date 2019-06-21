package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Tours_Confirm_1 {

	@FindBy(xpath = "//button[text()='Got it!']")
	public WebElement Got_Button;

	@FindBy(id = "selectedChild")
	public WebElement Select_CHild;

	@FindBy(id = "selectedInfants")
	public WebElement Select_infants;

	@FindBy(xpath = "//button[text()='Book Now']")
	public WebElement Tours_BookNow_Button;
	
	@FindBy(xpath = "//div[@class='datepicker dropdown-menu']/div/table/tbody/tr[5]/td[3][contains(text(),'25')]")
	public WebElement Select_Date;
	
	
	@FindBy(xpath = "//div[@class='container mob-row'][2]/div[2]/div[2]/div/div/form/div/div[2]/input")
	public WebElement Attribute;
	
	String Actual= "25/06/2019";

	public void Tours_Confirm() throws Throwable {

		Thread.sleep(3000);
		Got_Button.click();
		Thread.sleep(3000);
		
		SoftAssert assertion = new SoftAssert();

		System.out.println("\n");
		
		System.out.println("**********************");
		System.out.println("Details after selecting Tours");
		System.out.println("**********************");
		
		String expect = Attribute.getAttribute("value");
		System.out.println("Date is ::" + expect);
		assertion.assertEquals(Actual, expect);
		Reporter.log("Selected Date is True ", true);
		System.out.println("**********************");
		
		
	/*	Attribute.click();
		Thread.sleep(2000);
		Select_Date.click();
		
		String expect1 = Attribute.getAttribute("value");
		System.out.println("After Reselcting  Date is ::" + expect1);
		assertion.assertEquals(Actual, expect1);
		Reporter.log("Date is True, reselect", true);
		System.out.println("**********************");*/
		
		
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
