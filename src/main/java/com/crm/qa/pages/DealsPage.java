package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class DealsPage extends TestBase{
	public DealsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='btn_cs_search']")
	
	public WebElement display;
}
