package testComponents;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;

public class BaseTest {

	public WebDriver driver;
	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		return driver;
	}
	
	@BeforeClass(alwaysRun = true)
	public LoginPage navigateToApplication() {
		driver=launchBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return new LoginPage(driver);
	}
	
	@AfterClass()
	public void closeBrowser() {
		driver.close();
	}
	
	public List<HashMap<String,String>> readJasonData(String path) throws IOException {
		
		String jasonData = FileUtils.readFileToString(new File(path), StandardCharsets.UTF_8);
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jasonData, new TypeReference<List<HashMap<String, String>>>(){});
		//mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>()
		return data;
	}
	
	public String takeScreenshot(String TestCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Errorshots/"+TestCaseName+".png");
		FileUtils.copyFile(tempFile, destFile);
		
		return "./Errorshots/"+TestCaseName+".png";
	}
}
