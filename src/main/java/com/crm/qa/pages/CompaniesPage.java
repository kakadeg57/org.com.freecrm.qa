package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class CompaniesPage extends TestBase {

	public CompaniesPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='btn_cs_search']")
	public WebElement display;
	
	}
