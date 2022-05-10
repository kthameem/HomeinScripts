package com.homein.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.homein.base.BaseTest;
import com.homein.util.TestUtil;

public class HomePage extends BaseTest {
	
	LoginPage loginPage;

	@FindBy(xpath="//div[text()='Home']")
	WebElement homeMenu;
	
	@FindBy(xpath="//div[text()='Guidance']")
	WebElement guidanceMenu;
	
	@FindBy(xpath="//div[text()='Profile']")
	WebElement profileMenu;
	
	@FindBy(xpath="//div[text()='Log off']")
	WebElement logoffMenu;
	
	@FindBy(xpath="//div[@class='header']/h1[text()='Activity']")
	WebElement activityTab;
	
	@FindBy(xpath="//div[@class='header']/h1[text()='Team']")
	WebElement teamTab;
	
	@FindBy(xpath="//div[@class='header']/h1[text()='Documents']")
	WebElement documentsTab;
	
	@FindBy(xpath="//div[text()='Get Support']")
	WebElement guidancePageTitle;
	
	@FindBy(xpath="//div[text()='Profile']")
	WebElement profilePageTitle;
	
	//Home - Activity Page Elements
	
	@FindBy(xpath="//span//a[text()='+ Add a property']")
	WebElement addPropertyLink;
	
	@FindBy(xpath="//input[@id='8ef90688']")
	WebElement propertyAddInput;
	
	@FindBy(xpath="//span[text()='30 Esplanade , Hopetoun WA 6348']")
	WebElement propertyAddOption;
	
	@FindBy(name="$PNewProperty$pPropertyDetails$pSaleType")
	WebElement saleTypeDn;
	
	@FindBy(name="AddToChecklistBtn_NewProperty_11")
	WebElement getStartedBtn;
	
	@FindBy(name="MileStone1_pyWorkPage_8")
	WebElement goToChecklistBtn;
	
	@FindBy(xpath="//span[text()='Archive']")
	WebElement archiveOption;
	
	@FindBy(name="DisplayArchiveDetails_D_MyPropertyList_pa1664014911450787pz.pxResults(1)_20")
	WebElement archiveBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		loginPage = new LoginPage();
	}
	
	public void goToActivity () {
		activityTab.click();
	}
	
	public void goToTeam() {
		teamTab.click();
	}
	
	public void gotoDocuments() {
		documentsTab.click();
	}
	
	public void goToHome() {
		homeMenu.click();
		}

	public void goToGuidance() {
		//TestUtil.waitUntilVisible(5000, guidanceMenu);
		TestUtil.waitUntilClickable(5000, guidanceMenu);
		guidanceMenu.click();
	}
	
	public void goToProfile() {
		profileMenu.click();
	}
	
	public void goToLogoff() {
		driver.switchTo().window(MainWindow);
		TestUtil.waitUntilVisible(5000, logoffMenu);
		logoffMenu.click();
	}
	
	public String getGuidancePageTitle() {
		TestUtil.waitUntilVisible(10000, guidancePageTitle);
		return guidancePageTitle.getText();
	}
	
	public String getProfilePageTitle() {
		TestUtil.waitUntilVisible(10000, profilePageTitle);
		return profilePageTitle.getText();
	}
	
	public boolean getLogoffStatus() {
		TestUtil.waitUntilVisible(5000, loginPage.loginBtn2);
		return loginPage.loginBtn2.isDisplayed();
	}
	
	public WebElement getHomeIcon() {
		System.out.println(driver.findElements(By.name("ChecklistAddressBar_pyWorkPage_1")).size());
		return driver.findElements(By.name("ChecklistAddressBar_pyWorkPage_1")).get(0);
	}
	
	public WebElement getMoreOptions() {
		return driver.findElements(By.xpath("//img[@alt='More options' and @role='link']")).get(3);
	}
	
	public void addProperty() throws InterruptedException {
		
		//TestUtil.waitUntilVisible(5000, addPropertyLink);
		
		Thread.sleep(10000);
		TestUtil.switchFrames();
		addPropertyLink.click();
		
		Thread.sleep(10000);
		TestUtil.switchFrames();
		
		propertyAddInput.sendKeys("30 Esplanade , Hopetoun WA 6348");
		
		Thread.sleep(5000);
		
		propertyAddOption.click();
		
		Select sale = new Select(saleTypeDn);
		sale.selectByVisibleText("Private Treaty");
		
		getStartedBtn.click();
		
		Thread.sleep(5000);
		TestUtil.switchFrames();
		
		goToChecklistBtn.click();
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		guidanceMenu.click();
		
		Thread.sleep(5000);
		homeMenu.click();
		
		//getHomeIcon().click();
		
		//Thread.sleep(5000);
		//TestUtil.switchFrames();
		
		//getMoreOptions().click();
		
		//archiveOption.click();
		
		//archiveBtn.click();
		
	}
	
}
