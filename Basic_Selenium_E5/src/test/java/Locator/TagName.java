package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName {

	public static void main(String[] args) {
		 //Chrome driver
		WebDriverManager.chromedriver().setup();
		//opening Chrome browser
		WebDriver driver = new ChromeDriver();
		//maximizing the browser
		driver.manage().window().maximize();
		//entering the URL
		driver.get("https://www.facebook.com/");
		//addresses of all the links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement b : allLinks) {
			System.out.println(b.getText());
		}

	}

}
