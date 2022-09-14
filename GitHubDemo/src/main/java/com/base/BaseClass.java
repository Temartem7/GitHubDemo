package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.out.println("Setting up Chrome Browser");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Closing the Chrome Browser");
		driver.close();
	}
}
