package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TaggedHooksSD {
	//Global Hooks:
	@Before(order=0)
	public void setup()
	{
		System.out.println("Enter URL");
		//This code will be executed before each senario
	}
	@After(order=0)
	public void teaddown()
	{
		System.out.println("Close the browser");
	}
	//Local Only for First Scenario
	@Before("@First")
	public void setup1()
	{
		System.out.println("Enter URL");
		//This code will be executed before each senario
	}
	@After("@First")
	public void teaddown1()
	{
		System.out.println("Close the browser");
	}

}
