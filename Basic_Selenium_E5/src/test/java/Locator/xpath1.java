package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath1 {

	public static void main(String[] args) throws Throwable {
		 //Chrome driver
		WebDriverManager.firefoxdriver().setup();
		//opening Chrome browser
		WebDriver driver = new FirefoxDriver();
		//maximizing the browser
		driver.manage().window().maximize();
		//entering the URL
		driver.get("https://www.facebook.com/");
		//address of email text feild using xpath attribute
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Hii");
	    //address of Password text feild using xpath attribute
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("Hello");
		Thread.sleep(3000);
		//address of forgotten password using xpath text
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

}

//Assignment: Open gmail login page and inspect username and password textfield only using xpath and click on login(also using xpath)
