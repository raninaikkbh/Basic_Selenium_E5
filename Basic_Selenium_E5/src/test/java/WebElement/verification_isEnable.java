package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verification_isEnable {

	public static void main(String[] args) {
		 //Chrome driver
		WebDriverManager.firefoxdriver().setup();
		//opening Chrome browser
		WebDriver driver = new FirefoxDriver();
		//maximizing the browser
		driver.manage().window().maximize();
		//implicit statement
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//entering the URL
		driver.get("https://www.facebook.com/");
		//address of email text feild
	 driver.findElement(By.id("email")).sendKeys("hjhbhgfth");
	 driver.findElement(By.name("pass")).sendKeys("vbhgvdxh");
	 WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
	 if(button.isEnabled()) {
		 System.out.println("pass");
		 button.click();
	 }
	 else {
		 System.out.println("fail");
	 }

	}

}
