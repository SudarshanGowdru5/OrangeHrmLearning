package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstructComponents.AbstructComponents;

public class RecruitmentPage extends AbstructComponents{

	WebDriver driver;
	String hiringManagerName;
	public RecruitmentPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Recruitment']")
	WebElement recruitmentTab;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addBtn;
	
	@FindBy(name = "firstName")
	WebElement firstNameField;
	
	@FindBy(name = "lastName")
	WebElement lastNameField;
	
	@FindBy(xpath = "//label[text()='Email']/parent::div/following-sibling::div/child::input")
	WebElement emailField;
	
	@FindBy(xpath = "//label[text()='Contact Number']/parent::div/following-sibling::div/child::input")
	WebElement contactNumberField;
	
	@FindBy(xpath = "//label[text()='Notes']/parent::div/following-sibling::div/child::textarea")
	WebElement notesField;
	
	@FindBy(className  ="oxd-file-input")
	WebElement resumeUploadBtn;
	
	@FindBy(xpath = "//label[text()='Consent to keep data']/parent::div/following-sibling::div/child::div/child::label/child::input")
	WebElement consentToKeepDataRadioBtn;
	
	@FindBy(css = ".oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
	WebElement saveBtn;
	
	@FindBy(xpath ="//label[contains(text(),'Hiring Manager')]/parent::div/following-sibling::div/child::p")
	WebElement hiringManager;


	@FindBy(xpath = "//label[text()='Job Title']/parent::div/following-sibling::div/child::div/child::div")
	WebElement jobTitleDropdown;
	
	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/child::div/child::span")
	List<WebElement> jobTitleOptions;
	
	
	@FindBy(xpath = "//span[text()='Automaton Tester']")
	WebElement automationTesterJobTitleOption;
	
	@FindBy(xpath = "//label[text()='Vacancy']/parent::div/following-sibling::div/child::div/child::div")
	WebElement vacancyDropdown;
	
	@FindBy(xpath = "//span[text()='test']")
	WebElement testVacancyOption;
	
	@FindBy(xpath = "//label[text()='Hiring Manager']/parent::div/following-sibling::div/child::div/child::div")
	WebElement hiringManagerDropdown;
	
	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/child::div/child::span")
	List<WebElement> hiringManagerNames;
	
	@FindBy(xpath = "//label[text()='Status']/parent::div/following-sibling::div/child::div/child::div")
	WebElement statusDropdown;
	
	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/child::div/child::span")
	List<WebElement> statusOptions;
	
	@FindBy(xpath = "//label[text()='Candidate Name']/parent::div/following-sibling::div/descendant::input")
	WebElement cadidateNameField;
	
	@FindBy(xpath = "//div[@class='oxd-autocomplete-option']/child::span")
	List<WebElement> candidateNameOptions;
	
	@FindBy(xpath = "//label[text()='Keywords']/parent::div/following-sibling::div/child::input")
	WebElement keywordsField;
	
	@FindBy(xpath="//input[@placeholder='From']")
	WebElement calanderFromDate;
	
	@FindBy(xpath="//div[text()='Today']")
	WebElement todayDate;
	
	@FindBy(xpath="//div[@class='oxd-calendar-selector-month-selected']")
	WebElement monthDropdown;
	
	@FindBy(xpath="//div[@class='oxd-calendar-selector-month-selected']/following-sibling::ul/child::li")
	List<WebElement> months;
	
	@FindBy(xpath = "//li[@class='oxd-calendar-selector-year']")
	WebElement yearDropdown;
	
	@FindBy(xpath="//li[@class='--active oxd-calendar-selector-year']/child::ul/child::li")
	List<WebElement> years;
	
	@FindBy(xpath = "//div[contains(@class,'oxd-calendar-date-wrapper')]/child::div")
	List<WebElement> dates;
	
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement calanderToDate;
	
	@FindBy(xpath = "//div[text()='Close']")
	WebElement clanderCLoseBtn;
	
	@FindBy(xpath="//label[text()='Method of Application']/parent::div/following-sibling::div/child::div/child::div")
	WebElement methodOfApplicationDropdown;
	
	@FindBy(css=".oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
	WebElement searchBtn;
	
	@FindBy(xpath = "//div[@class='oxd-table-cell oxd-padding-cell']/child::div")
	List<WebElement> recordCandidateDetails;
	
	@FindBy(xpath = "//div[contains(text(),'Sudarshan')]/parent::div/following::div[@class='oxd-table-cell-actions']/descendant::i[@class='oxd-icon bi-trash']")
	WebElement candidateDeleteBtn;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	WebElement yesDeleteBtn;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
	WebElement successfullyDeletedMsg;
	
	//VACANCY ELEMENTS
	
	@FindBy(xpath = "//a[text()='Vacancies']")
	WebElement vacancyTab;
	
	@FindBy(xpath = "//label[text()='Vacancy Name']/parent::div/following-sibling::div/child::input")
	WebElement vacancyNameField;
	
	@FindBy(xpath = "//label[text()='Job Title']/parent::div/following-sibling::div/child::div/child::div")
	WebElement vacancyJobTitleDropdown;
	
	@FindBy(xpath = "//div[@class='oxd-select-option']/child::span")
	List<WebElement> vacancyJobTitleOptions;
	
	@FindBy(xpath = "//label[text()='Description']/parent::div/following::textarea")
	WebElement vacancyDescriptionField;
	
	@FindBy(xpath = "//label[text()='Hiring Manager']/parent::div/following-sibling::div/descendant::input")
	WebElement vacancyHiringManagerField;
	
	@FindBy(xpath="//div[@class='oxd-autocomplete-dropdown --positon-bottom']/descendant::span")
	List<WebElement> vacancyHiringManagerOptions;
	
	@FindBy(xpath = "//label[text()='Number of Positions']/parent::div/following-sibling::div/child::input")
	WebElement vacancyNosPositions;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement vacancySaveBtn;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
	WebElement vacancySuccessfullySaveMsg;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	WebElement vacancyCancelBtn;
	
	@FindBy(xpath = "//label[text()='Vacancy']/parent::div/following-sibling::div/child::div/child::div")
	WebElement vacancydropdown;
	
	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/descendant::span")
	List<WebElement> dropdownOptions;
	
	@FindBy(xpath = "//label[text()='Hiring Manager']/parent::div/following-sibling::div/child::div/child::div")
	WebElement vacancyHiringManagerdropdown;
	
	@FindBy(xpath = "//label[text()='Status']/parent::div/following-sibling::div/child::div/child::div")
	WebElement vacancyStatusdropdown;
	
	@FindBy(css=".oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
	WebElement vacancySearchBtn;
	
//	@FindBy(xpath = "//div[contains(text(),'tester')]/parent::div/following::div[@class='oxd-table-cell-actions']/descendant::i[@class='oxd-icon bi-trash']")
//	WebElement vacancyDeteleBtn;
	
	
	
	
	
	public void addCandidateDetails(String firstName,String lastName,String email,String number ) {
		recruitmentTab.click();
		addBtn.click();
		firstNameField.sendKeys(firstName);
		lastNameField.sendKeys(lastName);
		vacancyDropdown.click();
		waitforwebelementTOappear(testVacancyOption);
		testVacancyOption.click();
		emailField.sendKeys(email);
		contactNumberField.sendKeys(number);
		resumeUploadBtn.sendKeys("C:\\Users\\SS098338\\git\\OrangeHrmLearning\\src\\test\\java\\data\\testResume.docx");
		keywordsField.sendKeys("ATester");
		notesField.sendKeys("hello jello");
		//waitforwebelementToBeClickable(consentToKeepDataRadioBtn);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", consentToKeepDataRadioBtn);
		//consentToKeepDataRadioBtn.click();
		saveBtn.click();
		waitforwebelementTOappear(hiringManager);
		hiringManagerName = hiringManager.getText();
		
		
		
	}
	
	public String searchCandidate(String month, String date, String year) {
		recruitmentTab.click();
		//jobTitleDropdown.click();
		//selectOptionFromAutoselectDropdown(jobTitleOptions, "Automaton Tester");
		vacancyDropdown.click();
		waitforwebelementTOappear(testVacancyOption);
		testVacancyOption.click();
		hiringManagerDropdown.click();
		selectOptionFromAutoselectDropdown(hiringManagerNames, hiringManagerName );
		statusDropdown.click();
		selectOptionFromAutoselectDropdown(statusOptions, "Application Initiated");
		cadidateNameField.sendKeys("Sudarshan");
		String candidateName = selectOptionFromAutoselectDropdown(candidateNameOptions, "Sudarshan");
		keywordsField.sendKeys("ATester");
		calanderFromDate.click();
		selectCalanderDate(monthDropdown,yearDropdown,months, years, dates, month, date, year);
//		calanderToDate.click();
//		selectCalanderDate(months, years, dates, month, date, year);
		waitforwebelementToBeClickable(searchBtn);
		waitforwebelementToBeDisappear(clanderCLoseBtn);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", searchBtn);
		//searchBtn.click();
		String name = selectOptionFromAutoselectDropdown(recordCandidateDetails, candidateName);
		return name;
		
	}
	public String deleteCandidate() {
		waitforwebelementToBeClickable(candidateDeleteBtn);
		candidateDeleteBtn.click();
		waitforwebelementTOappear(yesDeleteBtn);
		waitforwebelementToBeClickable(yesDeleteBtn);
		yesDeleteBtn.click();
		waitforwebelementTOappear(successfullyDeletedMsg);
		
		
		return successfullyDeletedMsg.getText();
	}
	
	public void addVacancyDetails(String vacancyName, String vacancyJobTitle ) throws InterruptedException {
		recruitmentTab.click();
		vacancyTab.click();
		addBtn.click();
		vacancyNameField.sendKeys(vacancyName);
		vacancyJobTitleDropdown.click();
		selectOptionFromAutoselectDropdown(vacancyJobTitleOptions, vacancyJobTitle);
		vacancyDescriptionField.sendKeys("Automation tester");
		vacancyHiringManagerField.sendKeys("Rahul");
		selectOptionFromAutoselectDropdown(vacancyHiringManagerOptions, "Rahul");
		vacancyNosPositions.sendKeys("3");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//vacancySaveBtn.click();
		js.executeScript("arguments[0].click();", vacancySaveBtn);
		//Thread.sleep(2000);
//		waitforwebelementTOappear(vacancySuccessfullySaveMsg);
//		vacancySuccessfullySaveMsg.isDisplayed();
//		waitforwebelementToBeDisappear(vacancySuccessfullySaveMsg);
//		waitforwebelementTOappear(vacancyCancelBtn);
//		js.executeScript("arguments[0].click();", vacancyCancelBtn);
//		waitforwebelementToBeClickable(vacancyTab);
		vacancyTab.click();
	}
	
	public String searchVacancy(String vacancyName, String vacancyJobTitle ) {
		vacancyJobTitleDropdown.click();
		selectOptionFromAutoselectDropdown(vacancyJobTitleOptions, vacancyJobTitle);
		vacancydropdown.click();
		selectOptionFromAutoselectDropdown(dropdownOptions, vacancyName);
		vacancyHiringManagerdropdown.click();
		selectOptionFromAutoselectDropdown(dropdownOptions, "Rahul");
		vacancyStatusdropdown.click();
		selectOptionFromAutoselectDropdown(dropdownOptions, "Active");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", vacancySearchBtn);
		String name = selectOptionFromAutoselectDropdown(recordCandidateDetails, vacancyName);
		return name;
		
	}
	
	public String deleteVacancy(String vacancyName) {
		WebElement vacancyDeteleBtn = driver.findElement(By.xpath("//div[contains(text(),'"+vacancyName+"')]/parent::div/following::div[@class='oxd-table-cell-actions']/descendant::i[@class='oxd-icon bi-trash']"));
		waitforwebelementToBeClickable(vacancyDeteleBtn);
		vacancyDeteleBtn.click();
		waitforwebelementTOappear(yesDeleteBtn);
		waitforwebelementToBeClickable(yesDeleteBtn);
		yesDeleteBtn.click();
		waitforwebelementTOappear(successfullyDeletedMsg);
		
		
		return successfullyDeletedMsg.getText();
	}
	
	
	
	
}
