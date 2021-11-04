package com.testng.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceLoginTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.saucedemo.com/");
	}

	@Test(groups = { "Regression", "Umed", "Login" })
	public void verifyUserCannotDoLoginWithInvalidCred() {
		// Login Page
		WebElement userNameInput = driver.findElement(By.id("user-name"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));

		userNameInput.sendKeys("locked_out_user");
		passwordInput.sendKeys("secret_sauce");
		loginBtn.click();

		// Home Page
		WebElement invalidLoginError = driver.findElement(By.xpath("//div[@class='error-message-container error']/h3"));
		System.out.println(invalidLoginError.isDisplayed());
	}

	@Test(groups = { "Regression", "Login" })
	public void verifyUserCanAbleToLogin() {
		// Login Page
		WebElement userNameInput = driver.findElement(By.id("user-name"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));

		userNameInput.sendKeys("standard_user");
		passwordInput.sendKeys("secret_sauce");
		loginBtn.click();

		// Home Page
		WebElement homePageItemName = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		System.out.println(homePageItemName.isDisplayed());
	}

	@AfterMethod
	public void cleanUp() {
		driver.close();
	}

}
