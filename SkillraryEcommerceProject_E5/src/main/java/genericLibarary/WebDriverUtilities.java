package genericLibarary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

	// 1. Handling drop down

	public void dropDown(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}

	// 2.Handling mouse over

	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

	// 3.Handling double click
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}

	// 4.Handling Right click
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}

	// 5.Handling drag and drop
	public void dragdrop(WebDriver driver, WebElement src, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}

	// 6.Shifting control to frame
	public void switchFrame(WebDriver driver, String value) {
		driver.switchTo().frame(value);
	}

	// 7.Shifting control to normal to pop up

	public void switchbackframe(WebDriver driver) {
		((TargetLocator) driver.switchTo().alert()).defaultContent();
	}

	// 8.Shifting control to op up
	public void alertPopUp(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	// 9.Shifting control to child window

	public void switchingtabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for (String b : child) {
			driver.switchTo().window(b);
		}
	}

	// 10.Hamdling scroll bar

	public void scrollBar(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy(" + x + "," + y + ")");
	}

}
