package testComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTestNg extends BaseTest implements IRetryAnalyzer{

	int count=0;
	int max=1;
	
	public boolean retry(ITestResult result) {

		
		if(count<max) {
			count++;
			return true;
		}
		return false;
	}

}
