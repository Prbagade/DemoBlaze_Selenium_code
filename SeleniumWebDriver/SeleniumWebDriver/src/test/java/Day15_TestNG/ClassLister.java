package Day15_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ClassLister  implements ITestListener
{
	
	 public void onStart(ITestContext context) {
		    System.out.println("ONstart...");
		  }

	 public void onTestStart(ITestResult result) {
	    System.out.println("Test Start...");
	  }
	
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("Test Success...");
	  }
	
	 public void onTestFailure(ITestResult result) {
		    System.out.println("Test failed...");
		  }
	
	 public void onTestSkipped(ITestResult result) {
	    System.out.println("Test Skipped...");
	  }
	
	 public void onFinish(ITestContext context) {
	    System.out.println("Test all Finished...");
	  }
	

	
}
