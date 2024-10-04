package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class searchTextPage {
		
		 AndroidDriver driver;

		    public searchTextPage(AndroidDriver d) 
		    {
		        driver = d;
		        PageFactory.initElements(driver, this);
		    }
		    
		@FindBy(id="org.wikipedia.alpha:id/fragment_feed_header")
		WebElement searchTxt;
		
		@FindBy(id="org.wikipedia.alpha:id/search_src_text")
		WebElement nextSearchTxt;
		
		@FindBy(id="org.wikipedia.alpha:id/horizontal_scroll_list_item_image")
		WebElement suggestion2nd;
		
		@FindBy(id="org.wikipedia.alpha:id/view_wiki_error_button")
		WebElement GoBackBtn;
		
		@FindBy(id="org.wikipedia.alpha:id/fragment_feed_header")
		WebElement header;
		
		@FindBy(id="org.wikipedia.alpha:id/search_lang_button")
		WebElement selectLanguage;
		
		@FindBy(xpath="//android.widget.FrameLayout[@content-desc=\"My lists\"]/android.view.ViewGroup")
		WebElement MyList;
		
		@FindBy(xpath="(//android.widget.ImageView[@resource-id=\"org.wikipedia.alpha:id/icon\"])[3]")
		WebElement history;
		
		@FindBy(xpath="(//android.widget.ImageView[@resource-id=\"org.wikipedia.alpha:id/icon\"])[4]")
		WebElement nearBy;
		
		@FindBy(xpath="(//android.widget.ImageView[@resource-id=\"org.wikipedia.alpha:id/icon\"])[1]")
		WebElement explore;
		
		public void searchTxtBox()
		{
			searchTxt.click();
			nextSearchTxt.click();
			nextSearchTxt.sendKeys("carrer");
		}
		
		public void suggestionText()
		{
			suggestion2nd.click();
		}
		
		public void ClickOnGoBackBtn()
		{
			GoBackBtn.click();
			header.click();
		}
		
		public void ClickOnSelectLanguage()
		{
			selectLanguage.click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Hindi\"));")).click();
			driver.navigate().back();
			driver.navigate().back();
		}
		
		public void myList()
		{
			MyList.click();
		}
		
		public void History()
		{
			history.click();
		}
		
		public void NearBy()
		{
			nearBy.click();
		}
		
		public void Explore()
		{
			explore.click();
		}

}

	