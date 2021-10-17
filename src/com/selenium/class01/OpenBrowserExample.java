package com.selenium.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserExample {
	public static void main(String[] args) {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize
		driver.manage().window().maximize();
		
		// Loading url in the browser
		driver.get("https://www.ebay.com/");
		
		// Search TV into search box 
		driver.findElement(By.id("gh-ac")).sendKeys("TV");
		
		//click on Search Button
		driver.findElement(By.id("gh-btn")).click();
		
		// Type something into input box
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("TV");
		
	}
}
