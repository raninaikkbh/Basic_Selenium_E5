package PopUps;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_PopUp {

	public static void main(String[] args) {
		
		HashMap<String, Integer> contentStrings = new HashMap<String, Integer>();
		HashMap<String, Object> profiles = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		contentStrings.put("Notification", 0);
		profiles.put("managed_default_content_settings", contentStrings);
		prefs.put("Profile", profiles);
		
		//Handling Notification pop up in firefox Browser
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("preferences", prefs);
		
		//setup chrome 
				WebDriverManager.firefoxdriver().setup();
				// opening chrome browser
				WebDriver driver = new FirefoxDriver(); 
				// maximizing the browser 
				driver.manage().window().maximize(); 
				// implicit statement 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.quikr.com/");

	}

}
