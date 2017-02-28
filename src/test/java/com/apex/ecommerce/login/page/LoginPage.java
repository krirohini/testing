package com.apex.ecommerce.login.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.home.page.HomePage;
import com.apex.ecommerce.login.constant.LoginContant;

public class LoginPage implements LoginContant{
	
	WebDriver driver = null;
	
	// Define WebElements, initialize it and perform Action
	@FindBy(xpath = LoginContant.EMAIL_XPATH_LOCATOR)
	WebElement emailId;
	
	@FindBy(xpath = LoginContant.PASSWORD_XPATH_LOCATOR)
	WebElement password;
	
	@FindBy(xpath = LoginContant.LOGIN_BTN_LOCATOR)
	WebElement loginButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// Initialize the Page Element
		PageFactory.initElements(driver, this);
	}
	
	public void setEmailData(String userId){
		emailId.sendKeys(userId);
	}
	
	public void setPasswordData(String pwd){
		password.sendKeys(pwd);
	}
	
	public HomePage loginInToWebsite(String userId, String pwd){
		setEmailData(userId);
		setPasswordData(pwd);
		loginButton.click();
		return new HomePage(driver);
	}
}
