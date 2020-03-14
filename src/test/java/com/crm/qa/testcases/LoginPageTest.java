package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.RetryCountIfFailed;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage(driver);	
	}
	
	@Test(priority=0)
	@RetryCountIfFailed(2)
	public void loginTest(){
		loginPage.enterUsername(prop.getProperty("username"));
		loginPage.enterPassword(prop.getProperty("password"));
		loginPage.clickonLoginBtn();
	}
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
