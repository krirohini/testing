package com.apex.ecommerce.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.home.constant.HomePageConstants;
//import com.apex.ecommerce.login.page.LoginPage;
import com.apex.ecommerce.home.page.HomePage;
//
import com.apex.ecommerce.login.page.LoginPage;

public class LoginPageTest extends ApexBaseTest implements HomePageConstants{

	//@Test
	public void loginPageBlankCredentialTest() {
		
	}
	
	@Test
	public void loginPageSuccessTest() {
		
		// Create the Driver : No need; Already created the driver in ApexBaseTest class
		// Identify Elements : No need; Already identified in the LoginPage class which is implementing LoginConstan interface.
		// Set the Data : No need; Done in LoginPage class
		
		// Perform Click : will use the method of the LoginPage class as below....
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.loginInToWebsite("krirohini@gmail.com", "123456");
	
		// Assert : Is next page is Displayed or Not.
		Assert.assertEquals("You have Logged In successfully.", homePage.getSuccessMessage());
		
		// Close the Driver : No need; It is doing by the @AfterMethod in the ApexBaseTest class.
	}
	
}
