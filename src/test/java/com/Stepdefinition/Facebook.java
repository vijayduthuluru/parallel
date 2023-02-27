package com.Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.RunnerClass;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static WebDriver driver = RunnerClass.driver;

	@Given("user enters url as {string}")
	public void user_enters_url_as(String string) {

		driver.get(string);

		System.out.println("Browser ID: " + Thread.currentThread().getId());

	}

}
