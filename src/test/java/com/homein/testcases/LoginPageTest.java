package com.homein.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.homein.base.BaseTest;
import com.homein.pages.HomePage;
import com.homein.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();	
	}
	
	@BeforeMethod
	public void setup() {
		initialisation();
		loginPage=new LoginPage();
	}
	
	@Test(priority=1, enabled=true)
	public void homeinLoginTest(){
		homePage=loginPage.homeinLogin();
		Assert.assertTrue(loginPage.verifyLogin());
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
