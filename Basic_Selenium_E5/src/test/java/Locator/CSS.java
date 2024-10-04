package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS {

	public static void main(String[] args) throws Throwable {
		 //Chrome driver
		WebDriverManager.chromedriver().setup();
		//opening Chrome browser
		WebDriver driver = new ChromeDriver();
		//maximizing the browser
		driver.manage().window().maximize();
		//entering the URL
		driver.get("https://www.facebook.com/");
		//address of emailtextfeild
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("hii");
		//address of password textfeild
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Hello");
		Thread.sleep(3000);
		driver.quit();

	}

}
