package com.testLeaf_para;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClass {
	
	public ChromeDriver driver;
	
	@Test
	public void testLoginFunctionality() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	
	LoginPage lp= new LoginPage(driver);
	lp.Verifylogin("DemoCSR", "crmsfa");
	
	WelComePage wp= new WelComePage(driver);
	wp.VerifyWelcomePage();
	
	HomePage hp = new HomePage(driver);
	hp.VerifyHomePage();
	
	CreatLeadPage cp= new CreatLeadPage(driver);
	cp.VerifyCreatLeadPage("ABC", "Hema", "Mali", "Direct Mail");
	
	ViewLeadPage vl = new ViewLeadPage(driver);
	vl.VerifyViewLeadPage();
	
	MyAccountPage mp = new MyAccountPage(driver);
	mp.VerifyMyAccountPage();
	
	CreatAccountPage ca =new CreatAccountPage(driver);
	ca.VerifyCreatAccountPage("BCd", "IND_HARDWARE");
	

}
}