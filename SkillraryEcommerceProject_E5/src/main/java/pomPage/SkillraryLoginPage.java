package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {

	//Declaration
	//address of gear Webelement
	@FindBy(xpath="//a[text()' GEARS ']")
	private WebElement gearsbtn;
	
	//address of Skillrary demo
	@FindBy(xpath="(//a[text()=' SkillRary Demo App'])[2]")
	private WebElement skillrarydemoapp;
	
	//address of search text feild
	@FindBy(name="q")
	private WebElement searchtb;
	
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	//initialization
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	public void gearsbutton() {
		gearsbtn.click();
	}
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}
	public void searchTextbox(String name) {
		searchtb.sendKeys(name);
	}
	public void gobutton() {
		searchbtn.click();
	}
	
}
