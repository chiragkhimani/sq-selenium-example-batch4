package com.testng.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductDetailPage {
	public void verifyTitle() {
		WebElement itemTitle = driver.findElement(By.xpath("//div[contains(@class,'inventory_details_name')]"));
		System.out.println(itemTitle.getText());
	}

	public void verifyPrice() {
		WebElement itemPrice = driver.findElement(By.className("inventory_details_price"));
		System.out.println(itemPrice.getText());
	}
}
