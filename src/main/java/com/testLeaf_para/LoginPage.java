package com.testLeaf_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By username= By.id("username");
	By password= By.id("password");
	By loginButton = By.className("decorativeSubmit");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Verifylogin(String uname, String pword) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pword);
		driver.findElement(loginButton).click();
		
	}
}
