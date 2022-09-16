package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.CheckOutPage;
import io.cucumber.java.en.Then;
import utils.TestContextSetup;

public class CheckOutPageStepDefinitions {
	
	public TestContextSetup testcontextsetup;
	public WebDriver driver;
	public CheckOutPage checkoutpage;
	
	public CheckOutPageStepDefinitions(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		this.checkoutpage=testcontextsetup.pageobjectmanager.getCheckOutPage();
	}
	
	 @Then("^Validate the prodcut name, Apply and Place order buttons$")
	    public void validate_the_prodcut_name_apply_and_place_order_buttons(){
		 
		 String checkoutProductName=checkoutpage.getextractedPrdNameOnCheckout().split("-")[0].trim();
		 System.out.println(checkoutProductName);
		 
		 Assert.assertEquals(testcontextsetup.landingPageProductName, checkoutProductName);
		
		 Assert.assertTrue( checkoutpage.verifyApplyButtonCheckout(), "The apply Button is not enabled");
		 Assert.assertTrue( checkoutpage.verifyPlaceOredrButtonCheckout(), "The Place Order Button is not enabled");
		 
	    }
	

}
