package stepDefination;

import static org.testng.Assert.assertEquals;

import java.time.LocalDateTime;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.RecruitmentPage;
import testComponents.BaseTest;

public class SterpdefinationImp extends BaseTest{

	LoginPage loginPage;
	HomePage homePage;
	RecruitmentPage recruitmentPage;
	String name;
	String candidateName;
	String deletedMessage;
	String year="";
	String date="";
	String month;
	@Given("Land on OrangeHrm Page")
	public void land_on_OrangeHrm_Page() {
		loginPage=navigateToApplication();
	}
	
	@Given("^Login to the application with username (.+) and password (.+)$")
	public void login_to_the_application_with_username_and_password(String username, String password) {
		homePage = loginPage.applicationLogin(username, password);
	}
	
	
		 
	
	
	@Then("verify the element is displayed in homePage")
	public void verify_the_element_is_displayed_in_homePage() {
		WebElement hrmBanner = homePage.getHrmBanner();
		 hrmBanner.isDisplayed();
	}
	@When("Add the user by entering the details")
	public void add_the_user_by_entering_the_details() {
		 homePage.addUserDetails("Sudas", "suda123", "Qwerty LName");
	
	}
	@Then("Successful popup is dispayed")
	public void successful_popup_is_dispayed() {
		WebElement successPopup = homePage.getsuccessPopup();
		 assertEquals(true, successPopup.isDisplayed());
	}
	
	@When("search the user added")
	public void search_the_user_added() {
		name = homePage.searchUser("Sudas", "Qwerty LName");
		 
	}
	@Then("^\"([^\"]*)\" is displayed on the Homepage")
	public void is_displayed_on_the_Homepage(String username) {
		//assertEquals(name, username);
		closeBrowser();
	}
	
	@When("Add Candidate by providing candidate details")
	public void add_Candidate_by_providing_candidate_details() {
	 
		 recruitmentPage= new RecruitmentPage(driver);
		 recruitmentPage.addCandidateDetails("Sudarshan", "S", "ss@gmail.com", "9900887575");
	}
	@When("Search the candidate added")
	public void search_the_candidate_added() {
		LocalDateTime ldt = LocalDateTime.now();
		month = ldt.getMonth().name();
		month=month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();
		int yr = ldt.getYear();
		year=year+yr;
		int dt = ldt.getDayOfMonth();
		date=date+dt;
		candidateName= recruitmentPage.searchCandidate(month, date, year);
		
	}
	@Then("^\"([^\"]*)\" is displayed on the RecruitmentPage")
	public void is_displayed_on_the_RecruitmentPage(String candidatename) {
		assertEquals(candidatename,candidateName );
		
	}
	@When("delete the added candidate")
	public void delete_the_added_candidate() {
		deletedMessage = recruitmentPage.deleteCandidate();
	}
	
	@Then("^\"([^\"]*)\" message is dispayed on Recruitment Page")
	public void message_is_dispayed_on_Recruitment_Page(String message) {
		assertEquals(deletedMessage, message);
	}
	
	@When("Add Vacancy by providing vacancy details")
	public void add_Vacancy_by_providing_vacancy_details() throws InterruptedException  {
		recruitmentPage= new RecruitmentPage(driver);
		recruitmentPage.addVacancyDetails("Testerr", "Automaton Tester");
	}
	
	@When("Search the Vacancy added")
	public void search_the_Vacancy_added() {
		 recruitmentPage.searchVacancy("Testerr", "Automaton Tester");
	}
	
	@Then("^\"([^\"]*)\" is displayed on the Vacancy RecruitmentPage")
	public void is_displayed_on_the_Vacancy_RecruitmentPage(String VacancyName) {
		deletedMessage = recruitmentPage.deleteVacancy("Testerr");
	}
	@When("delete the added Vacancy")
	public void delete_the_added_Vacancy() {
		
	}
}
