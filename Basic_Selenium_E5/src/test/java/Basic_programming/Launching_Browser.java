package Basic_programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_Browser {

	public static void main(String[] args) throws Throwable{
		
		//Chrome driver
		WebDriverManager.chromedriver().setup();
		//opening Chrome browser
		WebDriver driver = new ChromeDriver();
		//maximizing the browser
		driver.manage().window().maximize();
		//entering the URL
		driver.get("https://www.facebook.com/login");
		//Using getTitle method
		System.out.println(driver.getTitle());
		//Using current URL
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		//closing the program
		driver.close();
		

	}

}
