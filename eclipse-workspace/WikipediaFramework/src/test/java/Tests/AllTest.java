package Tests;

import org.testng.annotations.Test;

import Pages.LogOutPage;
import Pages.LoginPage;
import Pages.searchTextPage;
import io.appium.java_client.android.AndroidDriver;

public class AllTest extends BaseClass {

	@Test(priority = 1)
	public void login() throws InterruptedException {

		// initialized AndroidDriver
		AndroidDriver driver = getDriver();

		LoginPage login = new LoginPage(driver);

		login.clickOnMoreOption();
		login.clickOnAcc();
		login.Username();
		login.Password();
		login.LoginBtn();
		Thread.sleep(6000);

	}

	//@Test(priority = 2)
	public void search() {

		// initialized AndroidDriver
		AndroidDriver driver = getDriver();

		searchTextPage search = new searchTextPage(driver);

		search.searchTxtBox();
		search.suggestionText();
		search.ClickOnGoBackBtn();
		search.ClickOnSelectLanguage();
		search.myList();
		search.History();
		search.NearBy();
		search.Explore();
	}

	@Test(priority = 2)
	public void log() throws InterruptedException {

		// initialized AndroidDriver
		AndroidDriver driver = getDriver();

		LogOutPage logout = new LogOutPage(driver);

		logout.clickOnMoreOption();
		logout.clickOnSetting();
		logout.clickOnMoreOption();
		logout.clickOnLogOut();
		Thread.sleep(3000);
	}
}
