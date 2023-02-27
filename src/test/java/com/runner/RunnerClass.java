package com.runner;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\DELL\\eclipse-workspace\\Maven_parallel\\src\\test\\java\\com\\feature", glue = "com.Stepdefinition",

		plugin = { "html:Reports/parallel.html", "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:Reports/JsonFile.json"}, 
		tags = "@smoketest", monochrome = true) 

public class RunnerClass {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUP() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	

}


