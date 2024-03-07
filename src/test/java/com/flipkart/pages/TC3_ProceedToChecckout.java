package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.baseclass.Baseclass;

public class TC3_ProceedToChecckout extends Baseclass{
   
	

	public TC3_ProceedToChecckout() {
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(xpath="//*[@class='_2-uG6-']")
	private WebElement vrfyProduct;
	
	@FindBy(xpath ="//*[text()='Place Order']")
	private WebElement clkPlOdr;

	@FindBy(xpath="//*[@class='YUhWwv']")
	private WebElement clkCart;
	
	public WebElement getClkCart() {
		return clkCart;
	}

	

	public WebElement getClkPlOdr() {
		return clkPlOdr;
	}

	public WebElement getVrfyProduct() {
		return vrfyProduct;
	}
		
	public String verifyProduct(){
		refresh();
		return getTexts(vrfyProduct).substring(0,45);	
	}
	public void clickCart() {
		refresh();
		elementClick(clkCart);
	}
	public void clickProceed() {
		elementClick(clkPlOdr);
	}
}
