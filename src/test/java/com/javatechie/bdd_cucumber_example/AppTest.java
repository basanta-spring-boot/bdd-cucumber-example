package com.javatechie.bdd_cucumber_example;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Unit test for simple App.
 */
/*@RunWith(Cucumber.class)
@CucumberOptions(features = "Senario")*/
public class AppTest {

	App app = null;
	String response = "";

	@Given("^Test my find even odd method$")
	public void test_my_find_even_odd_method() throws Throwable {
		app = new App();
	}

	@When("^I will pass (\\d+)$")
	public void i_will_pass(int arg1) throws Throwable {
		response = app.find(arg1);
	}

	@Then("^output should be even$")
	public void output_should_be_even() throws Throwable {
		Assert.assertEquals("even", response);
	}
	@Then("^output should be odd$")
	public void output_should_be_odd() throws Throwable {
		Assert.assertEquals("odd", response);
	}
}