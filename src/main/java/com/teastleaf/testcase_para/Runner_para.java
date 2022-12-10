package com.teastleaf.testcase_para;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.testleaf.pages_para.ContactPages_para;
import com.testleaf.pages_para.CreatContact_para;
import com.testleaf.pages_para.CreatLeadPaga_para;
import com.testleaf.pages_para.HomePage_para;
import com.testleaf.pages_para.LoginPage_para;
import com.testleaf.pages_para.MyHomePage_Para;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner_para {
	

	@Test
	public void verifyValidLoginPage() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage_para lp= new LoginPage_para(driver);
		lp.loginToTeastLeaf("DemoCSR", "crmsfa");
	
		
		HomePage_para hp = new HomePage_para(driver);
		hp.clickCrmsfaLink();
		
		
		MyHomePage_Para mhp= new MyHomePage_Para(driver);
		mhp.clickCreateleadLink();
		
		CreatLeadPaga_para clp = new CreatLeadPaga_para(driver);
		clp.verifyCreatLead("ABC", "Hema", "Mali");
		
		ContactPages_para cp= new ContactPages_para(driver);
		cp.VerifyContactPage();
		
		CreatContact_para cc = new CreatContact_para(driver);
		cc.VerifyCreatContact("Hema", "Mali");
		
		
		driver.quit();
	
	}
	

}


