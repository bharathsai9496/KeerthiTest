package com.wrappers.selnium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium_Actions.BaseClass;

public class seleniumWrapper extends BaseClass{

	Actions actions;

	public String getTitle() {
		return driver.getTitle();
	}

	public void moveAndClick(WebElement element) {

		actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

	}

}
