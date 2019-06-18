package com.PhpTravels.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsFilter_Object {
	
	@FindBy(xpath="//h4/a[@href='https://www.phptravels.net/hotels/detail/singapore/rendezvous-hotels']") 
	public WebElement Hotel;
	
	@FindBy(xpath="//table[@class='bgwhite table table-striped']/tbody/tr[1]/td[1]/div[1]")
	public WebElement Select_Hotel_1;
	
	@FindBy(xpath="//table[@class='bgwhite table table-striped']/tbody/tr[3]/td[1]/div[1]")
	public WebElement Select_Hotel_2;

	
	public void Hotel_Select() throws Throwable {
		
		Select_Hotel_2.click();
	}
}
/*
 * @FindBy(xpath="") public WebElement ;
 * @FindBy(id = "telugu") public WebElement
 * 
 * 
 */