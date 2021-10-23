package com.selenium.class07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertExample {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");

		WebElement firstBtn = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		firstBtn.click();

		Alert alt = driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(alt.getText());
		alt.accept();
//		alt.sendKeys("");
//		alt.dismiss();
	}
}
