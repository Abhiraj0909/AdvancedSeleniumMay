package ScreenShot;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.PomFile.DwsLoginwithmethod;

import SsFailed.BaseClass;

@Listeners(Listener.GenerateExtentReport.class)
public class SSFailed extends BaseClass {
	

	@Test
	public void dwsLoginCorrect() throws InterruptedException {
	
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
		
	}

	@Test
	public void dwsLoginwrong() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}

	@Test(dependsOnMethods = "dwsLoginwrong")
	public void redbus() {
		driver.get("https://www.redbus.in/");
		assertEquals("abhiraj", "abhi");

	}
}
