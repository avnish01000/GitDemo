package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OffersPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class OffersPageStepDefinition {

	public String offersPageProductName;
    public TestContextSetup testContextSetup;
    public OffersPage offerspage;
	
	public OffersPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.offerspage=testContextSetup.pageobjectmanager.getOffersPage();
	}
	
	
	
	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException {
		
		switchToOffersWindow();
		offerspage.searchItem(shortName);
	    offersPageProductName=offerspage.getProductName();
	   
	}
	
	
	@Then("Validate Product name in offers page matches with landing page")
	public void Validate_Product_name_in_offers_page_matches_with_landing_page()
	{
		Assert.assertEquals(testContextSetup.landingPageProductName, offersPageProductName);
		
	}
	
	public void switchToOffersWindow()
	{
		 
		    
		    LandingPage landingpage=testContextSetup.pageobjectmanager.getLandingPage();
		    landingpage.selectTopDealsPage();
		    testContextSetup.genericUtils.switchWindowToChild();
		
	}

}
