package com.selenium.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalculatorAutomation {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");

		WebElement buildDropdown = driver.findElement(By.id("selectBuild"));
		Select buildDropdownSelect = new Select(buildDropdown);

		WebElement num1Input = driver.findElement(By.id("number1Field"));

		WebElement num2Input = driver.findElement(By.id("number2Field"));

		WebElement ansField = driver.findElement(By.id("numberAnswerField"));

		WebElement calculcateBtn = driver.findElement(By.id("calculateButton"));

		WebElement operationDropdown = driver.findElement(By.id("selectOperationDropdown"));
		Select operationDrodownSelect = new Select(operationDropdown);

		WebElement clearBtn = driver.findElement(By.id("clearButton"));

		buildDropdownSelect.selectByVisibleText("2");
		num1Input.sendKeys("10");
		num2Input.sendKeys("20");
		operationDrodownSelect.selectByVisibleText("Multiply");
		calculcateBtn.click();

		Thread.sleep(5000);

		System.out.println(ansField.getAttribute("value"));
		clearBtn.click();
	}
}
