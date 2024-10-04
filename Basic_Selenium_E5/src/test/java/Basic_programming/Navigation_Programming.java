package Basic_programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Programming {

	public static void main(String[] args) throws Throwable {
		
		        //Chrome driver
				WebDriverManager.chromedriver().setup();
				//opening Chrome browser
				WebDriver driver = new ChromeDriver();
				//maximizing the browser
				driver.manage().window().maximize();
				//entering the URL
				driver.get("https://www.facebook.com/login");
				Thread.sleep(3000);
				//navigating to other URL
				driver.navigate().to("https://www.amazon.in/");
				Thread.sleep(3000);
				//navigation to back page
				driver.navigate().back();
				Thread.sleep(3000);
				driver.navigate().forward();
				Thread.sleep(3000);
				driver.quit();
				

	}

}
