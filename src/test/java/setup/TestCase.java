package setup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	
public ChromeDriver driver;
	
	@Given("Open browser and load URL")
	public void open_browser_and_load_URL() {
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Enter username as DemoCSR")
	public void enter_username_as_DemoCSR() {
	    driver.findElementById("username").sendKeys("DemoCSR");
	}

	@Given("Enter password as crmsfa")
	public void enter_password_as_crmsfa() {
	    driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("Click login")
	public void click_login() {
	    driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Click CRMSFA")
	public void click_CRMSFA() {
	    driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("Click CreatLead button")
	public void click_CreatLead_button() {
	    driver.findElementByLinkText("Create Lead").click();
	}

	@When("Enter Companyname as ABC")
	public void enter_Companyname_as_ABC() {
	    driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
	}

	@When("Enter Firstname as Hema")
	public void enter_Firstname_as_Hema() {
	    driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
	}

	@When("Enter Lastname as Mali")
	public void enter_Lastname_as_Mali() {
	    driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
	}

	@Then("Click My Home link")
	public void click_My_Home_link() {
	    driver.findElementByLinkText("My Home").click();
	}

	@Given("Click Create Account link")
	public void click_Create_Account_link() {
	    driver.findElementByLinkText("Create Account").click();
	}

	@When("Enter account name as XYZ")
	public void enter_account_name_as_XYZ() {
	    driver.findElementByXPath("//input[@id='accountName']").sendKeys("XYZ");
	}

	@When("Choose Aerospace as Industry")
	public void choose_Aerospace_as_Industry() {
	    WebElement ele = driver.findElementByName("industryEnumId");
	    Select dd = new Select(ele);
	    dd.selectByVisibleText("Aerospace");
	}
	
	@Then("Close Browser")
	public void close_Browser() {
	   driver.close();
	}

	

}
