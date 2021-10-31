package com.selenium.class12;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayAssignment {
	public static void main(String[] args) {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.ebay.co.uk/");

		// Entering TV into search box
		WebElement searchBox = driver.findElement(By.id("gh-ac"));
		searchBox.sendKeys("tv");

		// Click on Search Button
		WebElement searchBtn = driver.findElement(By.id("gh-btn"));
		searchBtn.click();

		// Find list of items elements
		List<WebElement> listOfItems = driver
				.findElements(By.xpath("//div[@id='srp-river-main']//img[@class='s-item__image-img']"));

		// Execute for loop to click on each items
		for (int i = 0; i < listOfItems.size(); i++) {
			listOfItems.get(i).click();

			// Switching to new window
			String currentWindow = driver.getWindowHandle();
			Set<String> listOfWindowsId = driver.getWindowHandles();

			for (String windowId : listOfWindowsId) {
				if (!windowId.equals(currentWindow)) {
					driver.switchTo().window(windowId);
				}
			}

			try {
				// Clicking on complete info link
				WebElement completeInfoLink = driver
						.findElement(By.xpath("//div[@id='bsi-ec']//a[text()='Complete information']"));
				completeInfoLink.click();

				// Print phone number
				WebElement phoneNumber = driver
						.findElement(By.xpath("//span[text()='Phone:']/following-sibling::span"));
				System.out.println("Phone Number =====>" + phoneNumber.getText());

				// Print email address
				WebElement emaildAddress = driver
						.findElement(By.xpath("//span[text()='Email:']/following-sibling::span"));
				System.out.println("Email Number =====>" + emaildAddress.getText());

			} catch (Exception e) {
				System.out.println(i + " doesn't have email or phone");
			}

			driver.close();
			driver.switchTo().window(currentWindow);
		}

	}

	// Switch to new window
	public static String switchToNewWindow(WebDriver driver) {
		String currentWindowID = driver.getWindowHandle();
		Set<String> listOfWindowsId = driver.getWindowHandles();

		for (String windowId : listOfWindowsId) {
			if (!windowId.equals(currentWindowID)) {
				driver.switchTo().window(windowId);
			}
		}
		return currentWindowID;
	}
}
