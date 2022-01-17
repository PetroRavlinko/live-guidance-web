package com.ravlinko;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepDefinitions {

    public static WebDriver driver;

    @Given("open {string}")
    public void open(String url) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(url);
    }

    @When("type {string} into search input")
    public void type_into_search_input(String message) {
        driver.findElement(By.name("q")).sendKeys(message, Keys.ENTER);
    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }

}
