package com.crm.PomFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsRegister {
	
	public DwsRegister(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void registerlink() {
		registerlink.click();
	}
	
	public void gendermbut() {
		genderMButton.click();
	}
	public void genderfbut() {
		genderFButton.click();
	}
	public void FirstName(String Fname) {
		firstname.sendKeys(Fname);
	}
	public void LastName(String Lname) {
		lastname.sendKeys(Lname);
		
	}
	public void Email(String email1) {
		email.sendKeys(email1);
		
	}
	public void Password(String pass) {
		password.sendKeys(pass);
	}
	public void Conformpass(String Cpass) {
		confirmpass.sendKeys(Cpass);
	}
	public void Register() {
		registerButton.click();	
	}
	private @FindBy (xpath = "//a[text()='Register']") WebElement registerlink;
	private @FindBy(id = "gender-male") WebElement genderMButton;
	private @FindBy(id = "gender-female") WebElement genderFButton;
	private @FindBy(id = "FirstName") WebElement firstname;
	private @FindBy(id = "LastName") WebElement lastname;
	private @FindBy(id = "Email") WebElement email;
	private @FindBy(id = "Password") WebElement password;
	private @FindBy(id = "ConfirmPassword") WebElement confirmpass;
	private @FindBy(id = "register-button") WebElement registerButton;

}

