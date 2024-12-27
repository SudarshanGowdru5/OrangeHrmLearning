package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstructComponents.AbstructComponents;

public class LoginPage extends AbstructComponents{

	WebDriver driver;
	public LoginPage(WebDriver driver){
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	WebElement usernameField;
	
	@FindBy(css="input[type='password']")
	WebElement passwordField;
	
	@FindBy(css=".oxd-button")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[@class='orangehrm-login-error']/child::div/child::div/child::p")
	WebElement errorMsg;
	
	
	public HomePage applicationLogin(String username, String pwd) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(pwd);
		loginBtn.click();
		return new HomePage(driver);
	}
	
	public String errorMessage() {
		waitforwebelementTOappear(errorMsg);
		String msg = errorMsg.getText();
		return msg;
	}
}
