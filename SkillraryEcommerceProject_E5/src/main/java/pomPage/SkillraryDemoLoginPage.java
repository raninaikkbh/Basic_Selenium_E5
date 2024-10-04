package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {

	// Declaration
	// address of course
	@FindBy(id = "course")
	private WebElement coursetab;
	
	// address of selenium Training
	@FindBy(xpath = "(//a[text()='Selenium Training'])[1]")
	private WebElement Seleniumtraining;
	
	// address of dropdown
	@FindBy(name = "addresstype")
	private WebElement coursedd;

	// initialization
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// utilization

	public WebElement getCoursetab() {
		return coursetab;
	}

	public void Seleniumtrainingtab() {
		Seleniumtraining.click();
		;
	}

	public WebElement getCoursedd() {
		return coursedd;
	}

}
