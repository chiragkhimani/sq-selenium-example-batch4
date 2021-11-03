package com.testng.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	// Readiness before executing the test
	@BeforeMethod
	public void setUp() {
		System.out.println("1. Executed before test");
	}

	@Test
	public void testCase1() {
		System.out.println("2. Executing Test 1");
	}

	// Clean up / close everything after execution of test
	@AfterMethod
	public void cleanUp() {
		System.out.println("4. Executed After test");
	}

	@Test
	public void testCase2() {
		System.out.println("3. Executing Test 2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("a. Executing Test 3");
	}

}
