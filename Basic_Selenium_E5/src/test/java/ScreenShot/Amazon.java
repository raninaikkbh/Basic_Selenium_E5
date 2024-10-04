package ScreenShot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		//setup chrome (Upcasting)
				WebDriverManager.firefoxdriver().setup();
				// opening chrome browser
				WebDriver driver = new FirefoxDriver(); 
				// maximizing the browser 
				driver.manage().window().maximize(); 
				// implicit statement 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				driver.get("https://www.amazon.in/");
				//downcasting Statment
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest  = new File("./Screenshots/amazon1.png");
				FileUtils.copyFile(src, dest);
				driver.quit();

	}

}
