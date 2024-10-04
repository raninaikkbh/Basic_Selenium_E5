package trinesisTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

		driver.manage().window().maximize();

		// 1st pop-up windows Cancel
		driver.findElement(By.xpath(".//span[text()='✕']")).click();
		Thread.sleep(3000);

		// Click on Sign in
		driver.findElement(By.xpath(".//span[text()='Sign in']")).click();
		Thread.sleep(3000);

		// login data
		driver.findElement(By.xpath("(.//input[@type='text'])[2]")).sendKeys("7057081674");
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//button[text()='Request OTP']")).click();
		Thread.sleep(3000);

		// move cursor electronics menu
		WebElement element = driver.findElement(By.xpath("(.//span[@class='_2I9KP_'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		Thread.sleep(3000);

		// Computer Pheripherals
		driver.findElement(By.xpath(".//a[@title='Computer Peripherals']")).click();
		Thread.sleep(3000);

		// Ink Cartridges
		driver.findElement(By.xpath(".//a[@title='Ink Cartridges']")).click();
		Thread.sleep(3000);

		// after entering OTP verify this button
		driver.findElement(By.xpath(".//button[text()='Verify']")).click();
		Thread.sleep(2000);
	}
}
