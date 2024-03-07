package com.flipkart.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.baseclass.Baseclass;

public class TC2_SearchAndAddtoCart extends Baseclass {
	
public static String texts;
	
public TC2_SearchAndAddtoCart()  {
		PageFactory.initElements(driver, this);
	}
//=========================WebElement=========================================//
@FindBy(xpath="//*[@class='Pke_EE']")
private WebElement srchBox;

@FindBy(xpath="(//*[@class='_1AtVbE col-12-12'])[3]")
private WebElement clkResult;

@FindBy(xpath="(//*[@class='_4rR01T'])[1]")
private WebElement lapName;

public WebElement getSrchBox() {
	return srchBox;
}
public WebElement getClkResult() {
	return clkResult;
}

public static String getTexts() {
	return texts;
}
public WebElement getLapName() {
	return lapName;
}
public WebElement getClkAddCart() {
	return clkAddCart;
}
public WebElement getClkLogin() {
	return clkLogin;
}
@FindBy(xpath="//*[text()='Add to cart']")
private WebElement clkAddCart;


@FindBy(xpath="//*[text()='Login']") 
private WebElement clkLogin;


//============================logics======================================//

public void searchProduct(String product) {
	elementClick(srchBox);
	srchBox.sendKeys(product,Keys.ENTER);
}
public void selectProduct() {
	 texts = getTexts(lapName);

	elementClick(clkResult);
}
public void addCart() {
	windowHandle();
	refresh();
	elementClick(clkAddCart);
}




}
