package com.crm.aq.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
	
public static int PageLoadTimeOut=30;
public static int ImplicitWait=20;

public void switchToFrame() {
	driver.switchTo().frame("mainpanel");
}
}
