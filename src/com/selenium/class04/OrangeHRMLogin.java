package com.selenium.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement userNameInput = driver.findElement(By.id("txtUsername"));
		userNameInput.sendKeys("admin");

		WebElement passwordInput = driver.findElement(By.id("txtPassword"));
		passwordInput.sendKeys("admin123");

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();

	}
}
