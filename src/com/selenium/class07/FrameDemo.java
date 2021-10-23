package com.selenium.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameDemo {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/iframe");

		// Switching to Iframe
		driver.switchTo().frame("mce_0_ifr");

		// Complete task inside Iframe
		WebElement textBox = driver.findElement(By.id("tinymce"));
		textBox.clear();
		textBox.sendKeys("Hi Umed! We need to do this way....");

		// Switch to main content
		driver.switchTo().defaultContent();

		// Continue to do action in the main page
		WebElement header = driver.findElement(By.xpath("//h3"));
		System.out.println(header.getText());

	}
}
