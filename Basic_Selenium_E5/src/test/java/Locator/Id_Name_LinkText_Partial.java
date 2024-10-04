package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name_LinkText_Partial {

	public static void main(String[] args) throws Throwable {
		 //Chrome driver
		WebDriverManager.chromedriver().setup();
		//opening Chrome browser
		WebDriver driver = new ChromeDriver();
		//maximizing the browser
		driver.manage().window().maximize();
		//entering the URL
		driver.get("https://www.facebook.com/");
		//address of email text feild
		driver.findElement(By.id("email")).sendKeys("rani");
		//address of password text feild
		driver.findElement(By.name("pass")).sendKeys("ranipassword");
		Thread.sleep(3000);
		//address of link using link text method
		driver.findElement(By.linkText("Forgotten password?")).click();
		//address of link by using partial link text
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
