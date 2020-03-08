package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class NewEventPage extends TestBase{
	
	public NewEventPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//legend[@class='fieldset' and contains(text(),'Event Information')]")
	public
	WebElement eventinformation;

	@FindBy(xpath="//input[@name='title']")
	@CacheLookup
	WebElement title;
	@FindBy(xpath="//select[@name='category']")
	@CacheLookup
	WebElement category;
	@FindBy(xpath="//input[@name='confirmed']")
	@CacheLookup
	WebElement radioBtn;
	@FindBy(xpath="//input[@name='contact_lookup']")
	@CacheLookup
	WebElement contact;
	@FindBy(xpath="//input[@name='client_lookup']")
	@CacheLookup
	WebElement company;
	@FindBy(xpath="//textarea[@name='location']")
	@CacheLookup
	WebElement location;
	@FindBy(xpath="//tr[21]//td[2]//input[1]")
	@CacheLookup
	WebElement saveBtn;
	
	
	public Boolean verifyNewEventPage() {
		return eventinformation.isDisplayed();
	}
	public void createEvent(String tit,String cate,String cont,String comp,String loca) {
		title.sendKeys(tit);		
		Select sel=new Select(category);
		sel.selectByValue(cate);
		radioBtn.click();
		contact.sendKeys(cont);
		company.sendKeys(comp);
		location.sendKeys(loca);
		saveBtn.click();
	}
}
