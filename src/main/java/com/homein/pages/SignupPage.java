package com.homein.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.homein.base.BaseTest;
import com.homein.util.TestUtil;

public class SignupPage extends BaseTest{

	@FindBy(xpath="//strong[text()='Sign up']")
	WebElement signupBtn;
	
	@FindBy(xpath="//span[text()='Create your Home-in account']")
	WebElement signupPageText;
	
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getSignupPageText() {
		signupBtn.click();
		
		TestUtil.switchFrames();
		
		TestUtil.waitUntilVisible(5000, signupPageText);
		
		return signupPageText.getText();
	}
}
