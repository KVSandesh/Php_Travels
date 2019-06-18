package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount_Object {
	
	
	@FindBy(xpath="//span[text()='Hotels    ']")
	  public WebElement Hotel;
	
	@FindBy(xpath="//h3[text()='Hi, Sandy kv']")
	public WebElement verify_account;
	

}
