package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.HomePage;
import pageObject.LoginPage;
import testComponents.BaseTest;

public class Adduser extends BaseTest{

	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	public void addUser() {
		 loginPage = new LoginPage(driver);
		  homePage = loginPage.applicationLogin("Admin", "admin123");
		 WebElement hrmBanner = homePage.getHrmBanner();
		 hrmBanner.isDisplayed();
		 
		 homePage.addUserDetails("Sudas", "suda123", "Qwerty LName");
		 WebElement successPopup = homePage.getsuccessPopup();
		 assertEquals(true, successPopup.isDisplayed());
		 
		 String name = homePage.searchUser("Sudas", "Qwerty LName");
		 System.out.println(name);
	}
}
