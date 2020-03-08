package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class NewCompanyPage extends TestBase{
	public NewCompanyPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//legend[text()='Create New  Company']")
	public
	WebElement display;
	@FindBy(xpath="//input[@id='company_name']")
	WebElement company;

	@FindBy(xpath="//input[@name='industry']")
	WebElement industry;

	@FindBy(xpath="//input[@name='num_of_employees']")
	WebElement employee;

	@FindBy(xpath="//select[@name='status']")
	WebElement status;
	
	@FindBy(xpath="//input[@name='address_title']")
	WebElement addTitle;
	
	@FindBy(xpath="//textarea[@name='address']")
	WebElement address;
	
	@FindBy(xpath="//tr[8]//td[1]//input[1]")
	WebElement saveBtn;
	public boolean validateCompanyPage() {
		return display.isDisplayed();
	}
	
	public void createCompany(String comp,String ind,String emp,String statu,String addT,String add) {
		company.sendKeys(comp);
		industry.sendKeys(ind);
		employee.sendKeys(emp);
		Select sel=new Select(status);
		sel.selectByValue(statu);
		addTitle.sendKeys(addT);
		address.sendKeys(add);
		saveBtn.click();
	}


}
