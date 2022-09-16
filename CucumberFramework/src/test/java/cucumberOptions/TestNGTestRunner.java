package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="stepDefinitions",
monochrome=true, tags="@PlaceOrder or @OffersPage", plugin= {"pretty","html:target/cucumber.html", "json:target/cucumber.json",
		"rerun:target/failedList.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}


//Glue it will automatically take src/test/java for location from features and check in that folder only.
