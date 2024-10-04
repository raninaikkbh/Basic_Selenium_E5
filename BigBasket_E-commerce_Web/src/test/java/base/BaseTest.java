package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class BaseTest {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	
	public static FileReader fr;
	public static FileReader fr1;
	
	@BeforeSuite
	
	public void setUp() throws IOException {
		if(driver == null) {
		System.out.println("The path is: " + System.getProperty("user.dir"));
		fr = new FileReader("D://Qspider//BigBasket_E-commerce_Web//src//test//resources//configfiles//config.properties");
		fr1 = new FileReader("D://Qspider//BigBasket_E-commerce_Web//src//test//resources//configfiles//Locators.propertyFile");
		
		prop.load(fr);
		loc.load(fr1);
	}
		if(prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
		}
	}
	
	//Click shop by Categeory(1st)
	
	@Test(priority = 1)
	
	public void SelectFirstItem() throws Throwable {
		driver.findElement(By.xpath("//*[@id='headlessui-menu-button-:R5bclm:']")).click();
		
		WebElement element = driver.findElement(By.xpath("(//*[text()='Fruits & Vegetables'])[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		
		WebElement element1 = driver.findElement(By.xpath("(//*[text()='Exotic Fruits & Veggies'])[2]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(element1).perform();
		Thread.sleep(3000);
		
		WebElement element2 = driver.findElement(By.xpath("//*[text()='Exotic Vegetables']"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(element2).perform();
		Thread.sleep(3000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("(//*[text()='Add'])[3]")).click();
//		Thread.sleep(3000);
		
		WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Add'])[3]")));
		ele.click();
	}
	
@Test(priority = 2)
	
	public void SelectSecondItem() throws Throwable {
		driver.findElement(By.xpath("//*[@id='headlessui-menu-button-:R5bclm:']")).click();
		
		WebElement element3 = driver.findElement(By.xpath("(//*[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions action3 = new Actions(driver);
		action3.moveToElement(element3).perform();
		Thread.sleep(3000);
		
		WebElement element4 = driver.findElement(By.xpath("(//*[text()='Edible Oils & Ghee'])"));
		Actions action4 = new Actions(driver);
		action4.moveToElement(element4).perform();
		Thread.sleep(3000);
		
		WebElement element5 = driver.findElement(By.xpath("(//*[text()='Groundnut Oil'])"));
		Actions action5 = new Actions(driver);
		action5.moveToElement(element5).perform();
		Thread.sleep(3000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("(//*[text()='Add'])[3]")).click();
//		Thread.sleep(3000);
		
		WebElement ele1 = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Add'])[3]")));
		ele1.click();
		ele1.click();
	}

@Test(priority = 3)

public void SelectThirdItem() throws Throwable {
	driver.findElement(By.xpath("//*[@id='headlessui-menu-button-:R5bclm:']")).click();
	
	WebElement element6 = driver.findElement(By.xpath("(//*[text()='Snacks & Branded Foods'])[2]"));
	Actions action6 = new Actions(driver);
	action6.moveToElement(element6).perform();
	Thread.sleep(3000);
	
	WebElement element7 = driver.findElement(By.xpath("(//*[text()='Spreads, Sauces, Ketchup'])"));
	Actions action7 = new Actions(driver);
	action7.moveToElement(element7).perform();
	Thread.sleep(3000);
	
	WebElement element8 = driver.findElement(By.xpath("(//*[text()='Honey'])[5]"));
	Actions action8 = new Actions(driver);
	action8.moveToElement(element8).perform();
	Thread.sleep(3000);
	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.findElement(By.xpath("(//*[text()='Add'])[6]")).click();
//	Thread.sleep(3000);
	
	WebElement ele2 = new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Add'])[3]")));
	ele2.click();
}

@Test(priority = 4)

public void SelectFourthItem() throws Throwable {
	driver.findElement(By.xpath("//*[@id='headlessui-menu-button-:R5bclm:']")).click();
	
	WebElement element9 = driver.findElement(By.xpath("(//*[text()='Baby Care'])[2]"));
	Actions action9 = new Actions(driver);
	action9.moveToElement(element9).perform();
	Thread.sleep(3000);
	
	WebElement element10 = driver.findElement(By.xpath("(//*[text()='Diapers & Wipes'])"));
	Actions action10 = new Actions(driver);
	action10.moveToElement(element10).perform();
	Thread.sleep(3000);
	
	WebElement element11 = driver.findElement(By.xpath("(//*[text()='Diapers'])"));
	Actions action11 = new Actions(driver);
	action11.moveToElement(element11).perform();
	Thread.sleep(3000);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//*[text()='Diaper Pants - Extra Large'])")).click();
	Thread.sleep(3000);
	
	//hamdling new window
	Set<String> windowhandles = driver.getWindowHandles();
	
	Iterator<String> iterator = windowhandles.iterator();
	String parentwindow  = iterator.next();
	System.out.println(parentwindow);
	Thread.sleep(3000);
	
	String childwindow = iterator.next();
	Thread.sleep(3000);
	driver.switchTo().window(childwindow);
	
	//add to basket btn
	driver.findElement(By.xpath("(//*[text()='Add to basket'])[1]")).click();	
	Thread.sleep(3000);
	
	//30 pcs
	driver.findElement(By.xpath("(//*[text()='30 pcs'])")).click();
	
	for(int i =1; i<=5; i++) {
		driver.findElement(By.xpath("(//*[local-name()='g'])[10]")).click();
	}
}

@Test(priority = 5)

public void addcart() throws Throwable {
	
	//wait
	
	WebElement ele3 = new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Add'])[3]")));
	ele3.click();
	
	//after add cart...login/signup 
	
	driver.findElement(By.id("otpEmail")).sendKeys("7057081674");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
	Thread.sleep(3000);
	
	//cancel login page
	driver.findElement(By.xpath("(//*[@type='button'])[1]")).click();
	Thread.sleep(3000);
	
	
	//List of My BAsket
	
	WebElement element12 = driver.findElement(By.xpath("//*[@qa='myBasket']"));
	Actions action12 = new Actions(driver);
	action12.moveToElement(element12).perform();
	element12.click();
	Thread.sleep(3000);
	
	//Checkout button
	driver.findElement(By.xpath("//*[@qa='viewBasketMB']")).click();
	Thread.sleep(3000);
	
	//After click on checkout button...login page
	driver.findElement(By.id("otpEmail")).sendKeys("7057081674");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
	Thread.sleep(3000);
	
	//cancel window
	driver.findElement(By.xpath("(//*[@type='button'])[1]")).click();	
	
}

@AfterSuite

public void tearDown() {
	System.out.println("TearDown Suceessful");
}

}
