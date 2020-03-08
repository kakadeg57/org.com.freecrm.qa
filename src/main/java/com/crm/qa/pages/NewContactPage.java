package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class NewContactPage extends TestBase{
	public NewContactPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//legend[text()='Contact Information']")
	
	public WebElement display;
}
