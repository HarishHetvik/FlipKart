package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.baseclass.Baseclass;

public class TC1_OpenFlipkartWebsite  extends Baseclass {

	public TC1_OpenFlipkartWebsite() {
		PageFactory.initElements(driver,this);
	}
//==========================WebElements===========================//	
	@FindBy(xpath = "(//*[@title='Flipkart'])[3]")
	private WebElement VrfyFK;
//========================== getters===========================//	
	public WebElement getVrfyFK() {
		return VrfyFK;
	}
//===========================Logics=============================//
 
	public String verifyFlipcart() {
		
		return driver.getTitle();
	}
	
}
