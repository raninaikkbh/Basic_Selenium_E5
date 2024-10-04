package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	// Declaration
	// address of selenium Training
	@FindBy(xpath = "(//a[text()='Selenium Training'])[2]")
	private WebElement Seleniumtraining;

	@FindBy(id = "mycart")
	private WebElement carttab;

	@FindBy(xpath = "(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;

	// initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// utilization

	public WebElement getSeleniumtraining() {
		return Seleniumtraining;
	}

	public WebElement getCarttab() {
		return carttab;
	}

	public void Facebookicon() {
		facebook.click();
		;
	}

}
