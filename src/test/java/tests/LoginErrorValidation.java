package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import testComponents.BaseTest;

public class LoginErrorValidation extends BaseTest{

	LoginPage loginPage;
	String message="Invalid credentials";
	@Test
	public void errorMsgCheck() {
		 loginPage = new LoginPage(driver);
		 loginPage.applicationLogin("Admin", "password");
		String errorMsg = loginPage.errorMessage();
		Assert.assertEquals(errorMsg, message);
	}
}
