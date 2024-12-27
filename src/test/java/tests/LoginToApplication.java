package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import testComponents.BaseTest;

public class LoginToApplication extends BaseTest{

	LoginPage loginPage;
	 HomePage homePage ;
	@Test(dataProvider = "getData" )
	public void login(HashMap<String, String> input) {
		 loginPage = new LoginPage(driver);
		  homePage = loginPage.applicationLogin(input.get("username"), input.get("password"));
		 WebElement hrmBanner = homePage.getHrmBanner();
		 hrmBanner.isDisplayed();
		 
	}
	
	@DataProvider
	public Object[] getData() throws IOException{
		List<HashMap<String, String>> data = readJasonData("./src/test/java/data/credentials.jason");
		return new Object[] {data.get(0)};
		
	}
}
