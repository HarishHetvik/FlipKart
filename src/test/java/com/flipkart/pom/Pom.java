package com.flipkart.pom;

import com.flipkart.pages.TC1_OpenFlipkartWebsite;
import com.flipkart.pages.TC2_SearchAndAddtoCart;
import com.flipkart.pages.TC3_ProceedToChecckout;


public class Pom {
  private TC1_OpenFlipkartWebsite openFlipkartWebsite;
  private TC2_SearchAndAddtoCart searchAndAddtoCart;
  private TC3_ProceedToChecckout proceedToCheckout;

  
public TC3_ProceedToChecckout getProceedToCheckout() {
	return (proceedToCheckout==null)?proceedToCheckout=new TC3_ProceedToChecckout():proceedToCheckout;
}

public TC2_SearchAndAddtoCart getSearchAndAddtoCart() {
	return (searchAndAddtoCart==null)?searchAndAddtoCart=new TC2_SearchAndAddtoCart(): searchAndAddtoCart;
}

public TC1_OpenFlipkartWebsite getOpenFlipkartWebsite() {
	return (openFlipkartWebsite==null)? openFlipkartWebsite= new TC1_OpenFlipkartWebsite():openFlipkartWebsite;
}


}
