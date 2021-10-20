package com.selenium.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAccountCreation {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");

		WebElement createAccBtn = driver
				.findElement(By.xpath("//div[@class='header__aside__buttons']//a[@data-action='create an account']"));
		createAccBtn.click();

		WebElement firstNameInput = driver.findElement(By.id("firstName"));
		firstNameInput.sendKeys("Chirag");

		WebElement lastNameInput = driver.findElement(By.id("lastName"));
		lastNameInput.sendKeys("Khimani");

		WebElement usernameInput = driver.findElement(By.id("username"));
		usernameInput.sendKeys("C35023Chira9342");

		WebElement passInput = driver.findElement(By.name("Passwd"));
		passInput.sendKeys("Test@123");

		WebElement confirmPassInput = driver.findElement(By.name("ConfirmPasswd"));
		confirmPassInput.sendKeys("Test@123");

		WebElement showPassChkbox = driver.findElement(By.id("i3"));
		showPassChkbox.click();

	}
}
