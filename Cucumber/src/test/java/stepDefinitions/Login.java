package stepDefinitions;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
	@Given("^Launch Google$")
    public void launch_google() throws Throwable {
      System.out.println("Given Executed");
    }

    @When("^Enter Selenium in search Box$")
    public void enter_selenium_in_search_box() throws Throwable {
    	System.out.println("When Executed");
    }

    @Then("^Results are displayed$")
    public void results_are_displayed() throws Throwable {
    	System.out.println("Then Executed");
    }
    
    @When("^Eneter \"([^\"]*)\" in search box$")
    public void eneter_something_in_search_box(String strArg1) throws Throwable {
        System.out.println("This is "+strArg1+" Regular Expression Example");
    }

    
   //DataTable Implementation
  /*  @Given("^Launch Form$")
    public void launch_form() throws Throwable {
       System.out.println("This is Launch Form");
    }*/

    @When("^Enter Below USer Details$")
    public void enter_below_user_details(DataTable data) throws Throwable {
      
    	List<List<String>> obj=data.cells();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    }

    @Then("^Form is submitted successfully$")
    public void form_is_submitted_successfully() throws Throwable {
    	System.out.println("This is Form Submitted");
    }

    @And("^Click Submit Button$")
    public void click_submit_button() throws Throwable {
    	System.out.println("This is AND Submite Button");
    }
    
    
    //Using Scenario Outline to parameterize test cases
    @Given("^Launch Login Page$")
    public void launch_login_page() throws Throwable {
      System.out.println("Login page is launched");
    }

    @When("^Enter (.+) and (.+)$")
    public void enter_and(String username, String password) throws Throwable {
    	System.out.println("Username:"+username+" Password:"+password);
    }

    @Then("^Verify Login is successful$")
    public void verify_login_is_successful() throws Throwable {
    	System.out.println("Login is successful");
        
    }

  //Background stepDefinitions
    @Given("^Backgroun1$")
    public void backgroun1() throws Throwable {
        System.out.println("Background1");
    }

    @When("^Background2$")
    public void background2() throws Throwable {
    	System.out.println("Background2");
    }

    @Then("^Background3$")
    public void background3() throws Throwable {
    	System.out.println("Background3");
    }

	    
}
