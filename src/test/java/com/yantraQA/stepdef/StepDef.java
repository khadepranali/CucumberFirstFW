package com.yantraQA.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@SuppressWarnings("unused")
public class StepDef {

    WebDriver driver;
    @Given("user load the driver")
    public void user_load_the_driver() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }

    @When("user navigate the url")
    public void user_navigate_the_url() {
       driver.get("https://www.amazon.in/");

    }
    @Then("user search for a specific element")
    public void user_search_for_a_specific_element() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

}
