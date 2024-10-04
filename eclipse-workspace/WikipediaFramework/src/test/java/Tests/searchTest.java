package Tests;

import org.testng.annotations.Test;
import Pages.searchTextPage;
import io.appium.java_client.android.AndroidDriver;

public class searchTest extends BaseClass{

	
	 @Test
	    public void search() throws InterruptedException {
		 
	        //  initialized AndroidDriver 
	        AndroidDriver driver = getDriver();
	        
	        searchTextPage search = new searchTextPage(driver);
	        
	        search.searchTxtBox();
	        search.suggestionText();
	        search.ClickOnGoBackBtn();
	        search.ClickOnSelectLanguage();
	        search.myList();
	        search.History();
	        search.NearBy();
	        search.Explore();
	       
	        
}
}
