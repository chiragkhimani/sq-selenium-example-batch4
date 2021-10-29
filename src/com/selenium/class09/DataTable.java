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
		driver.get("http://the-internet.herokuapp.com/tables");

		// Find List Of Rows
		List<WebElement> listOfRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));

		// Just declare locator to find number of cells/data in each row but row will be
		// passed dynamically
		String xpathData = "//table[@id='table1']/tbody/tr[%s]/td[not(./a)]";

		// Outer for loop will execute on each row
		for (int i = 1; i <= listOfRows.size(); i++) {

			// Create a locator to get list of cells in particular row as we got here value
			// of I
			String xpathRowData = String.format(xpathData, i);

			// Create list of web elements using above xPath
			List<WebElement> listOfDataInEachRow = driver.findElements(By.xpath(xpathRowData));

			// Print all data from particular row
			for (WebElement data : listOfDataInEachRow) {
				System.out.print(data.getText() + "         ");
			}

			// Print enter after printing data into each row
			System.out.println();

		}

	}
}
