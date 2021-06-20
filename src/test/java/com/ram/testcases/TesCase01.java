package com.ram.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TesCase01 {
	public String baseUrl = "https://www.google.ca/";
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching firefox browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}

	@Test
	public void verifyTitle() {

		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		System.out.println("Actual Title :" + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println(" Test Completed ");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close(); 
		System.out.println(" Google Page Closed ");
	} 

}
