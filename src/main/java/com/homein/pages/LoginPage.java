package com.homein.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.homein.base.BaseTest;
import com.homein.util.TestUtil;

public class LoginPage extends BaseTest{

	@FindBy(xpath="//strong[text()='Login']")
	WebElement loginBtn1;
    
	@FindBy(name="email")
	WebElement emailTxt;
	
	@FindBy(name="password")
	WebElement pwdTxt;
	
	@FindBy(xpath="//button//span[text()='Log In']")
	WebElement loginBtn2;
	
	@FindBy(xpath="//div[text()='Home']")
	WebElement homeMenu;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage homeinLogin() {
		
		loginBtn1.click();
		TestUtil.waitUntilVisible(5000, emailTxt);
		emailTxt.sendKeys("gswacustomer@yopmail.com");
		pwdTxt.sendKeys("Welcome123");
		loginBtn2.click();
		return new HomePage();
	}
	
	public boolean verifyLogin() {
		TestUtil.waitUntilVisible(5000, homeMenu);
		return homeMenu.isDisplayed();
		
		
	}
}
