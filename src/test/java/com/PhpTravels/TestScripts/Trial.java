package com.PhpTravels.TestScripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PhpTravels.Constants.Browsers;
import com.PhpTravels.Constants.ExcelLibrary;
import com.PhpTravels.pom.AHomePage_Object;
import com.PhpTravels.pom.Login_Object;
import com.PhpTravels.pom.MyAccount_Object;

public class Trial {

	WebDriver driver;

	@BeforeClass

	public void openBrowser() {
		driver = Browsers.getBrowser();

	}

	@Test

	public void SignUp() throws Throwable {
driver.get("https://www.phptravels.net/hotels/detail/singapore/rendezvous-hotels");

WebElement wb = driver.findElement(By.xpath("	//div[@class='datepicker dropdown-menu'][2]/div/table/tbody/tr/td[contains(text(),25)]"));

  Assert.assertEquals(wb, "ELement found");
	}
	
	@AfterClass(enabled = true)
	public void close_Browser() {
		driver.close();

}
	
}
