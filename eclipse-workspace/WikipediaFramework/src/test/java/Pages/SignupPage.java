package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SignupPage {
	
	 AndroidDriver driver;

	    public SignupPage(AndroidDriver d) {
	        driver = d;
	        PageFactory.initElements(driver, this);
	    }
	    
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"More options\"]")
	WebElement moreOption;
	
	@FindBy(id="org.wikipedia.alpha:id/explore_overflow_account_name")
	WebElement accName;
	
	//Click on Dont have an account
	@FindBy(id="org.wikipedia.alpha:id/login_create_account_link")
	WebElement createAccOption;
	
	@FindBy(id="org.wikipedia.alpha:id/create_account_username")
	WebElement txtusername;
	
	@FindBy(xpath="//TextInputLayout[@resource-id=\"org.wikipedia.alpha:id/create_account_password_input\"]/android.widget.FrameLayout/android.widget.EditText")
	WebElement txtPassword;
	
	@FindBy(xpath="//TextInputLayout[@resource-id=\"org.wikipedia.alpha:id/create_account_password_repeat\"]/android.widget.FrameLayout/android.widget.EditText")
	WebElement repeatpwd;
	
	@FindBy(id="org.wikipedia.alpha:id/create_account_email")
	WebElement txtEmail;
	
	@FindBy(id="org.wikipedia.alpha:id/create_account_submit_button")
	WebElement nextBtn;
	
	public void clickOnMoreOption()
	{
		moreOption.click();
	}
	
	public void clickOnAcc()
	{
		accName.click();
	}
	
	public void ClickOnCreateAcc()
	{
		createAccOption.click();
	}
	
	public void username()
	{
		txtusername.sendKeys("raninaikkbh");
	}
	
	public void password()
	{
		txtPassword.sendKeys("Ranu@123");
	}
	
	public void Repeatpwd()
	{
		repeatpwd.sendKeys("Ranu@123");
	}
	
	public void EmailID()
	{
		txtEmail.sendKeys("ranunaikkbh@gmail.com");
	}
	
	public void NextBtn()
	{
		nextBtn.click();
	}

}




























