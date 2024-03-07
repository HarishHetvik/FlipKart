package com.flipkart.stepdefinition;



import com.flipkart.baseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass{
  
	@Before
	public void launch() {
		
	}
	@After
	public void close() {
		driver.close();

	}
	
}
