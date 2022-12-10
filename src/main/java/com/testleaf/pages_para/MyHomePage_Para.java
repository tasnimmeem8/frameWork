package com.testleaf.pages_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyHomePage_Para {

		
	WebDriver driver;
		
		//By is a class and id is a static method , will return only By
		By CreateLeadLink = By.linkText("Create Lead");
		
		//constructor
		public MyHomePage_Para(WebDriver driver){
			this.driver=driver;
			
		}
		//three methods for three elements or locator
		public void clickCreateleadLink() {
			driver.findElement(CreateLeadLink).click();
		}

		
	}


