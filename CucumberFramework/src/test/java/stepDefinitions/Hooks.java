package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	
	TestContextSetup testcontextsetup;
	
	public Hooks(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}
	
	@After
	public void AfterScenarioExecution() throws IOException
	{
		testcontextsetup.testBase.WebdriverManager().quit();
	}
	
	@AfterStep
	public void attachScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver=testcontextsetup.testBase.WebdriverManager();
		if(scenario.isFailed())
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(src);
			scenario.attach(fileContent, "image/png", "Image");
		}
	}

}
