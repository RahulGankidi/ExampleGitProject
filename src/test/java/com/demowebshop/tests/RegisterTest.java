package com.demowebshop.tests;

import org.testng.annotations.Test;

import com.demowebshop.pages.BasePage;
import com.demowebshop.pages.RegisterPage;

public class RegisterTest extends BasePage {
	
	RegisterPage registerpage;
	
	@Test
	public void registerintotheDemoShopWebsite() throws InterruptedException {
		registerpage = new RegisterPage(driver);
		registerpage.clickonRegisterLink();
		registerpage.selectGender();
		registerpage.enterFirstname();
		registerpage.enterLastname();
		registerpage.enterEmail();
		registerpage.enterPassword();
		registerpage.enterConfirmpassword();
		Thread.sleep(5000);
		
	}
	

}
