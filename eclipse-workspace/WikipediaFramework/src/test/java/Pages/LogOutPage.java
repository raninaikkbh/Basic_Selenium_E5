package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LogOutPage {
	

	 AndroidDriver driver;

	    public LogOutPage(AndroidDriver d) 
	    {
	        driver = d;
	        PageFactory.initElements(driver, this);
	    }
	    
		@FindBy(xpath="//android.widget.TextView[@content-desc=\"More options\"]")
		WebElement moreOption;
		
		@FindBy(id="org.wikipedia.alpha:id/explore_overflow_settings")
		WebElement setting;
		
		@FindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
		WebElement navigate;

		@FindBy(id="org.wikipedia.alpha:id/explore_overflow_log_out")
		WebElement logout;
		
		public void clickOnMoreOption()
		{
			moreOption.click();
		}
		
		public void clickOnSetting()
		{
			setting.click();
			navigate.click();
		}
		
		public void clickOnLogOut()
		{
			logout.click();
		}
}
