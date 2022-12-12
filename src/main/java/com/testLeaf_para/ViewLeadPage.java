package com.testLeaf_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewLeadPage {
	
	WebDriver driver;
	
	By deletLeadBtn = By.className("subMenuButtonDangerous");
	By accountsBtn =By.linkText("Accounts");
	
	public ViewLeadPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void VerifyViewLeadPage() {
		driver.findElement(deletLeadBtn).click();
		driver.findElement(accountsBtn).click();
	}

}
