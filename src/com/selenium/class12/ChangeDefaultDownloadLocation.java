package com.selenium.class12;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChangeDefaultDownloadLocation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory",
				"C:\\Users\\khima\\java-class-fall-batch\\SeleniumExamplesChirag\\chirag");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://the-internet.herokuapp.com/download");

		WebElement fileLink = driver.findElement(By.xpath("//a[text()='1.jpeg']"));
		fileLink.click();
	}
}
