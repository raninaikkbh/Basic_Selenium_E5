package Frames;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal_Frame {

	public static void main(String[] args) throws Throwable {
		//setup chrome (Upcasting)
		WebDriverManager.firefoxdriver().setup();
		// opening chrome browser
		WebDriver driver = new FirefoxDriver(); 
		// maximizing the browser 
		driver.manage().window().maximize(); 
		// implicit statement 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://www.snapdeal.com/");
		//addressof sign in
		WebElement signIn = driver.findElement(By.xpath("//span[text()='sign In']"));
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		//address of register
		driver.findElement(By.xpath("//span[text()='Register']) [1]")).click();
		//shifting control to Frame
		driver.switchTo().frame("loginframe");
		//address of mobile text feild
		driver.findElement(By.xpath("//input[@placeholder='Moboile Number/ Email']")).sendKeys("12345678");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		//shift our control back to normal web page
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@placeholder='Search product & brands']")).sendKeys("dskjhdj");		}

}
