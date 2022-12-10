package com.testleaf.pages_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_para {
	
		
		WebDriver driver;
		
		//By is a class and id is a static method , will return only By
		By username = By.id("username");
		By password = By.id("password");
		By loginbutton = By.className("decorativeSubmit");
		
		//constructor
		public LoginPage_para(WebDriver driver){
			this.driver=driver;
			
		}
		public void loginToTeastLeaf(String uname, String pword) {
			driver.findElement(username).sendKeys(uname);
			driver.findElement(password).sendKeys(pword);
			driver.findElement(loginbutton).click();
		}
		
		
		
		
		
		//three methods for three elements or locator
	/*	public void typeUsername(String uname) {
			driver.findElement(username).sendKeys(uname);
		}
		
		public void typePassword(String pword) {
			driver.findElement(password).sendKeys(pword);
		}
		
		public void clickLoginBtn() {
			driver.findElement(loginbutton).click();
		}*/
		
	}



