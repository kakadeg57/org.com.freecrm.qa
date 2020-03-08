package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	@BeforeMethod
	public void initializtion() {
		setUp();
		loginpage=new LoginPage();
	}
	@Test(priority=0)
	public void pageTitleTest() {
	
		String title=loginpage.title();
		System.out.println(title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}

	@Test(priority=1)
	public void loginPageCRMLogoTest() {
		boolean flag=loginpage.validateCRMLogo();
		Assert.assertTrue(flag);
	}
			
	
	  @Test(priority=2) public void loginTest() {
	  homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	  String title=homepage.homePageTitle();
	  Assert.assertEquals(title, "CRMPRO");
	  }
	 	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
