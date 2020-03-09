package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@href='https://classic.freecrm.com/system/index.cfm?action=contact']") 
	WebElement contactLink;
	
	@FindBy(xpath="//a[@title='New Contact']") 
	WebElement newContactLink;
	
	@FindBy(xpath="//input[@id='first_name']") 
	WebElement firstNameText;
	
	@FindBy(xpath="//input[@id='middle_initial']") 
	WebElement middelNameText;
	
	@FindBy(xpath="//input[@id='surname']") 
	WebElement surNameText;
	
	@FindBy(xpath="//input[@name='receive_email' and @value='N']") 
	WebElement recieveMailRadioBtn;
	
	@FindBy(xpath="(//input[@type='submit'])[1]") 
	WebElement saveBtn;
	
	
	public void movToNewContactLink(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(contactLink).build().perform();		
	}
	
	public void clickOnNewContactLink(){
		newContactLink.click();
	}
	
	public void enterContactDetails(String firstName, String middleName, String surname) {
		firstNameText.sendKeys(firstName);
		middelNameText.sendKeys(middleName);
		surNameText.sendKeys(surname);	
	}
	
	public void clickOnRecieveMail() {
		recieveMailRadioBtn.click();
	}
	
	public void clickOnSaveBtn() {
		saveBtn.click();
	}
	
	
	
	
	
	
	

}
