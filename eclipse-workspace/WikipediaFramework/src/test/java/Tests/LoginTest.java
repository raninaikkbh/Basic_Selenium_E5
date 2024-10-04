package Tests;

import org.testng.annotations.Test;
import Pages.LoginPage;
import io.appium.java_client.android.AndroidDriver;

public class LoginTest extends BaseClass{
	
	 @Test
	    public void login() throws InterruptedException {
		 
	        //  initialized AndroidDriver 
	        AndroidDriver driver = getDriver();
	        
	        LoginPage login = new LoginPage(driver);
	        
	        login.clickOnMoreOption();
	        login.clickOnAcc();
	        login.Username();
	        login.Password();
	        login.LoginBtn();
	        Thread.sleep(6000);
	               
	 }

}
