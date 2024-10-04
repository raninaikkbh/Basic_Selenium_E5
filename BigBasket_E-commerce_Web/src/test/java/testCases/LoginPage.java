package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginPage extends BaseTest {

	@Test()
	public static void loginTest() throws Throwable {

		// login / signUp

		driver.findElement(By.xpath(loc.getProperty("sign_in"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(loc.getProperty("mob_no"))).sendKeys("7057081674");
		;
		Thread.sleep(3000);

		driver.findElement(By.xpath(loc.getProperty("contiune_btn"))).click();
		Thread.sleep(3000);

		// cancel pop-Up

		driver.findElement(By.xpath(loc.getProperty("cancel_btn"))).click();
		Thread.sleep(3000);

		// select location
		driver.findElement(By.xpath(loc.getProperty("select_loc_btn"))).click();

		driver.findElement(By.xpath(loc.getProperty("pin_code_txtBox"))).sendKeys("411032");
		;
		Thread.sleep(3000);

		driver.findElement(By.xpath(loc.getProperty("Loc_Listbox"))).click();
		Thread.sleep(3000);
	}
}
