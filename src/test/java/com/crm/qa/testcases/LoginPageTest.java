package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.RetryCountIfFailed;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=0)
	@RetryCountIfFailed(2)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
