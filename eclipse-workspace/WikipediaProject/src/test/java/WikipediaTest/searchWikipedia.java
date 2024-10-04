package WikipediaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class searchWikipedia extends BaseClass {

	
	@Test(priority = 1)
	
	public void signUpTest() throws InterruptedException
	
	{
		//click on more setting
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"More options\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("org.wikipedia.alpha:id/explore_overflow_account_name")).click();
		
		//Click on Dont have an account
		driver.findElement(By.id("org.wikipedia.alpha:id/login_create_account_link")).click();
		
		//click on username ,pwd
		driver.findElement(By.id("org.wikipedia.alpha:id/create_account_username")).sendKeys("ranunaikkbh");
		driver.findElement(By.xpath("//TextInputLayout[@resource-id=\"org.wikipedia.alpha:id/create_account_password_input\"]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Ranu@123");
		driver.findElement(By.xpath("//TextInputLayout[@resource-id=\"org.wikipedia.alpha:id/create_account_password_repeat\"]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Ranu@123");
		//driver.findElement(By.id("org.wikipedia.alpha:id/create_account_email")).sendKeys("ranunaikkbh@gmail.com");
		
		//next button
		driver.findElement(By.id("org.wikipedia.alpha:id/create_account_submit_button")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
		
		
	}
	
	
  @Test(priority = 2)
	
	public void LoginTest() throws InterruptedException
	
	{
	  
	        //click on more setting
//			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"More options\"]")).click();
//			Thread.sleep(3000);
//			
//			driver.findElement(By.id("org.wikipedia.alpha:id/explore_overflow_account_name")).click();
			
			//click on username , pwd
			driver.findElement(By.id("org.wikipedia.alpha:id/login_username_text")).sendKeys("raninaikkbh");
			Thread.sleep(3000);
			
		     //driver.findElement(By.id("org.wikipedia.alpha:id/login_password_input")).click();
			
			driver.findElement(By.xpath("//TextInputLayout[@resource-id=\"org.wikipedia.alpha:id/login_password_input\"]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Ranu@123");
			Thread.sleep(3000);
			
			//click on login button
			driver.findElement(By.id("org.wikipedia.alpha:id/login_button")).click();
			Thread.sleep(3000);
			

	}
	
	@Test(priority = 3)
	public void searchTest() throws InterruptedException {
		driver.findElement(By.id("org.wikipedia.alpha:id/fragment_feed_header")).click();

		WebElement ele = driver.findElement(By.id("org.wikipedia.alpha:id/search_src_text"));
		ele.click();

		ele.sendKeys("carrer");
		Thread.sleep(3000);

		//click on 2nd no. suggestion
		driver.findElement(By.id("org.wikipedia.alpha:id/horizontal_scroll_list_item_image")).click();
		Thread.sleep(3000);

		//click on Go Back button
		driver.findElement(By.id("org.wikipedia.alpha:id/view_wiki_error_button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("org.wikipedia.alpha:id/fragment_feed_header")).click();

		//Select language
		driver.findElement(By.id("org.wikipedia.alpha:id/search_lang_button")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Hindi\"));")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		//MyList
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"My lists\"]/android.view.ViewGroup")).click();
		Thread.sleep(3000);
		
		//History
		driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"org.wikipedia.alpha:id/icon\"])[3]")).click();
		Thread.sleep(3000);

		//nearBy
		driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"org.wikipedia.alpha:id/icon\"])[4]")).click();
		Thread.sleep(3000);
		
		//Explore
		driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"org.wikipedia.alpha:id/icon\"])[1]")).click();
		Thread.sleep(3000);
		
	}
}
