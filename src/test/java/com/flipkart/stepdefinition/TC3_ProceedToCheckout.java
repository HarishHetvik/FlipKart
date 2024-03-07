package com.flipkart.stepdefinition;

import org.junit.Assert;

import com.flipkart.baseclass.Baseclass;
import com.flipkart.pages.TC2_SearchAndAddtoCart;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_ProceedToCheckout extends Baseclass{


	@When("User navigate to Add to cart")
	public void user_navigate_to_add_to_cart() {
           getProceedToCheckout().clickCart();
	}
	@Then("User should verify correct item in the cart")
	public void user_should_verify_correct_item_in_the_cart() {
		boolean contains = TC2_SearchAndAddtoCart.texts.contains(getProceedToCheckout().verifyProduct());
		
	Assert.assertTrue("verify product on card",contains);
	}
	
	@When("User click on the Proceed to Checkout button.")
	public void user_click_on_the_proceed_to_checkout_button() {
      getProceedToCheckout().clickProceed();
	}



}
