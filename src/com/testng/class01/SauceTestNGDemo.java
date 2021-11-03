package com.testng.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceTestNGDemo {

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

	@Test
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
