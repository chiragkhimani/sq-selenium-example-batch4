package com.selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassExample {
	public static void main(String[] args) {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.ebay.com/");

		WebElement electronicsLink = driver
				.findElement(By.xpath("//ul[@class='hl-cat-nav__container']/li/a[text()='Electronics']"));

		WebElement appleLink = driver.findElement(By.xpath("//div[@class='hl-cat-nav__sub-cats']//a[text()='Apple']"));

		// Create Object of Action class
		Actions action = new Actions(driver);

		// Move mouse onto element and click on apple link
		action.moveToElement(electronicsLink).pause(1000).click(appleLink).build().perform();
	}
}
