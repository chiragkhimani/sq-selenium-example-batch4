package com.selenium.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement userNameInput = driver.findElement(By.id("txtUsername"));
		userNameInput.sendKeys("AdminAdminAdmin");
		Thread.sleep(3000);
		System.out.println("====>" + userNameInput.getAttribute("value"));
		Thread.sleep(3000);
		userNameInput.clear();

	}
}
