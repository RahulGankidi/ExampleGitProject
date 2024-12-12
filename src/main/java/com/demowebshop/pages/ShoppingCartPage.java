package com.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
	
WebDriver driver;
	
	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
	}

	By ShoesLink = By.linkText("APPAREL & SHOES");
	By SelectShoe = By.linkText("Blue and green Sneaker");
	By SelectButton = By.id("add-to-cart-button-28");
	By CartLink = By.linkText("Shopping cart");
	By CheckBox = By.id("termsofservice");
	By CheckOutButton = By.id("checkout");
	By GuestButton = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[3]/input[1]");
	
	public void shoesLink() {
		driver.findElement(ShoesLink).click();	}
	public void selectShoe() {
		driver.findElement(SelectShoe).click();
	}
	public void selectButton() {
		driver.findElement(SelectButton).click();
	}
	public void cartLink() {
		driver.findElement(CartLink).click();
	}
	public void checkBox() {
		driver.findElement(CheckBox).click();
	}
	public void checkoutButton() {
		driver.findElement(CheckOutButton).click();
	}
	public void guestButton() {
		driver.findElement(GuestButton).click();
	}
}
