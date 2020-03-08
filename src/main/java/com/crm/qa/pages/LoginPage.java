package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement CRMlogo;

	@FindBy(xpath="//input[@name='username']")
	WebElement userNameTextBox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	public boolean validateCRMLogo() {
		return CRMlogo.isDisplayed();
	}
	
	public String title() {
		return driver.getTitle();
	}
	
	public HomePage login(String un,String pwd) {
	userNameTextBox.sendKeys(un);
	passwordTextBox.sendKeys(pwd);
	loginBtn.click();
	return new HomePage();
	}
	public String homePageTitle() {
		return driver.getTitle();
	}
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
}
