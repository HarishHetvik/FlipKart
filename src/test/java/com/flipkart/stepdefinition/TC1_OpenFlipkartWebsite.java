package com.flipkart.stepdefinition;

import org.junit.Assert;

import com.flipkart.baseclass.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class TC1_OpenFlipkartWebsite extends Baseclass {


	@Given("User is on flipkart page using {string} browser")
	public void user_is_on_flipkart_page_using_browser(String string) {

		browserLaunch(string);
		enterUrl("https://www.flipkart.com/");
		implicityWait();
	}
	
	@Then("User should verify success message {string}")
	public void user_should_verify_success_message(String string) {
		
		// getting title here and then asserting to check whether we get expexted result or not
		
		String verifyFlipcart = getOpenFlipkartWebsite().verifyFlipcart();
		boolean contains = verifyFlipcart.contains(string);
		Assert.assertTrue("Verify flipkart page",contains);
		
	}



}
