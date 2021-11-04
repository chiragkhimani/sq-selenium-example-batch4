package com.testng.class01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceNavigationTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// Loading url in the browser
		driver.get("https://www.saucedemo.com/");
	}

	@Test(groups = {"Smoke", "Chirag", "Navigation"})
	public void verifyUserCanNavigateToProductDetailPageFromHomePage() {
		WebElement userNameInput = driver.findElement(By.id("user-name"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));

		userNameInput.sendKeys("standard_user");
		passwordInput.sendKeys("secret_sauce");
		loginBtn.click();

		List<WebElement> listOfItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

		for (int i = 0; i < listOfItems.size(); i++) {

			listOfItems.get(i).click();

			WebElement itemTitle = driver.findElement(By.xpath("//div[contains(@class,'inventory_details_name')]"));
			System.out.println(itemTitle.getText());

			WebElement itemPrice = driver.findElement(By.className("inventory_details_price"));
			System.out.println(itemPrice.getText());

			driver.navigate().back();

			listOfItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		}
	}

	@AfterMethod
	public void cleanUp() {
		driver.close();
	}

}
