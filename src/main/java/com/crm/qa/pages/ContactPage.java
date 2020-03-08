package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase{
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='btn_cs_search']")
	
	public WebElement display;
	
	@FindBy(name="first_name")
	WebElement fname;
	@FindBy(name="surname")
	WebElement lname;
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement company;
	@FindBy(xpath="//input[@name='company_position']")
	WebElement position;
	@FindBy(xpath="//input[@name='department']")
	WebElement dept;
	@FindBy(xpath="//input[@name='mobile']")
	WebElement mobile;
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	@FindBy(xpath="//input[@name='address_title']")
	WebElement addt;
	@FindBy(xpath="//input[@name='address']")
	WebElement add;
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	@FindBy(xpath="//input[@name='postcode']")
	WebElement zip;
	@FindBy(xpath="//input[@name='country']")
	WebElement contry;
	@FindBy(xpath="//body/table/tbody/tr/td/table/tbody/tr/td/fieldset[@class='fieldset']/form[@id='contactForm']/table/tbody/tr/td/input[2]")
	WebElement saveBtn;
	
	public void createNewContact(String fn,String ln,String com,String pos,String dep,String mob, 
			String mail,String adt,String ad,String ct,String pin,String ind
			) {
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		company.sendKeys(com);
		position.sendKeys(pos);
		dept.sendKeys(dep);
		mobile.sendKeys(mob);
		email.sendKeys(mail);
		addt.sendKeys(adt);
		add.sendKeys(ad);
		city.sendKeys(ct);
		zip.sendKeys(pin);
		contry.sendKeys(ind);
		saveBtn.click();
	}
	public boolean validateCreateNewContactPage() {
		return display.isDisplayed();
	}
}
