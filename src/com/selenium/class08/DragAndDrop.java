package com.selenium.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		Thread.sleep(3000);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		driver.switchTo().frame(iframe);

		List<WebElement> listOfImg = driver.findElements(By.xpath("//ul[@id='gallery']//img"));
		WebElement trashArea = driver.findElement(By.id("trash"));

		Actions action = new Actions(driver);

		for (WebElement img : listOfImg) {
			action.dragAndDrop(img, trashArea).build().perform();
			Thread.sleep(3000);
		}

	}
}
