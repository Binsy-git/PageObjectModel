package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {

	@Test
	public void generateReport() {
		
		// start report
		ExtentReports report = new ExtentReports("./Result/Report.html", false);
		
		// Start Test
		ExtentTest test = report.startTest("TC005", "To verify Irctc Registration for the new user creation");
		
		test.assignAuthor("Binsy");
		
		test.assignCategory("Functional");
		
		// log test steps
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given URL");
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
		
		
		
		
	}
	
	
}
