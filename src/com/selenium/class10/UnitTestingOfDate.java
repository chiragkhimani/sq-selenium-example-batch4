package com.selenium.class10;

public class UnitTestingOfDate {
	public static void main(String[] args) {
		String date = "24 December 2022";
		String monthYear = date.substring(date.indexOf(" ") + 1);

		String day = date.replace(monthYear, "").trim();
		System.out.println(day);
	}
}
