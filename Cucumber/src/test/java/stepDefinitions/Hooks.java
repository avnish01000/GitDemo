package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@Functional")
	public void beforeValidation()
	{
		System.out.println("Hooks Before Validation");
	}
	
	@After("@Functional")
	public void afterValidation()
	{
		System.out.println("Hooks After Validation");
	}

}
