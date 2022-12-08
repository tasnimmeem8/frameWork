package com.testleaf1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username= By.id("username");
	By password= By.id("password");
	By login = By.className("decorativeSubmit");



public LoginPage(WebDriver driver) {
	this.driver= driver;
}

public void enterUsername() {
	driver.findElement(username).sendKeys("DemoCSR");
}

public void enterPassword() {
	driver.findElement(password).sendKeys("crmsfa");
}

public void clickLogin() {
	driver.findElement(login).click();
}









}