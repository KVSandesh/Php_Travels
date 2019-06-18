package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Object {
	
	
	@FindBy(xpath="//input[@placeholder='Email']")
	  public WebElement Email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	  public WebElement Password;
	
	@FindBy(xpath="//button[@type='submit' and text()='Login']")
	  public WebElement LoginButton;
	
	public void login_1(String username, String password) throws Throwable
	
	{
		Email.sendKeys(username);
		Thread.sleep(1000);
		Password.sendKeys(password);
		Thread.sleep(1000);
		LoginButton.click();
		Thread.sleep(3000);
	}
	

	
	

}
