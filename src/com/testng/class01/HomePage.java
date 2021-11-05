package com.testng.class01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyHomePage() {
		WebElement homePageItemName = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		System.out.println(homePageItemName.isDisplayed());
	}

	public void verifyProductDetailPageNavigation() {
		ProductDetailPage pdpPage = new ProductDetailPage(driver);

		List<WebElement> listOfItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

		for (int i = 0; i < listOfItems.size(); i++) {

			listOfItems.get(i).click();

			pdpPage.verifyPrice();
			pdpPage.verifyTitle();

			driver.navigate().back();

			listOfItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		}
	}
}
