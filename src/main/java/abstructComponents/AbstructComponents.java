package abstructComponents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstructComponents {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
	public AbstructComponents(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waitforwebelementTOappear(WebElement ele) {
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}

	public void waitforwebelementToBeClickable(WebElement ele) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public void waitforwebelementToBeDisappear(WebElement ele) {
		wait.until(ExpectedConditions.invisibilityOfAllElements(ele));
	}
	
	public String selectOptionFromAutoselectDropdown(List<WebElement> options, String name) {
		
		String value = null;
		for(WebElement option:options) {
			
			 value = option.getText();
			if(value.contains(name)) {
				option.click();
				break;
			}
		}
		return value;
	}
	
public String getName(String username, List<WebElement> userNames) {
	String name="";
	
	for(WebElement option:userNames) {
		String us = option.getText();
		if(name.equalsIgnoreCase(username)) {
			name=us;
			break;
		}
	}
	return name;
}

public void selectCalanderDate(WebElement monthdropdown,WebElement yeardropdown, List<WebElement> months, List<WebElement> years, List<WebElement> dates, String month, String date, String year){ {
	
		monthdropdown.click();
		for(WebElement option:months) {
			String mon = option.getText();
			if(mon.equalsIgnoreCase(month)) {
				option.click();
			}
		}
		yeardropdown.click();
		for(WebElement option:years) {
			String yrs = option.getText();
			if(yrs.equalsIgnoreCase(year)) {
				option.click();
			}
		}
		for(WebElement option:dates) {
			String dts = option.getText();
			if(dts.equalsIgnoreCase(date)) {
				option.click();
			}
		}
	}
}
public boolean checkElement(List<WebElement> ele, String value) {
	boolean flag=false;
	for(WebElement option:ele) {
		String name = option.getText();
		if(name.equalsIgnoreCase(value)) {
			flag=true;
			break;
		}
		
	}
	return flag;
}
	
}
