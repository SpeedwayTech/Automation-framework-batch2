package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DealsPage {

	public DealsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
