package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.aq.testdata.TestDataReader;
import com.crm.aq.util.TestUtil;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class NewContactPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	TestUtil util;
	ContactPage contactpage;
	
	@BeforeMethod
		public void initilization() {
		setUp();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		util=new TestUtil();
		util.switchToFrame();
		contactpage=homepage.clickOnNewContact();
	}
	
	/*
	 * @Test(priority=0) public void validateCreateNewContactPage(){
	 * Assert.assertTrue(contactpage.validateCreateNewContactPage()); }
	 */	
	@DataProvider(name="contactdata") 
	  public Object[][] getData() throws Exception{
	  Object [][] data=TestDataReader.getContactData(); 
	  return data; }
	  
	  @Test(priority=1, dataProvider="contactdata") 
	  public void createNewContactValidation(String one,String two,String three,String four,String five,String six, String seven,String eight,String nine,String ten,String eleven,String twelve) {
		  contactpage.createNewContact(one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve);
	  }  
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }

}
