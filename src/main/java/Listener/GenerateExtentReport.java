package Listener;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReport implements ITestListener{

	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test = report.createTest(name);
		System.out.println("OnTestStart");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("OnTestSuccess");
		
		String name = result.getMethod().getMethodName();
		test = report.createTest(name);
		System.out.println("onTestFailure");
		test.log(Status.PASS, name+" "+" is passed");
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("OnTestSuccess");
		String name = result.getMethod().getMethodName();
		test = report.createTest(name);
		System.out.println("onTestFailure");
		test.log(Status.FAIL, name+" "+" is passed");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test = report.createTest(name);
		System.out.println("onTestSkipped");
		test.log(Status.SKIP,name+" "+"is skipped" );
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}
	@Override
	public void onStart(ITestContext context) {
		File path = new File("./ExtentReport/TestRun.html");
		spark = new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("DemoWebShop");
		spark.config().setReportName("Abhiraj");
		spark.config().setTheme(Theme.DARK);
		report = new ExtentReports();
		report.setSystemInfo("os", "windows-10");
		report.setSystemInfo("Browser", "Chrome");
		report.attachReporter(spark);
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
		report.flush();
	}
	
	
}
