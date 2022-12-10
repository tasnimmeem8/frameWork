package com.testleaf.pages_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatLeadPaga_para {

		
	WebDriver driver;
		
		//By is a class and id is a static method , will return only By
		By companyname = By.id("createLeadForm_companyName");
		By firstname = By.id("createLeadForm_firstName");
		By lastname = By.id("createLeadForm_lastName");
		By creatleadBtn = By.xpath("//input[@value='Create Lead']");
		
		
		//constructor
		public CreatLeadPaga_para(WebDriver driver){
			this.driver=driver;
			
		}
		
		public void verifyCreatLead(String cname, String fname, String lname ) {
			driver.findElement(companyname).sendKeys(cname);
			driver.findElement(firstname).sendKeys(fname);
			driver.findElement(lastname).sendKeys(lname);
			driver.findElement(creatleadBtn).click();
			
		}
		
	/*	public void typeCompanyname() {
			driver.findElement(companyname).sendKeys("ABC");
		}
		public void typefirstname() {
			driver.findElement(firstname).sendKeys("Hema");
		}
		public void typelastname() {
			driver.findElement(lastname).sendKeys("Mali");
		}
		public void clickCreatleadBtn() {
			driver.findElement(creatleadBtn).click();
		}*/
		
	}


