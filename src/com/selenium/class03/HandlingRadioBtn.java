package com.selenium.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioBtn {
	public static void main(String[] args) {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.ebay.com/sch/ebayadvsearch?_from=R40&_trksid=p2380057.m570.l1313&_nkw=TV&_sacat=0");

		WebElement locatedRadio = driver.findElement(By.id("LH_Located"));
		WebElement prefLoc = driver.findElement(By.id("LH_PrefLocRadio"));
		WebElement locatedIn = driver.findElement(By.id("LH_LocatedInRadio"));
		
		System.out.println(locatedRadio.isSelected());
		System.out.println(prefLoc.isSelected());
		System.out.println(locatedIn.isSelected());
		
		prefLoc.click();

	}
}
