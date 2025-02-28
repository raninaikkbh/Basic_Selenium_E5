package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
    //features = {".//Features/LoginFeatures.feature"},
	features = {".//Features/Customers.feature"},
    glue = "StepDefination",
    dryRun = false,
    monochrome = true,
    plugin = {"pretty", "html:target/cucumber-reports/CustReport_html.html"}
    
    //json:target/cucumber-reports/report_json.json
    //junit:target/cucumber-reports/report_xml.xml
    	    
)

public class Run extends AbstractTestNGCucumberTests 
{
    // This class will be empty
}

