package com.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {
	
WebDriver driver;
	
	public WishlistPage(WebDriver driver) {
		this.driver = driver;
	}

	By SelectDigital = By.linkText("Digital downloads");
	By SelectAlbum = By.linkText("Music 2");
	By WishlistButton = By.id("add-to-wishlist-button-51");
	By WishlistLink = By.className("ico-wishlist");
	By UpdateWishlist = By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/div/div/input[1]");
	
	public void digitaldownloadsLink() {
		driver.findElement(SelectDigital).click();
	}
	public void selectingAlbum() {
		driver.findElement(SelectAlbum).click();
	}
	public void clickonButton() {
		driver.findElement(WishlistButton).click();
	}
	public void openWishlistLink() {
		driver.findElement(WishlistLink).click();
	}
	public void updateWishlist() {
		driver.findElement(UpdateWishlist).click();
	}
}
