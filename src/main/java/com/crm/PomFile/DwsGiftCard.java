package com.crm.PomFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsGiftCard {

	public Dwsgiftcard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Rname(String name) {
		recipientName.sendkeys(name);
		
	}
	public void REmail(String Remail) {
		reciepientEmail.senkeys(Remail);
		
	}
	public void Qty(String qty) {
		enteredQuantity.senkeys(qty);
		
	}
	private @FindBy(id="giftcard_1_RecipientName")
	WebElement recipientName;
	
	private @FindBy(id="giftcard_1_RecipientEmail")
	WebElement recipientEmail;
	
	private @FindBy(id="addtocart_1_EnteredQuantity")
	WebElement enteredQuantity;
	
}
