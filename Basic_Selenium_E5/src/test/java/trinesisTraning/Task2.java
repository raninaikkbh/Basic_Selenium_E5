package trinesisTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.bigbasket.com/");

		driver.findElement(By.xpath(".//button[text()='Login/ Sign Up']")).click();
		Thread.sleep(3000);


//		// 1st pop-up windows Cancel
//		driver.findElement(By.xpath(".//span[text()='✕']")).click();
//		Thread.sleep(3000);

		//Enter mob.no
		driver.findElement(By.id("multiform")).sendKeys("7057081674");
		Thread.sleep(3000);

		
	}

}
