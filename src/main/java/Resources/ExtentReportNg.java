package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNg {

	public static ExtentReports getReportObject() {
		
		ExtentSparkReporter report = new ExtentSparkReporter("./Reports/index.html");
		report.config().setReportName("Test Automation Results");
		report.config().setDocumentTitle("Test Results");
		
		ExtentReports event = new ExtentReports();
		event.attachReporter(report);
		event.setSystemInfo("Tester", "Sudarshan");
		
		return event;
	}
}
