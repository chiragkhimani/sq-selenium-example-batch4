package com.selenium.class03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.ebay.com/");

		WebElement searchBox = driver.findElement(By.id("gh-ac"));
		searchBox.sendKeys("TV");

		WebElement searchBtn = driver.findElement(By.id("gh-btn3543"));
		searchBtn.click();

		List<WebElement> items = driver.findElements(By.xpath("//h3[@class='s-item__title2322']"));
		System.out.println(items.size());
	}
}
