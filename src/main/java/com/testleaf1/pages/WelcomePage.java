package com.testleaf1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
	
	WebDriver driver;
	
	By crmsfalink = By.xpath("//div[@id='label']/a");
//	By logOut = By.className("decorativeSubmit");
	
	public WelcomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickCrmsfaLink() {
		driver.findElement(crmsfalink).click();
	}

}
