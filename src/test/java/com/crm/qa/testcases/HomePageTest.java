package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.aq.util.TestUtil;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CalendarPage;
import com.crm.qa.pages.CompaniesPage;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.NewCompanyPage;
import com.crm.qa.pages.NewContactPage;
import com.crm.qa.pages.NewDealPage;
import com.crm.qa.pages.NewEventPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homepage;
	TestUtil util;
	CalendarPage calendarpage;
	NewEventPage neweventpage;
	CompaniesPage companypage;
	NewCompanyPage newcompanypage;
	ContactPage contactpage;
	NewContactPage newcontactpage;
	DealsPage dealpage;
	NewDealPage newdealpage;
	@BeforeMethod
	public void initilization() {
		setUp();
		util=new TestUtil();
		loginPage=new LoginPage();
		calendarpage=new CalendarPage();
		neweventpage=new NewEventPage();
		 companypage=new CompaniesPage();
		 newcompanypage=new NewCompanyPage();
		 contactpage=new ContactPage();
		 newcontactpage=new NewContactPage();
		 dealpage = new DealsPage();
		 newdealpage = new NewDealPage();
		homepage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=0)
	public void validateHomePageTitle() {
		Assert.assertEquals(homepage.homePageTitle(), "CRMPRO");
	}
	@Test(priority=1)
	public void verifyUserNameDisplay() {
		util.switchToFrame();
		Assert.assertTrue(homepage.userNameTest(), "username is not matched");
		}
	@Test(priority=2)
	public void verifyCalendarLink() {
		util.switchToFrame();
		homepage.clickOnCalendar();
		Assert.assertTrue(calendarpage.calendarbtn.isDisplayed(), "button not display");
	}
	@Test(priority=3)
	public void verifyNewEventLink() {
		util.switchToFrame();
		homepage.clickOnNewEvent();
		Assert.assertTrue(neweventpage.eventinformation.isDisplayed());
	}
	@Test(priority=4)
	public void verifyCompaniesLink() {
	util.switchToFrame();
	homepage.clickOnCompany();
	Assert.assertTrue(companypage.display.isDisplayed());
	}
	@Test(priority=5)
	public void verifyNewCompanyLink() {
	util.switchToFrame();
	homepage.clickOnNewCompany();
	Assert.assertTrue(newcompanypage.display.isDisplayed());
	}
	
	@Test(priority=6)
	public void verifyContactsLink() {
	util.switchToFrame();
	homepage.clickOnContact();
	Assert.assertTrue(contactpage.display.isDisplayed());
	}
	@Test(priority=7)
	public void verifyNewContactLink() {
		util.switchToFrame();
		homepage.clickOnNewContact();
		Assert.assertTrue(newcontactpage.display.isDisplayed());
	}
	@Test(priority=8)
	public void verifyDealsLink() {
		util.switchToFrame();
		homepage.clickOnDeal();
		Assert.assertTrue(dealpage.display.isDisplayed());

	}
	@Test(priority=9)
	public void verifyNewDealLink() {
		util.switchToFrame();
		homepage.clickOnNewDeal();
		Assert.assertTrue(newdealpage.display.isDisplayed());

	}
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
}
