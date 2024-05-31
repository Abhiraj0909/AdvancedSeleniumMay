package com.crm.DemoWebShop.dwsRegister;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.PomFile.DwsRegister;

public class DWSRegister {

	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		DwsRegister dws = new DwsRegister(driver);
		
		
		String ti = driver.getTitle();
		
		System.out.println(ti);
		
		dws.registerlink();
		
		dws.genderfbut();
		Thread.sleep(2000);

		dws.FirstName("Abhiraj");
		Thread.sleep(2000);
		
		dws.LastName("Mandhare");
		Thread.sleep(2000);
		
		dws.Email("abhirajmandhare007@gmail.com");
		Thread.sleep(2000);
		
		dws.Password("abhiraj123");
		Thread.sleep(2000);
		
		dws.Conformpass("abhiraj123");
		Thread.sleep(2000);
		dws.Register();

	}

}
