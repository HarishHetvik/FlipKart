package com.flipkart.stepdefinition;

import com.flipkart.baseclass.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TC2_SearchAndAddtoCart extends Baseclass{


	@When("User search {string} in search box and press enter")
	public void user_search_in_search_box_and_press_enter(String string) {
		getSearchAndAddtoCart().searchProduct(string);
	}
	@When("User click on one search result")
	public void user_click_on_one_search_result() {
		getSearchAndAddtoCart().selectProduct();
	}
	@When("User Add selected laptop to cart")
	public void user_add_selected_laptop_to_cart() {
		getSearchAndAddtoCart().addCart();
	}



}
