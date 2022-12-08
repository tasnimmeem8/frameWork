package com.testleaf1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreatLeadPage {
	
	WebDriver driver;
	
	By companyname= By.id("createLeadForm_companyName");
	By firstname = By.id("createLeadForm_firstName");
	By lastname = By.id("createLeadForm_lastName");
	By source = By.id("createLeadForm_dataSourceId");
	By Marketingcam = By.id("createLeadForm_marketingCampaignId");
	
	
	public CreatLeadPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterCompanyName() {
		driver.findElement(companyname).sendKeys("ABC");
	}
	
	public void enterFirstName() {
		driver.findElement(firstname).sendKeys("Hema");
	}
	
	public void enterLastName() {
		driver.findElement(lastname).sendKeys("Mali");
	}
	
	public void chooseSource() {
		WebElement ele = driver.findElement(source);
		Select dd = new Select(ele);
		dd.selectByVisibleText("Direct Mail");
	}
	
	public void chooseMarketingcamp() {
		WebElement ele1 = driver.findElement(Marketingcam);
		Select dd1 = new Select (ele1);
		dd1.selectByVisibleText("Affiliate Sites");
	}

}
