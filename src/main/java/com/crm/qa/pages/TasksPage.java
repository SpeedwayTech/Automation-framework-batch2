package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {

	public TasksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
