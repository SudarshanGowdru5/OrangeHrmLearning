package testComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import Resources.ExtentReportNg;

public class ListnersTestNg extends BaseTest implements ITestListener {

	ExtentTest test;
	ExtentReports event=ExtentReportNg.getReportObject();
	ThreadLocal<ExtentTest> eventTest =new ThreadLocal<ExtentTest>();
	
	
	public void onTestStart(ITestResult result) {
		test = event.createTest(result.getMethod().getMethodName());
	  }
	
	public void onTestSuccess(ITestResult result) {
		eventTest.get().log(Status.PASS, "Test Pass");
		
		  }
	public void onTestFailure(ITestResult result) {
	    eventTest.get().fail(result.getThrowable());
		
	    try {
			driver=(WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    String path = null;
		try {
		 path=takeScreenshot(result.getTestClass().getTestName(), driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		eventTest.get().addScreenCaptureFromPath(path, result.getMethod().getMethodName());
	  }
	public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }
	public void onStart(ITestContext context) {
	    // not implemented
	  }
	public void onFinish(ITestContext context) {
	    // not implemented
		event.flush();
	  }
}
