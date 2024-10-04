package Tests;

import org.testng.annotations.Test;
import Pages.SignupPage;
import io.appium.java_client.android.AndroidDriver;

public class signUpTest extends BaseClass {
	
	
	 @Test
	    public void login() throws InterruptedException {
		 
	        //  initialized AndroidDriver 
	        AndroidDriver driver = getDriver();
	        
	        SignupPage signup = new SignupPage(driver);
	        
	        signup.clickOnMoreOption();
	        signup.clickOnAcc();
	        signup.ClickOnCreateAcc();
	        signup.username();
	        signup.password();
	        signup.Repeatpwd();
	        signup.EmailID();
	        signup.NextBtn();        

}
}
