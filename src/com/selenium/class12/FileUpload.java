package com.selenium.class12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("http://the-internet.herokuapp.com/upload");

		WebElement fileUpload = driver.findElement(By.id("file-upload"));

		fileUpload.sendKeys("C:\\Users\\khima\\Pictures\\1.jpeg");

		WebElement uploadBtn = driver.findElement(By.id("file-submit"));
		uploadBtn.click();

		System.out.println(driver.findElement(By.xpath("//h3")).getText());
	}
}
