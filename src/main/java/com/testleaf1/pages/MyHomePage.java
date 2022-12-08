package com.testleaf1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyHomePage {
	
	WebDriver driver;
	
	By creatleadlink= By.linkText("Create Lead");
	
	public MyHomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void clickCreatLeadlink() {
		driver.findElement(creatleadlink).click();
	}
	
	
}
