package com.selenium.class11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InClassAssignment2 {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/dynamic_controls");

		WebElement removeBtn = driver.findElement(By.xpath("//form[@id='checkbox-example']/button"));
		WebElement checkBx = driver.findElement(By.xpath("//div[@id='checkbox']/input"));

		removeBtn.click();

		// Create web Element if it is present

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(checkBx));

		System.out.println(isPresent(checkBx));

	}

	public static boolean isPresent(WebElement element) {
		try {
			element.getText();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
