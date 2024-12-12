package com.demowebshop.tests;

import org.testng.annotations.Test;

import com.demowebshop.pages.BasePage;
import com.demowebshop.pages.WishlistPage;

public class WishlistTest extends BasePage {
	
	WishlistPage wishlistpage;
	
	@Test
	
	public void openWishlistPage() throws InterruptedException {
		wishlistpage = new WishlistPage(driver);
		wishlistpage.digitaldownloadsLink();
		Thread.sleep(2000);
		wishlistpage.selectingAlbum();
		Thread.sleep(2000);
		wishlistpage.clickonButton();
		Thread.sleep(3000);
		wishlistpage.openWishlistLink();
		Thread.sleep(2000);
		wishlistpage.updateWishlist();
		Thread.sleep(5000);
	}
	
	

}
