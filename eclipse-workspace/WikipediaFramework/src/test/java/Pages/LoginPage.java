package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {

	 AndroidDriver driver;

	    public LoginPage(AndroidDriver d) {
	        driver = d;
	        PageFactory.initElements(driver, this);
	    }
	    
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"More options\"]")
	WebElement moreOption;
	
	@FindBy(id="org.wikipedia.alpha:id/explore_overflow_account_name")
	WebElement accName;
	
	@FindBy(id="org.wikipedia.alpha:id/login_username_text")
	WebElement txtUsername;
	
	@FindBy(xpath="//TextInputLayout[@resource-id=\"org.wikipedia.alpha:id/login_password_input\"]/android.widget.FrameLayout/android.widget.EditText")
	WebElement txtPassword;
	
	@FindBy(id="org.wikipedia.alpha:id/login_button")
	WebElement logIn;
	
	public void clickOnMoreOption()
	{
		moreOption.click();
	}
	
	public void clickOnAcc()
	{
		accName.click();
	}
	
	public void Username()
	{
		txtUsername.sendKeys("raninaikkbh");
	}
	
	public void Password()
	{
		txtPassword.sendKeys("Ranu@123");
	}
	
	public void LoginBtn()
	{
		logIn.click();
	}
}




	










