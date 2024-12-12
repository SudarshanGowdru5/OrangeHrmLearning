package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	WebElement usernameField;
	
	@FindBy(css="input[type='password']")
	WebElement passwordField;
	
	@FindBy(css=".oxd-button")
	WebElement loginBtn;
	
	
	public void applicationLogin(String username, String pwd) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(pwd);
		loginBtn.click();
	}
}
