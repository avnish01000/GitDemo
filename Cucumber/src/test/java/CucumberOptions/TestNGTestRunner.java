package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinitions")

public class TestNGTestRunner extends AbstractTestNGCucumberTests {
//Have removed TestNG dependency in POM.xml
}
