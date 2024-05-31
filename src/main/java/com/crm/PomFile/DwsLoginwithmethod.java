package com.crm.PomFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLoginwithmethod {

	public DwsLoginwithmethod(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(id = "Email")
	WebElement username;
	
	private @FindBy(id = "Password")
	WebElement loginButton;
	
	public void t1(String name) {
		username.sendKeys(name);
	}
	
	public void t2(String pass1) {
		pass.sendkeys(pass1);
	}
	public void t3() {
		loginButton.click();
	}
	


}

