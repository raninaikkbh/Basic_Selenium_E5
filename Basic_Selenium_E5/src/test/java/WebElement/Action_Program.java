package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Program {

	public static void main(String[] args) throws Throwable {
		
		  //Chrome driver
		WebDriverManager.firefoxdriver().setup();
		//opening Chrome browser
		WebDriver driver = new FirefoxDriver();
		//maximizing the browser
		driver.manage().window().maximize();
		//implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//entering the URL
		driver.get("https://www.facebook.com/");
		//address of email text feild
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("Hiiii");
		Thread.sleep(3000);
		ele.clear();
		driver.close();

	}

}
