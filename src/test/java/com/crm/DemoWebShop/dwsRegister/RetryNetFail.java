package com.crm.DemoWebShop.dwsRegister;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryNetFail {
@Test(retryAnalyzer = Listener.RetryList.class)
	public void main() {
		WebDriver driver = new ChromeDriver();
		assertEquals("abhi", "abhiraj");
	}
}
