package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_over {

	public static void main(String[] args) {
		//setup chrome (Upcasting)
				WebDriverManager.firefoxdriver().setup();
				// opening chrome browser
				WebDriver driver = new FirefoxDriver(); 
				// maximizing the browser 
				driver.manage().window().maximize(); 
				// implicit statement 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				driver.get("https://demoapp.skillrary.com/");
				//address of course web element
				WebElement course = driver.findElement(By.xpath("//a[@id='course']"));
				//address of course of action class
				Actions a = new Actions(driver);
				a.moveToElement(course ).perform();
				//address of selenium training
				driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();

	}

}
