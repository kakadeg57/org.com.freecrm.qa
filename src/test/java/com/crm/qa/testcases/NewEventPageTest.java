package com.crm.qa.testcases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.aq.testdata.TestDataReader;
import com.crm.aq.util.TestUtil;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.NewEventPage;

public class NewEventPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homePage;
	NewEventPage neweventpage;
	TestUtil util;
	@BeforeMethod
	public void initilization() {
		setUp();
		util=new TestUtil();
		loginpage=new LoginPage();
		homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		util.switchToFrame();
		neweventpage=homePage.clickOnNewEvent();
	}
	
	
	
		@Test(priority=0)
		public void verifyNewEventPage() {
		Assert.assertTrue(neweventpage.verifyNewEventPage()); 
	  	}
	
	  @DataProvider(name="eventdata") 
	  public Object[][] getData() throws Exception{
	  Object [][] data=TestDataReader.getEventData(); 
	  return data; }
	  
	  @Test(priority=1, dataProvider="eventdata") 
	  public void createNewEventValidation(String
	  one,String two,String three,String four,String five) {
	  neweventpage.createEvent(one, two, three, four, five); }
	  
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }
}
