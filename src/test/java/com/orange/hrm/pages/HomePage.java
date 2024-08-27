package com.orange.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;

public class HomePage {

	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminlink;

	@FindBy(xpath = "//img[@alt=\"profile picture\"]")
	WebElement profilePicture;

	@FindBy(linkText = "Logout")
	WebElement logoutLink;

	public HomePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void clickOnAdminLink() {
		adminlink.click();

	}

	public void logoutFromApplication() {
		profilePicture.click();
		logoutLink.click();
	}

}
