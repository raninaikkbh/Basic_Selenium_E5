package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_Child_firefox {

	public static void main(String[] args) {
	
		FirefoxOptions options = new FirefoxOptions();
		FirefoxOptions option = null;
		option.addArguments("--disable-notifications");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(option); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.quikr.com/");

	}

}
