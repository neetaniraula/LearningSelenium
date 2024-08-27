package com.orange.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;

public class LoginPage {

		// username
		@FindBy(name = "username")
		WebElement userNameTextBox;

		// password
		@FindBy(name = "password")
		WebElement passwordTextBox;

		// login button
		@FindBy(xpath = "//button[@type=\"submit\"]")
		WebElement loginBTn;
		
		public LoginPage() {
			PageFactory.initElements(BaseTest.driver, this);
		}
		
				public void loginToApplication(String userName , String password) {
			userNameTextBox.sendKeys(userName);
			passwordTextBox.sendKeys(password);
			loginBTn.click();
			
		
	}

}
	