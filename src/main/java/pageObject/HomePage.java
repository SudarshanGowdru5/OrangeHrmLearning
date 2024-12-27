package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstructComponents.AbstructComponents;


public class HomePage extends AbstructComponents{

	WebDriver driver;	

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminTab;
	
	@FindBy(xpath ="//img[@alt='client brand banner']")
	WebElement hrmBanner;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addBtn;
	
	@FindBy(xpath="//label[contains(text(),'User Role')]/parent::div/following-sibling::div")
	WebElement userRoleDropdown;
	
	@FindBy(xpath="//div[@class='oxd-select-dropdown --positon-bottom']/child::div/child::span[text()='Admin']")
	WebElement adminOption;
	
	@FindBy(xpath="//label[contains(text(),'Status')]/parent::div/following-sibling::div")
	WebElement StatusDropdown;
	
	@FindBy(xpath="//span[text()='Enabled']")
	WebElement enabledStatus;
	
	@FindBy(xpath="//label[text()='Password']/parent::div/following-sibling::div/child::input")
	WebElement passwordField;
	
	@FindBy(xpath="//div[@class=\"oxd-autocomplete-text-input--before\"]/following-sibling::input")
	WebElement employeeNameField;
	
	@FindBy(xpath="//div[@class=\"oxd-autocomplete-option\"]/child::span")
	List<WebElement> employeeNames;
	
	@FindBy(xpath="//label[text()='Username']/parent::div/following-sibling::div/child::input")
	WebElement usernameField;
	
	@FindBy(xpath="//label[contains(text(),'Confirm Password')]/parent::div/following-sibling::div/child::input")
	WebElement confirmPasswordField;
	
	@FindBy(css=".oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
	WebElement saveBtn;
	
	@FindBy(xpath="//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']/child::div/child::div[@class='oxd-toast-icon-container']")
	WebElement successPopup;
	
	@FindBy(css=".oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
	WebElement searchBtn;
	
	@FindBy(xpath="//div[@class='oxd-table-cell oxd-padding-cell']/child::div")
	List<WebElement> userNames;
	
	public WebElement getHrmBanner() {
		return hrmBanner;
	}
	
	public void addUserDetails(String username, String pwd, String EmployeeName) {
		adminTab.click();
		addBtn.click();
		userRoleDropdown.click();
		waitforwebelementTOappear(adminOption);
		adminOption.click();
		//userRoleDropdown.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		StatusDropdown.click();
		waitforwebelementTOappear(enabledStatus);
		enabledStatus.click();
		waitforwebelementToBeClickable(passwordField);
		passwordField.sendKeys(pwd);
		employeeNameField.sendKeys("Qwerty");
		selectOptionFromAutoselectDropdown(employeeNames, EmployeeName);
		usernameField.sendKeys(username);
		confirmPasswordField.sendKeys(pwd);
		saveBtn.click();
		waitforwebelementTOappear(successPopup);
		
	}
	public WebElement getsuccessPopup() {
		
		return successPopup;
	}
	
	public String searchUser(String username, String EmployeeName) {
		waitforwebelementToBeDisappear(successPopup);
		usernameField.sendKeys(username);
		userRoleDropdown.click();
		waitforwebelementTOappear(adminOption);
		adminOption.click();
		employeeNameField.sendKeys("Qwerty");
		selectOptionFromAutoselectDropdown(employeeNames, EmployeeName);
		StatusDropdown.click();
		waitforwebelementTOappear(enabledStatus);
		enabledStatus.click();
		searchBtn.click();
		String searchedUserName = getName(username, userNames);
		System.out.println(searchedUserName);
		 return searchedUserName;
		
		
	}
	
	
	
	
	
}
