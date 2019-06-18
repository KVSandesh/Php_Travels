package com.PhpTravels.Constants;

 import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Waits {

		public void waitForElementPresent(WebElement wb) {
			WebDriverWait wait = new WebDriverWait(Browsers.driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(wb));
		}

	}



