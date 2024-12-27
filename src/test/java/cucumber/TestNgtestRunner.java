package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/java/cucumber", glue = "stepDefination", monochrome = true,tags = "@Recruitment", plugin = {"html:Reports/cucumber.html"})
public class TestNgtestRunner extends AbstractTestNGCucumberTests{
	


}
