package Scripts;

import org.testng.annotations.Test;

import genericLibarary.BaseClass;
import pomPage.SkillraryDemoLoginPage;
import pomPage.SkillraryLoginPage;
import pomPage.TestingPage;

public class TestCase2  extends BaseClass{
	@Test
	public void tc2() throws Throwable
	{
		
		 SkillraryLoginPage s =new  SkillraryLoginPage(driver);
		 s.gearsbutton();
		 s.skillrarydemoapplication();
		 
		 SkillraryDemoLoginPage sd =new SkillraryDemoLoginPage(driver);
		 utilies.switchingtabs(driver);
		 utilies.dropDown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
		 TestingPage tp = new TestingPage(driver);
		 utilies.dragdrop(driver, tp.getSeleniumtraining(), tp.getCarttab());
	}
	}
