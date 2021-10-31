package com.selenium.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.saucedemo.com/");

		// Login Page
		WebElement userNameInput = driver.findElement(By.id("user-name"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.border = '2px solid black'", userNameInput);
		Thread.sleep(4000);
		userNameInput.sendKeys("standard_user");

		Thread.sleep(4000);
		js.executeScript("arguments[0].style.border = '2px solid black'", passwordInput);
		passwordInput.sendKeys("secret_sauce");

		Thread.sleep(4000);
		js.executeScript("arguments[0].style.border = '2px solid black'", loginBtn);
		loginBtn.click();
	}
}
