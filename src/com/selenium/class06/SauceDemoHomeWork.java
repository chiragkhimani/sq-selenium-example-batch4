package com.selenium.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SauceDemoHomeWork {
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

		userNameInput.sendKeys("standard_user");
		passwordInput.sendKeys("secret_sauce");
		loginBtn.click();

		// Home Page
		WebElement homePageItemName = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		WebElement homePagePrice = driver.findElement(
				By.xpath("//div[text()='Sauce Labs Backpack']/../../..//div[@class='inventory_item_price']"));

		System.out.println(homePageItemName.getText());
		System.out.println(homePagePrice.getText());
		homePageItemName.click();

		Thread.sleep(2000);
		// Product Detail Page
		WebElement pdpPagePrice = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
		WebElement addToCartBtn = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		WebElement cartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		System.out.println(pdpPagePrice.getText());
		addToCartBtn.click();
		cartIcon.click();

		Thread.sleep(2000);
		// Cart page
		WebElement cartPagePrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
		WebElement checkOutBtn = driver.findElement(By.id("checkout"));
		System.out.println(cartPagePrice.getText());
		checkOutBtn.click();

		Thread.sleep(2000);
		// Checkout page
		WebElement firstNameInput = driver.findElement(By.id("first-name"));
		WebElement lastNameInput = driver.findElement(By.id("last-name"));
		WebElement postalCode = driver.findElement(By.id("postal-code"));
		WebElement continueBtn = driver.findElement(By.id("continue"));
		firstNameInput.sendKeys("Test");
		lastNameInput.sendKeys("Automation");
		postalCode.sendKeys("242342");
		continueBtn.click();

		Thread.sleep(2000);
		// Review Page
		WebElement reviewPagePrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
		WebElement reviewPageShippingInfo = driver.findElement(By.xpath("//div[@class='summary_info']"));
		WebElement reviewPageTax = driver.findElement(By.xpath("//div[@class='summary_tax_label']"));
		WebElement reviewPageTotalPrice = driver.findElement(By.xpath("//div[@class='summary_total_label']"));
		WebElement finishBtn = driver.findElement(By.id("finish"));
		System.out.println(reviewPagePrice.getText());
		System.out.println(reviewPageShippingInfo.getText());
		System.out.println(reviewPageTax.getText());
		System.out.println(reviewPageTotalPrice.getText());
		finishBtn.click();

		Thread.sleep(2000);
		// Confirmation Page
		WebElement confirmationPageHeader = driver.findElement(By.xpath("//h2[@class='complete-header']"));
		WebElement confirmationPageDescription = driver.findElement(By.xpath("//div[@class='complete-text']"));
		System.out.println(confirmationPageHeader.getText());
		System.out.println(confirmationPageDescription.getText());

		driver.close();
	}
}
