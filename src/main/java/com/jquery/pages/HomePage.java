package com.jquery.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	By selectablelink = By.linkText("Selectable");
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickSelectableLink() {
		driver.findElement(selectablelink).click();
	}

}
