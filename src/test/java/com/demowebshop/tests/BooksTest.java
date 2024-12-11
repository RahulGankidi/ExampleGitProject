package com.demowebshop.tests;

import org.testng.annotations.Test;

import com.demowebshop.pages.BasePage;
import com.demowebshop.pages.BooksPage;

public class BooksTest extends BasePage {
	
	BooksPage bookspage;
	
	@Test
	
	public void selectBooksLink() throws InterruptedException {
		bookspage = new BooksPage(driver);
		bookspage.clickonBooksLink();
		bookspage.selectBook();
		Thread.sleep(5000);
		
	}
	

}
