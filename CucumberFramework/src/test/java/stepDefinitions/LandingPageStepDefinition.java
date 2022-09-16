package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class LandingPageStepDefinition {

	public WebDriver driver;
	public String landingPageProductName;
	public String offersPageProductName;
	LandingPage landing;
	public TestContextSetup testContextSetup;
	
	public LandingPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.landing=testContextSetup.pageobjectmanager.getLandingPage();
	}
	
	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() {
	    
		Assert.assertTrue(landing.verifyLandingPage().contains("GreenKart"));
	}
	
	
	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
		
	   landing.searchItem(shortName);
	   Thread.sleep(3000);
	   testContextSetup.landingPageProductName= landing.getProductName().split("-")[0].trim();
	  
	}
	
	 @When("added the product to cart after increasing the quantity to {string} and proceed to checkout page from Cart")
	    public void added_the_product_to_cart_after_increasing_the_quantity_and_proceed_to_checkout_page_from_cart(String quantity) throws InterruptedException{
		 
		 
		  landing.selectQuantity(quantity);
		  Thread.sleep(2000);
		 
		 landing.selectProductAddToCart();
		 landing.selectCartIcon();
		 landing.selectcartProceedCheckout();
		 
	    }

	
	

	
	

}
