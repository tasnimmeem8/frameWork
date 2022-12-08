package com.testleaf1.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner {
	
	@Test
	public void verifylogin() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	LoginPage lp = new LoginPage(driver);
	lp.enterUsername();
	lp.enterPassword();
	lp.clickLogin();
	
	WelcomePage wp = new WelcomePage(driver);
	wp.clickCrmsfaLink();
	
	MyHomePage mh= new MyHomePage (driver);
	mh.clickCreatLeadlink();
	
	CreatLeadPage cl = new CreatLeadPage(driver);
	cl.enterCompanyName();
	cl.enterFirstName();
	cl.enterLastName();
	cl.chooseSource();
	cl.chooseMarketingcamp();
		
	
	
	

}
}