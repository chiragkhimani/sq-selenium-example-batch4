package com.testng.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

	@FindBy(xpath = "//div[contains(@class,'inventory_details_name')]")
	WebElement itemTitle;

	@FindBy(className = "inventory_details_price")
	WebElement itemPrice;

	WebDriver driver;

	public ProductDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyTitle() {
		System.out.println(itemTitle.getText());
	}

	public void verifyPrice() {
		System.out.println(itemPrice.getText());
	}
}
