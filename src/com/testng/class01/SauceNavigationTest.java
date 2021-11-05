package com.testng.class01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceNavigationTest {

	WebDriver driver;

	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();

	@BeforeMethod
	public void setUp() {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// Loading url in the browser
		driver.get("https://www.saucedemo.com/");
	}

	@Test(groups = { "Smoke", "Chirag", "Navigation" })
	public void verifyUserCanNavigateToProductDetailPageFromHomePage() {
		loginPage.doLogin();
		homePage.verifyHomePage();
		homePage.verifyProductDetailPageNavigation();
	}

	@AfterMethod
	public void cleanUp() {
		driver.close();
	}

}
