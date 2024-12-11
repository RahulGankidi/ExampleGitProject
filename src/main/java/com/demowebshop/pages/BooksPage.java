package com.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BooksPage {
	
WebDriver driver;
	
	public BooksPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By BooksLink = By.linkText("Books");
	By Selectbook = By.linkText("Fiction");
	
	public void clickonBooksLink() {
		driver.findElement(BooksLink).click();
	}
	public void selectBook() {
		driver.findElement(Selectbook).click();
	}

}
