package Day15_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsManagaer implements ITestListener 
{
	
	public ExtentSparkReporter sparkReporter; //UI of the report
	public ExtentReports extent; //populate comma info on the report
	public ExtentTest test; //creating test case entries in the report and update status of the test methods
	
	public void onStart(ITestContext context) {
	    
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/myReport.html"); 
		
		sparkReporter.config().setDocumentTitle("Automation Report"); //title of report 
		sparkReporter.config().setReportName("Functional Testing"); //name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computor Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Praful");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser name", "Chrome");
		
	  }
	
	public void onTestSuccess(ITestResult result) {
	    test = extent.createTest(result.getName()); //create a new entry in the report
	    test.log(Status.PASS, "Test case Passed is: "+ result.getName()); //update status p/f/s	
	
	}
	
	public void onTestFailure(ITestResult result) {
		 test = extent.createTest(result.getName()); //create a new entry in the report
		 test.log(Status.FAIL, "Test case FAILED is:"+result.getName());
		 test.log(Status.FAIL,"test case FAILED cause is:"+result.getThrowable());
	  }
	
	public void onTestSkipped(ITestResult result) {
		 test = extent.createTest(result.getName()); //create a new entry in the report
		 test.log(Status.SKIP, "Test case SKIPPED is:"+result.getName());
		 
	  }
	
	public void onFinish(ITestContext context) {
	    extent.flush();
		
	  }
	
	

}
