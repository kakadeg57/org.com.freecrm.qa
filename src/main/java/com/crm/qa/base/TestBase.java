package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.aq.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public  void setUp() {
		try {
			prop =new Properties();
			FileInputStream file=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(file);
			}
			catch( FileNotFoundException  e)
			{
				e.printStackTrace();
			}
			catch(IOException  e)
			{
				e.printStackTrace();
			}
		String browsername=prop.getProperty("browser");
		try {
		 if(browsername.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				}
		 else if(browsername.equals("firefox")) {
			 System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
		 }
		 }
		
		 catch(Exception e) {
			 
			 System.out.println("problem in file");
			 e.printStackTrace();
		 }
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeOut, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitWait, TimeUnit.SECONDS);
		 
		 driver.get(prop.getProperty("url")); 
	}

}
