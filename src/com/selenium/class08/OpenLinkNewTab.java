package com.selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkNewTab {
	public static void main(String[] args) {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.ebay.com/");

		WebElement signInLink = driver.findElement(By.xpath("// span[@id='gh-ug']//a[text()='Sign in']"));

		Actions action = new Actions(driver);

		action.keyDown(Keys.CONTROL).click(signInLink).keyUp(Keys.CONTROL).build().perform();

	}
}
