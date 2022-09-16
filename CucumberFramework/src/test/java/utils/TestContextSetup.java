package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageobjectmanager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws IOException
	{
		testBase=new TestBase();
		pageobjectmanager=new PageObjectManager(testBase.WebdriverManager());
		genericUtils=new GenericUtils(testBase.WebdriverManager());
	}
}
