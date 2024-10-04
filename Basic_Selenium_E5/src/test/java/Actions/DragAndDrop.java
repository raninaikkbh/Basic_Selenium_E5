package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		//setup chrome (Upcasting)
		WebDriverManager.firefoxdriver().setup();
		// opening chrome browser
		WebDriver driver = new FirefoxDriver(); 
		// maximizing the browser 
		driver.manage().window().maximize(); 
		// implicit statement 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		//
		WebElement block1 = driver.findElement(By.xpath("///h1[text()='Block 1']"));
		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(block1,block4).perform();

	}

}
