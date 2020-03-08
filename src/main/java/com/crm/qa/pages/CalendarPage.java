package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CalendarPage extends TestBase {

	public CalendarPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@value=\"<= Show Calendar for Selected User\"]")
	public WebElement calendarbtn;
	@FindBy(xpath="//legend[@class='fieldset' and contains(text(),'Event Information')]")
	public WebElement eventinformation;
}
