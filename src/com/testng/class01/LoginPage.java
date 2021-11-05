package com.testng.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public void doLogin() {
		WebElement userNameInput = driver.findElement(By.id("user-name"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));

		userNameInput.sendKeys("locked_out_user");
		passwordInput.sendKeys("secret_sauce");
		loginBtn.click();
	}
	
	public void verifyInvalidLoginError() {
		WebElement invalidLoginError = driver.findElement(By.xpath("//div[@class='error-message-container error']/h3"));
		System.out.println(invalidLoginError.isDisplayed());
	}
	
}
