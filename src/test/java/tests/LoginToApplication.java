package tests;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import testComponents.BaseTest;

public class LoginToApplication extends BaseTest{

	LoginPage loginPage;
	@Test
	public void login() {
		navigateToApplication();
		 loginPage = new LoginPage(driver);
		 loginPage.applicationLogin("Admin", "admin123");
	}
}
