package com.selenium.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/windows");

		String currentWindowID = driver.getWindowHandle();

		WebElement clickHereLink = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHereLink.click();

		Set<String> listOfWindowsId = driver.getWindowHandles();

		for (String windowId : listOfWindowsId) {
			if (!windowId.equals(currentWindowID)) {
				driver.switchTo().window(windowId);
			}
		}

		System.out.println(driver.findElement(By.xpath("//h3")).getText());

		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(currentWindowID);

		Thread.sleep(3000);

		driver.close();

	}
}
