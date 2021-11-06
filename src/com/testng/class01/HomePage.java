package com.testng.class01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	WebElement homePageItemName;

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	List<WebElement> listOfItems;

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyHomePage() {
		System.out.println(homePageItemName.isDisplayed());
	}

	public void verifyProductDetailPageNavigation() {
		ProductDetailPage pdpPage = new ProductDetailPage(driver);

		for (int i = 0; i < listOfItems.size(); i++) {

			listOfItems.get(i).click();

			pdpPage.verifyPrice();
			pdpPage.verifyTitle();

			driver.navigate().back();

			listOfItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		}
	}
}
