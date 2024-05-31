package com.crm.DemoWebShop.dwsRegister;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.PomFile.DwsLoginwithmethod;

public class LoginWithMethod {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		DwsLoginwithmethod dws = new DwsLoginwithmethod(driver);
		dws.t1("admin01@gmail.com");
		Thread.sleep(2000);
		dws.t2("admin01");
		Thread.sleep(2000);
		dws.t3();
		Thread.sleep(2000);
		
	}
}
