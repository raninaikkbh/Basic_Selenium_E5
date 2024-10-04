package TestNg_Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_CrossBrowser {
	@Parameters({"browsername"})
@Test

public void facebook(String browser) {
	WebDriver driver;
	if(browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		// opening chrome browser
		 driver = new EdgeDriver(); 
	}
	else {
		WebDriverManager.firefoxdriver().setup();
		//opening firefox browser
		driver = new FirefoxDriver();
		
	}
	
		// maximizing the browser 
		driver.manage().window().maximize(); 
		// implicit statement 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://www.facebook.com/");
}
}

