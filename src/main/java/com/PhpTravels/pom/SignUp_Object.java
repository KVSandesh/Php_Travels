package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp_Object extends AHomePage_Object{

	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement firstname;

	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement lastname;

	@FindBy(xpath = "//input[@name='phone']")
	public WebElement phone;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;

	@FindBy(xpath = "//input[@name='confirmpassword']")
	public WebElement confirmpassword;

	@FindBy(xpath = "//button[@type='submit' and text()=' Sign Up']")
	public WebElement SignUp;
	
	@FindBy(xpath = "//div[text()=' Email Already Exists. ']")
	public WebElement Verify_Login;
	
	
	
	public void SignUp_PhpTravels(String FirstName, String LastName,  String MobileNumber, String Email, String Password, String ConfirmPassword) throws Throwable 
	{
		
	    Thread.sleep(3000);
		firstname.sendKeys(FirstName);
		Thread.sleep(1000);
		lastname.sendKeys(LastName);
		Thread.sleep(1000);
		phone.sendKeys(MobileNumber);
		Thread.sleep(1000);
		email.sendKeys(Email);
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		confirmpassword.sendKeys(ConfirmPassword);
		Thread.sleep(3000);
		SignUp.click();
		
	}

}

