package com.homein.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.homein.base.BaseTest;
import com.homein.pages.HomePage;
import com.homein.pages.LoginPage;
import com.homein.util.TestUtil;

public class HomePageTest extends BaseTest {

	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		
		initialisation();
		loginPage=new LoginPage();
		homePage=new HomePage();
		softAssert = new SoftAssert();
		loginPage.homeinLogin();		
	}

	
	@Test(priority=1, enabled=true)
	public void verifyHomeMenuTest() throws InterruptedException {
		Thread.sleep(5000);
		homePage.goToHome();
		
		Thread.sleep(10000);
		
		TestUtil.switchFrames();
		
		homePage.goToTeam();
		Thread.sleep(10000);
		homePage.gotoDocuments();
		Thread.sleep(10000);			
	}
	
	@Test(priority=2, enabled=true)
	public void verifyGuidenceMenuTest() throws InterruptedException {
		Thread.sleep(5000);
		homePage.goToGuidance();
		Thread.sleep(5000);
		
		TestUtil.switchFrames();
		
		softAssert.assertEquals(homePage.getGuidancePageTitle(), "Get Support");
		homePage.goToLogoff();
	}
	
	@Test(priority=3, enabled=true)
	public void verifyProfileMenuTest() throws InterruptedException {
		Thread.sleep(5000);
		homePage.goToProfile();
		Thread.sleep(5000);
		
		TestUtil.switchFrames();
		
		System.out.println(homePage.getProfilePageTitle());
		softAssert.assertEquals(homePage.getProfilePageTitle(), "Profile");
		homePage.goToLogoff();
	}
	
	@Test(priority=4, enabled=true)
	public void verifyLogoffMenuTest() {
		homePage.goToLogoff();
		Assert.assertTrue(homePage.getLogoffStatus());
			
	}
	
	@Test(priority=5, enabled=true)
	public void addPropertyTest() throws InterruptedException {
		Thread.sleep(5000);
		homePage.addProperty();
	}
	
	@AfterMethod
	public void close() {
		//driver.quit();
	}
}
