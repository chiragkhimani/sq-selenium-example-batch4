package com.testng.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void doLogin(String username, String password) {
		WebElement userNameInput = driver.findElement(By.id("user-name"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));

		userNameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		loginBtn.click();
	}

	public void verifyInvalidLoginError() {
		WebElement invalidLoginError = driver.findElement(By.xpath("//div[@class='error-message-container error']/h3"));
		System.out.println(invalidLoginError.isDisplayed());
	}

}
