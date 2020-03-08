package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	Actions act=new Actions(driver);
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	// main menu elements
	@FindBy(xpath="//td[contains(text(),'User: Janardhan Karagir')]")
	@CacheLookup
	WebElement userName;
	@FindBy(xpath="//ul[@class='mlddm']/li/descendant::a[@href=\"https://classic.freecrm.com/system/index.cfm?action=calendar&sub=default\"]")
	@CacheLookup
	WebElement calendar;
	@FindBy(xpath="//ul[@class='mlddm']//li/descendant::a[contains(text(),'Companies')]")
	@CacheLookup
	WebElement companies;
	
	@FindBy(xpath="//ul[@class='mlddm']/li/descendant::a[@title='Contacts']")
	@CacheLookup
	WebElement contacts;
	@FindBy(xpath="//ul[@class='mlddm']/li/descendant::a[@title='Deals']")
	@CacheLookup
	WebElement deal;
	@FindBy(xpath="")
	@CacheLookup
	WebElement task;
	
	//sub menu elements
	@FindBy(xpath="//a[text()='New Event']")
	WebElement newevent;
	@FindBy(xpath="//a[contains(text(),'New Company')]")
	WebElement newcompany;
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newcontact;
	@FindBy(xpath="//a[text()='New Deal']")
	WebElement newdeal;
	@FindBy(xpath="")
	WebElement newtask;

	//Action method
	public String homePageTitle() {
		return driver.getTitle();
	}
	
	public boolean userNameTest() {
		return userName.isDisplayed();
	}
	
	//move on main menu action
	public void moveOnCalender() {
		act.moveToElement(calendar).build().perform();	
	}
	public void moveOnCompanies() {
		act.moveToElement(companies).build().perform();
	}
	public void moveOnContacts() {
		act.moveToElement(contacts).build().perform();	
	}
	public void moveOnDeals() {
		act.moveToElement(deal).build().perform();
	}
	public void moveOnTasks() {
		act.moveToElement(task).build().perform();
	}
	
	//click on Main menu action
	public void clickOnCalendar() {
		calendar.click();
	}
	public void clickOnCompany() {
		companies.click();
	}
	public void clickOnContact() {
		contacts.click();
	}
	public void clickOnDeal() {
		deal.click();
	}
	public void clickOnTasks() {
		task.click();
	}
	
	//click on submenu action
	public NewEventPage clickOnNewEvent() {
	 moveOnCalender();
	 newevent.click();
	 return new NewEventPage();
	}
	public NewCompanyPage clickOnNewCompany() {
	 moveOnCompanies();
	 newcompany.click();
	 return new NewCompanyPage();
	}
	public ContactPage clickOnNewContact() {
	 moveOnContacts();
	 newcontact.click();
	 return new ContactPage();
	}
	public void clickOnNewDeal() {
	 moveOnDeals();	
	 newdeal.click();
	}
	public void clickOnNewTasks() {
	 moveOnTasks();
	 newtask.click();
	}

}
