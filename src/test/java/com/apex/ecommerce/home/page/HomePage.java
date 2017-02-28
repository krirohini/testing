package com.apex.ecommerce.home.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.home.constant.HomePageConstants;

public class HomePage {

	@FindBy(xpath = HomePageConstants.SUCCESS_MESSAGE_XPATH)
	WebElement loginSuccessMessage;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getSuccessMessage() {
		return loginSuccessMessage.getText();
	}
	
	
}
