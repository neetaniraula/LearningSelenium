package com.orange.hrm.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orange.hrm.pages.LoginPage;
import com.utility.ExcelUtility;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginWithValidUserNameAndValidPassword() throws InvalidFormatException, IOException {
		
		LoginPage loginPage = new LoginPage();
		
		loginPage.loginToApplication(ExcelUtility.getTestData(1, 0),ExcelUtility.getTestData(1, 1));
	}

}
