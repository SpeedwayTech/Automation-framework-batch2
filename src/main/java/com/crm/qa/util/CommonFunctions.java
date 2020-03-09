package com.crm.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunctions {
	
	public static void switchToFrame(WebDriver driver, WebElement element) {
		
		driver.switchTo().frame(element);
	}

}
