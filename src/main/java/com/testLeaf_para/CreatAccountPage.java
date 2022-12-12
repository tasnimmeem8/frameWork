package com.testLeaf_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreatAccountPage {
	
	WebDriver driver;
	
	By accountName= By.id("accountName");
	By industry = By.name("industryEnumId");
	
	public CreatAccountPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void VerifyCreatAccountPage(String aname, String vlu) {
		driver.findElement(accountName).sendKeys(aname);
		
		WebElement ele = driver.findElement(industry);
		Select dd = new Select(ele);
		dd.selectByValue(vlu);
	}

}
