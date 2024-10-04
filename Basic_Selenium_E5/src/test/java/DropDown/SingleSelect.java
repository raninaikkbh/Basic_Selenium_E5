package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSelect {

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
				//address of dropDown
				WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
				//crate an object for select class
				Select s = new Select(dropDown);
				s.selectByIndex(4);
				Thread.sleep(3000);
				s.selectByValue("search-alias=stripbooks");
				Thread.sleep(3000);
				s.selectByVisibleText("Furniture");
				//getting all the values from drop down
				List<WebElement>values = s.getOptions();
				System.out.println(values.size());
				for(WebElement b : values) {
					System.out.println(b.getText());
				}
				driver.quit();
	}

}
