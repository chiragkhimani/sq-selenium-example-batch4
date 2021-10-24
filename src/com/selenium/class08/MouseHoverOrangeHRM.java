package com.selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOrangeHRM {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement login = driver.findElement(By.id("txtUsername"));
		login.sendKeys("Admin");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");

		WebElement loginBTN = driver.findElement(By.id("btnLogin"));
		loginBTN.click();

		WebElement adminLink = driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement userManagementLink = driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement usersLink = driver.findElement(By.id("menu_admin_viewSystemUsers"));

		Actions action = new Actions(driver);
		action.moveToElement(adminLink).moveToElement(userManagementLink).click(usersLink).build().perform();

	}
}
