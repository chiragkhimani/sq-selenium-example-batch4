package com.selenium.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");

		WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		driver.switchTo().frame(iFrame);

		// Click on Calendar input to open calendar picker
		WebElement datePickerInput = driver.findElement(By.id("datepicker"));
		datePickerInput.click();

		// Expected date we want to select on Calendar
		String date = "24 December 2022";

		// Retrieve month & year from date as first we need to select correct date and
		// month from calendar picker
		String monthYear = date.substring(date.indexOf(" ") + 1);

		// Locator for month & year in Calendar picker
		WebElement cpMonth = driver.findElement(By.cssSelector(".ui-datepicker-month"));
		WebElement cpYear = driver.findElement(By.cssSelector(".ui-datepicker-year"));

		// Get text of calendar picker month & year to compare with our expected month &
		// year
		String cpMonthYear = cpMonth.getText() + " " + cpYear.getText();

		// Execute while loop till expected month-year & calendar picker month year are
		// not equal
		while (!monthYear.equals(cpMonthYear)) {

			// Click on next icon in calendar picker
			WebElement nextIcon = driver.findElement(By.xpath("//a[@title='Next']"));
			nextIcon.click();

			Thread.sleep(1000);

			// Get updated elements
			cpMonth = driver.findElement(By.cssSelector(".ui-datepicker-month"));
			cpYear = driver.findElement(By.cssSelector(".ui-datepicker-year"));

			// Get updated value of month and year
			cpMonthYear = cpMonth.getText() + " " + cpYear.getText();
		}

		// xPath to select day from calendar picker - day will be dynamic
		String xPathCPDate = "//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='%s']";

		// Get day value from date
		String day = date.replace(monthYear, "").trim();

		// Prepare xPath replacing %s with day value
		String xPathCPDateLoc = String.format(xPathCPDate, day);

		// Click on calendar day in calendar picker
		driver.findElement(By.xpath(xPathCPDateLoc)).click();

	}
}
