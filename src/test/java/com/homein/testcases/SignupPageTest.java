package com.homein.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.homein.base.BaseTest;
import com.homein.pages.SignupPage;

public class SignupPageTest extends BaseTest{
	SignupPage signupPage;
	
	public SignupPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		
		initialisation();
		signupPage=new SignupPage();
		softAssert = new SoftAssert();
	}
	
	@Test
	public void verifySignupTest() {
		Assert.assertEquals(signupPage.getSignupPageText(), "Create your Home-in account");
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
