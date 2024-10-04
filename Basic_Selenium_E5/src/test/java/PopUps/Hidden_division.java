package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_division {

	public static void main(String[] args) {
		//setup chrome (Upcasting)
				WebDriverManager.firefoxdriver().setup();
				// opening chrome browser
				WebDriver driver = new FirefoxDriver(); 
				// maximizing the browser 
				driver.manage().window().maximize(); 
				// implicit statement 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.redbus.in/");
				//address of date
				driver.findElement(By.xpath("//span[text()='Date']")).click();
				
				driver.findElement(By.xpath("//div[text()='Aug']/../../..//span[text()='28']")).clear();

	}

}
