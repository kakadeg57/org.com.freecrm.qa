package com.crm.aq.util;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonOTPhandle {
	
	public static final String acc_SID="AC44f72dc4827cede3d5b82edab88d23e1";
	public static final String auth_token="bcbd7210f02ec179fc5a259513f9ab23";

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[@id='nav-tools']/descendant::a/span[@class='nav-line-2 ' and text()='Account & Lists']")).click();
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("gkautomation");
		Select sel=new Select(driver.findElement(By.xpath("//select[@name='countryCode']")));
		sel.deselectByVisibleText("US +1");
	}

}
