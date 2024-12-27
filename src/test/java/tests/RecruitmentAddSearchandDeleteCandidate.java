package tests;


import static org.testng.Assert.assertEquals;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.RecruitmentPage;
import testComponents.BaseTest;

public class RecruitmentAddSearchandDeleteCandidate extends BaseTest{

	LoginPage loginPage;
	HomePage homePage;
	RecruitmentPage recruitmentPage;
	String year="";
	String date="";
	String month;
	
	@Test(dataProvider = "getData")
	public void addCadidateData(HashMap<String, String> data) {
		 loginPage = new LoginPage(driver);
		  homePage = loginPage.applicationLogin("Admin", "admin123");
		 WebElement hrmBanner = homePage.getHrmBanner();
		 hrmBanner.isDisplayed();
		 
		 recruitmentPage= new RecruitmentPage(driver);
		 recruitmentPage.addCandidateDetails(data.get("firstname"), data.get("lastname"), data.get("email"), data.get("number"));
	}
	@Test(dependsOnMethods = "addCadidateData")
	public void searchCadidateData() {
		LocalDateTime ldt = LocalDateTime.now();
		month = ldt.getMonth().name();
		month=month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();
		int yr = ldt.getYear();
		year=year+yr;
		int dt = ldt.getDayOfMonth();
		date=date+dt;
		recruitmentPage.searchCandidate(month, date, year);
		
	}
	
	@Test(dependsOnMethods = "searchCadidateData")
	public void deleteAddedCandidate() {
		String msg = recruitmentPage.deleteCandidate();
		assertEquals(msg, "Successfully Deleted");
		
	}
	
	@DataProvider
	public Object[] getData() throws Exception {
		List<HashMap<String, String>> data = readJasonData("./src/test/java/data/recruitmentCandidateDetails.jason");
		
		return new Object [] {data.get(0)};
	}
}
