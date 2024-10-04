package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {

	// Declaration
	// address of + icon
	@FindBy(id = "add")
	private WebElement addbtn;
	// address of add to cart button
	@FindBy(xpath = "//button[text()=' Add to cart']")
	private WebElement cartbtn;

	// initialization
	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// utilization

	public WebElement getAddbtn() {
		return addbtn;
	}

	public void Carttocartbtn() {
		cartbtn.click();
	}

}
