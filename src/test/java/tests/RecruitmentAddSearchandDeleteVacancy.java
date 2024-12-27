package tests;

import static org.testng.Assert.assertEquals;


import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.RecruitmentPage;
import testComponents.BaseTest;

public class RecruitmentAddSearchandDeleteVacancy extends BaseTest{

	LoginPage loginPage;
	HomePage homePage;
	RecruitmentPage recruitmentPage;
	
	@Test(dataProvider = "getData")
	public void addVacancyData(HashMap<String, String> data) throws InterruptedException {
		 loginPage = new LoginPage(driver);
		  homePage = loginPage.applicationLogin("Admin", "admin123");
		 WebElement hrmBanner = homePage.getHrmBanner();
		 hrmBanner.isDisplayed();
		 
		 recruitmentPage= new RecruitmentPage(driver);
		 recruitmentPage.addVacancyDetails("Testerr", "Automaton Tester");
		 
	}
	@Test(dependsOnMethods = "addVacancyData")
	public void searchVacancyData() {
		 recruitmentPage.searchVacancy("Testerr", "Automaton Tester");
		
	}
	
	@Test(dependsOnMethods = "searchVacancyData")
	public void deleteAddedVacancy() {
		String msg = recruitmentPage.deleteVacancy("Testerr");
		assertEquals(msg, "Successfully Deleted");
		
	}
	@DataProvider
	public Object[] getData() throws Exception {
		List<HashMap<String, String>> data = readJasonData("./src/test/java/data/recruitmentCandidateDetails.jason");
		
		return new Object [] {data.get(0)};
	}
	
}
