package com.testleaf.pages_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatContact_para {
	
	WebDriver driver;
	
	
	By firstname = By.id("firstNameField");
	By lastname = By.id("lastNameField");
	
	
	public CreatContact_para(WebDriver driver) {
		this.driver=driver;
	}

	public void VerifyCreatContact(String fname, String lname) {
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
	}
}
