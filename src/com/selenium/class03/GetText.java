package com.selenium.class03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
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

		WebElement searchBtn = driver.findElement(By.id("gh-btn"));
		searchBtn.click();

		List<WebElement> itemPrices = driver.findElements(By.xpath("//span[@class='s-item__price']"));
		System.out.println(itemPrices.size());
		
		for (WebElement ele : itemPrices) {
			System.out.println(ele.getText());
		}

	}
}
