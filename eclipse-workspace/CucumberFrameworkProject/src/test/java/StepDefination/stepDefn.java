package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefn {
	
	public WebDriver driver;
	
	public LoginPage login;
	public AddNewCustomerPage AddNewcust;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		login = new LoginPage(driver);
		AddNewcust = new AddNewCustomerPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {		
		driver.get(url);

	}

	
	//Login feature
	
	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailAdd, String password) {
		login.enterEmail(emailAdd);
		login.enterPassword(password);

	}

	@When("Click on Login")
	public void click_on_login() {
	   login.clickOnLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();
		
		//verification
		//Assert.assertEquals("Page title doesn't match", expectedTitle, actualTitle);

		
		if(actualTitle.equals(expectedTitle)) 
		{
			Assert.assertTrue(true);   //pass
		}
		else
		{
			Assert.assertTrue(false); //fail
		}
	  
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
	   login.clickOnLogOutButton();

	}

	@Then("close browser")
	public void close_browser() {
	   driver.quit();

	}
	
	
	//Add New Customer
	
	
	@Then("User can view Dashboad")
	public void user_can_view_dashboad() {
		String actualTitle = AddNewcust.getPageTitle();
		String expectedTitle = "Dashboard / nopCommerce administration";
		
		if (actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	    
	}

	@When("User click on customers Menu")
	public void user_click_on_customers_menu() {
		AddNewcust.clickOnCustomersMenu();
		
	}

	@When("click on customers Menu Item")
	public void click_on_customers_menu_item() {
		AddNewcust.clickOnCustomersMenuItem();
	  
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
		AddNewcust.clickOnAddnew();
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		
		String actualTitle = AddNewcust.getPageTitle();
		String expectedTitle = "Add a new customer / nopCommerce administration";

		if(actualTitle.equals(expectedTitle))
		{

			Assert.assertTrue(true);//pass
		}
		else
		{

			Assert.assertTrue(false);//fail
		}
		
	}

	//Add customer Information 
	
	@When("User enter customer info")
	public void user_enter_customer_info() {
		AddNewcust.enterEmail("test@1gmail.com");
		AddNewcust.enterPassword("test");
		AddNewcust.enterFirstName("Ram");
		AddNewcust.enterLastName("Patil");
		AddNewcust.enterGender("Male");
		AddNewcust.enterDob("6/13/1999");
		AddNewcust.enterCompanyName("TCS");
		AddNewcust.enterAdminContent("Admin content");
		AddNewcust.enterManagerOfVendor("Vendor 1");
		
	   
	}

	@When("click on Save button")
	public void click_on_save_button() {
		AddNewcust.clickOnSave();
	   
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String exptectedConfirmationMsg) {
	  
		String bodyTagText = driver.findElement(By.tagName("Body")).getText();
		if(bodyTagText.contains(exptectedConfirmationMsg))
		{
			Assert.assertTrue(true);//pass

		}
		else
		{
			Assert.assertTrue(false);//fail

		}

	}


}
