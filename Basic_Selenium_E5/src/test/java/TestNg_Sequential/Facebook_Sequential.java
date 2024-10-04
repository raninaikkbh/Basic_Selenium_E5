package TestNg_Sequential;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Sequential {
@Test
	public void fb() throws Throwable {

		//setup chrome (Upcasting)
				WebDriverManager.edgedriver().setup();
				// opening chrome browser
				WebDriver driver = new EdgeDriver(); 
				// maximizing the browser 
				driver.manage().window().maximize(); 
				// implicit statement 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				driver.quit();
	}
}
