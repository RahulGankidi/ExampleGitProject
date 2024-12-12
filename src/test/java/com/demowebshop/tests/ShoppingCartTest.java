package com.demowebshop.tests;

import org.testng.annotations.Test;

import com.demowebshop.pages.BasePage;
import com.demowebshop.pages.ShoppingCartPage;

public class ShoppingCartTest extends BasePage {
	
ShoppingCartPage shoppingcartpage;
	
	@Test
	public void shoppingCart() throws InterruptedException {
		shoppingcartpage = new ShoppingCartPage(driver);
		shoppingcartpage.shoesLink();
		Thread.sleep(3000);
		shoppingcartpage.selectShoe();
		Thread.sleep(3000);
		shoppingcartpage.selectButton();
		Thread.sleep(3000);
		shoppingcartpage.cartLink();
		shoppingcartpage.checkBox();
		shoppingcartpage.checkoutButton();
		Thread.sleep(3000);
		shoppingcartpage.guestButton();
		Thread.sleep(5000);
		
	}

}
