package Scripts;

import org.testng.annotations.Test;

import genericLibarary.BaseClass;
import pomPage.AddtocartPage;
import pomPage.SkillraryDemoLoginPage;
import pomPage.SkillraryLoginPage;

public class TestCase1 extends BaseClass{
	@Test
	
	public void tc1() throws Throwable{
	 SkillraryLoginPage s =new  SkillraryLoginPage(driver);
	 s.gearsbutton();
	 s.skillrarydemoapplication();
	 
	utilies.switchingtabs(driver);
	SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage (driver);
	utilies.mouseHover(driver,sd.getCoursetab());
	sd.Seleniumtrainingtab();
	AddtocartPage d = new AddtocartPage(driver);
	d.Carttocartbtn();
	utilies.alertPopUp(driver);
}
}
