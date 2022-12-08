package com.jquery.testcase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.jquery.pages.HomePage;
import com.jquery.pages.SelectablePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner {

	@Test
	public void verification() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
		
		HomePage hp = new HomePage(driver);
		hp.clickSelectableLink();
		
		SelectablePage se = new SelectablePage(driver);
	    driver.switchTo().frame(0);
		se.clickItem1();
		se.clickitem2();
		se.clickitem3();
		se.clickitem4();
	}
	
	
}
