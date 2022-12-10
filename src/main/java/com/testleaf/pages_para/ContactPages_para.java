package com.testleaf.pages_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPages_para {
	
	WebDriver driver;
	
	By contacts= By.linkText("Contacts");
	By CreatContact = By.linkText("Create Contact");
	
	public ContactPages_para(WebDriver driver) {
		this.driver=driver;
	}
	
	public void VerifyContactPage() {
		driver.findElement(contacts).click();
		driver.findElement(CreatContact).click();
	}

}
