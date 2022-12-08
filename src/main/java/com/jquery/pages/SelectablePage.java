package com.jquery.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectablePage {
	
	WebDriver driver;
	
	By buttonitem1 = By.xpath("//li[text()='Item 1']");
	By buttonitem2 = By.xpath("//li[text()='Item 2']");
	By buttonitem3 = By.xpath("//li[text()='Item 3']");
	By buttonitem4 = By.xpath("//li[text()='Item 4']");
	
	public SelectablePage(WebDriver driver) {
		this.driver = driver;			
	}
	
	public void clickItem1() {
		driver.findElement(buttonitem1).click();
	}
	
	public void clickitem2() {
		driver.findElement(buttonitem2).click();
	}
	
	public void clickitem3() {
		driver.findElement(buttonitem3).click();
	}
	
	public void clickitem4() {
		driver.findElement(buttonitem4).click();
	}

}
