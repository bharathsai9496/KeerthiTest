package com.UI.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium_Actions.BaseClass;

public class HomePage extends BaseClass {

	private final String multipleTabs = "//li[contains(@class,'header-main__list-item Header')]//span";

	public void getset() {

		
		System.out.println(driver.findElement(By.xpath(multipleTabs)).getText());
		
//		List<WebElement> tabs = driver.findElements(By.xpath(multipleTabs));
//		
//		for(WebElement wb:tabs) {
//			
//			System.out.println(wb.getText());
//			
//		}
	}
}
