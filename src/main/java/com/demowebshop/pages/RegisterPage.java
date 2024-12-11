package com.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	  WebDriver driver;
		
		public RegisterPage(WebDriver driver) {
			this.driver = driver;
		}
		
		By RegisterLink = By.className("ico-register");
		By Gender = By.id("gender-male");
		By Firstname = By.id("FirstName");
		By Lastname = By.id("LastName");
		By Email = By.id("Email");
		By Password = By.id("Password");
		By Confirmpassword = By.id("ConfirmPassword");
		
		public void clickonRegisterLink() {
			driver.findElement(RegisterLink).click();
		}
		public void selectGender() {
			driver.findElement(Gender).click();
		}
		public void enterFirstname() {
			driver.findElement(Firstname).sendKeys("Ramu");
		}
		public void enterLastname() {
			driver.findElement(Lastname).sendKeys("Rathod");
		}
		public void enterEmail() {
			driver.findElement(Email).sendKeys("ramurathod11@gmail.com");
		}
		public void enterPassword() {
			driver.findElement(Password).sendKeys("Ramu@1234");
		}
		public void enterConfirmpassword() {
			driver.findElement(Confirmpassword).sendKeys("Ramu@1234");
		}
		
}
