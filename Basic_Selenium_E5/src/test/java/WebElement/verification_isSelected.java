package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verification_isSelected {

	public static void main(String[] args) {
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
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//address of female radio button
		WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
		radio.click();
		if(radio.isSelected()) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
