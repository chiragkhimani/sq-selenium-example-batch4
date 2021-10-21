package com.selenium.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropdown {
	public static void main(String[] args) {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://semantic-ui.com/modules/dropdown.html");

		driver.findElement(By.xpath("//div[@class='dropdown example']/div/select[@name='skills']/..")).click();

		WebElement skillDropdown = driver
				.findElement(By.xpath("//div[@class='dropdown example']/div/select[@name='skills']"));
		Select skillDropdownSelect = new Select(skillDropdown);
		skillDropdownSelect.selectByVisibleText("Angular");
		skillDropdownSelect.selectByVisibleText("Graphic Design");
		skillDropdownSelect.selectByVisibleText("Javascript");
		skillDropdownSelect.selectByVisibleText("UI Design");

	}
}
