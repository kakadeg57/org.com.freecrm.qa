package com.crm.qa.testcases;

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
import com.crm.qa.pages.NewCompanyPage;

public class NewCompanyPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	TestUtil util;
	NewCompanyPage newcompanypage;
	
	@BeforeMethod
		public void initilization() {
		setUp();
		util=new TestUtil();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		util.switchToFrame();
		newcompanypage=homepage.clickOnNewCompany();
	}
	
	@Test(priority=0)
		public void newCompanyPageValidationTest(){
		Assert.assertTrue(newcompanypage.validateCompanyPage());
	}
	
	@DataProvider(name="companydata") 
	  public Object[][] getData() throws Exception{
	  Object [][] data=TestDataReader.getCompanyData(); 
	  return data; }
	  
	  @Test(priority=1, dataProvider="companydata") 
	  public void createNewCompanyValidation(String one,String two,String three,String four,String five,String six) {
		  newcompanypage.createCompany(one, two, three, four, five, six);
	  }  
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }
}
