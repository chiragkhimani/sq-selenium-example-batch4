package com.selenium.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTable {
	public static void main(String[] args) {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://datatables.net/");

		List<WebElement> listOfData = driver.findElements(By.xpath("// table[@id='example']/tbody/tr/td[not(@style='display: none;')]"));

		for (WebElement data : listOfData) {
			System.out.println(data.getText());
		}

	}
}
