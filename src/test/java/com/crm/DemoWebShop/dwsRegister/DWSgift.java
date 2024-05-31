package com.crm.DemoWebShop.dwsRegister;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.PomFile.DwsGiftCard;

public class DWSgift {

	public void gift() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	
	DwsGiftCard gft = new DwsGiftCard();
	gft.Rname("Abhiraj");
	Thread.sleep(2000);
	gft.REmail("abhirajamandhare007@gmail.com");
	Thread.sleep(2000);
	gft.Qty("4");
}
}
