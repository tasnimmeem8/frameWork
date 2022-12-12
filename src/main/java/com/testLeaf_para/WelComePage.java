package com.testLeaf_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelComePage {
	
	WebDriver driver ;
	
	By crmsfaLink = By.linkText("CRM/SFA");
//	By logoutBtn = By.className("decorativeSubmit");
	
	public WelComePage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public void VerifyWelcomePage() {
		
		driver.findElement(crmsfaLink).click();
	//	driver.findElement(logoutBtn).click();
		
	}
}

