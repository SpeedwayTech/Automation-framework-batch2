package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.CommonFunctions;



public class ContactPageTest extends TestBase{
	LoginPage loginPage;
	ContactPage contactPage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage(driver);
		contactPage = new ContactPage(driver);
		loginPage.enterUsername(prop.getProperty("username"));
		loginPage.enterPassword(prop.getProperty("password"));
		loginPage.clickonLoginBtn();	
	}
	
	@Test
	public void createContactSuccessTest() {
		CommonFunctions.switchToFrame(driver, driver.findElement(By.xpath("//frame[@name='mainpanel']")));
		contactPage.movToNewContactLink(driver);
		contactPage.clickOnNewContactLink();
		contactPage.enterContactDetails("abc", "dfe", "xyz");
		contactPage.clickOnRecieveMail();
		contactPage.clickOnSaveBtn();
		WebElement contactNameTitle = driver.findElement(By.xpath("(//td[@class='tabs_header'])[1]"));
		String actualTitleText = contactNameTitle.getText();		
		Assert.assertEquals("abc xy", actualTitleText);	
	}
	
	@Test
	public void deleteContact() {
		
		
	}

	@AfterMethod
	public void tearDown(){
	driver.quit();
	}
}
