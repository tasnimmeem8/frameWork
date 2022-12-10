package com.testleaf.pages_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage_para {


	WebDriver driver;
		
		//By is a class and id is a static method , will return only By
		By crmsfaLink = By.linkText("CRM/SFA");
//		By logoutBtn = By.className("decorativeSubmit");
		
		//constructor
		public HomePage_para(WebDriver driver){
			this.driver=driver;	
		}
		
		public void clickCrmsfaLink() {
			driver.findElement(crmsfaLink).click();
		}
		
	/*	public void clickLogoutBtn() {
			driver.findElement(logoutBtn).click();
		}*/
	}


