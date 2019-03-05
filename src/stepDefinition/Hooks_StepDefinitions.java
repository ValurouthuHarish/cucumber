package stepDefinition;

import cucumber.api.java.*;

public class Hooks_StepDefinitions {
	
	@Before
	public void setup()
	{
		System.out.println("Enter URL");
		//This code will be executed before each senario
	}
	@After
	public void teaddown()
	{
		System.out.println("Close the browser");
	}
}
