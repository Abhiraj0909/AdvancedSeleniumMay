package SsFailed;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CaptureFailedSS extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
	//	LocalDateTime date = LocalDateTime.now();
		LocalDateTime date = LocalDateTime.now();
		String time = toString().replace(":", "=");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("G:\\Eclipse\\com.crm.DemoWebShop\\SSFailed"+date+time+".png");
		
		try {
			FileHandler.copy(from, to);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
