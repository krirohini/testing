package com.apex.ecommerce.core;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class ApexBaseTest {
	protected WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		// Create The Driver
		driver = new FirefoxDriver();

		// Open The Url
		driver.get("http://saipratap.net/ecommerce/customerlogin.php");

	}

	@AfterMethod
	public void afterMethod() {
		// close the driver
		driver.close();
	}

}
