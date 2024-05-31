package Listener;

import java.awt.event.ItemListener;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import SsFailed.BaseClass;

public class takesswithextentreport extends BaseClass implements ITestListener{
	
	
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {

		String name = result.getMethod().getMethodName();
		test = report.createTest(name);
		test.log(Status.INFO, "welcome to our class...");
		test.log(Status.INFO, "my wonderful fellows....");

	}
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "your testcase has passed");
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "your testcase has failed");
		TakesScreenshot ts =(TakesScreenshot)driver;
		String from = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "your testcase has skipped");
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}
	@Override
	public void onStart(ITestContext context) {
	
		File path = new File("./capture.html");
		 spark= new ExtentSparkReporter(path);
		 spark.config().setDocumentTitle("hey...!!!!");
		 spark.config().setReportName("Abhiraj");
		 spark.config().setTheme(Theme.DARK);
		 report= new ExtentReports();
		 report.setSystemInfo("OS", "WINDOWS");
		 report.setSystemInfo("Browser", "Chrome");
		 report.attachReporter(spark);
		 
		
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
		report.flush();
	}
	
	
	
	
	
	
	
		

}
