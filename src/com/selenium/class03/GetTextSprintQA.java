package com.selenium.class03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextSprintQA {
	public static void main(String[] args) {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://learning.sprintqa.com/index");

		WebElement announcement = driver.findElement(By.xpath("//div/div[@class='spacer spacer--x2']"));
		System.out.println(announcement.getText());

	}
}
