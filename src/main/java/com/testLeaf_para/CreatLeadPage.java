package com.testLeaf_para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreatLeadPage {
	
	WebDriver driver;
	
	By companyName = By.id("createLeadForm_companyName");
	By firstName =By.id("createLeadForm_firstName");
	By lastName = By.id("createLeadForm_lastName");
	By Source = By.id("createLeadForm_dataSourceId");
	By MarketingCam = By.id("createLeadForm_marketingCampaignId");
	By CreatLeadBtn = By.className("smallSubmit");
	
	
	public CreatLeadPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void VerifyCreatLeadPage(String cname, String fname, String lname, String txt) {
		driver.findElement(companyName).sendKeys(cname);
		driver.findElement(firstName).sendKeys(fname);
		driver.findElement(lastName).sendKeys(lname);
		
		WebElement ele = driver.findElement(Source);
		Select dd= new Select(ele);
		dd.selectByVisibleText(txt);
		
		WebElement ele1 = driver.findElement(MarketingCam);
		Select dd1 = new Select (ele1);
		dd1.selectByIndex(2);
		
		driver.findElement(CreatLeadBtn).click();
	}

}
