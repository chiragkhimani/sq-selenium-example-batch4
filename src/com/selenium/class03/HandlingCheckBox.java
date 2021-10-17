package com.selenium.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {
	public static void main(String[] args) {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.ebay.com/sch/ebayadvsearch?_from=R40&_trksid=p2380057.m570.l1313&_nkw=TV&_sacat=0");

		WebElement titleCheckBox = driver.findElement(By.xpath("//input[@id='LH_TitleDesc']"));

		System.out.println(titleCheckBox.isSelected()); // false
		titleCheckBox.click();
		System.out.println(titleCheckBox.isSelected()); // true

		WebElement listComplete = driver.findElement(By.id("LH_Complete"));
		System.out.println(listComplete.isEnabled()); // false

		WebElement auctionChkBx = driver.findElement(By.id("LH_Auction"));
		auctionChkBx.click();

		WebElement buyItNwChkBx = driver.findElement(By.id("LH_BIN"));
		buyItNwChkBx.click();

	}
}
