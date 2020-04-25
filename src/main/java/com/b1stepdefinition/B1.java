package com.b1stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class B1 {

static WebDriver driver;
	
	@Given("^user navigates to testmeapp$")
	public void user_navigates_to_testmeapp() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK\\Desktop\\case study ppts\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		
	   
	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String username, String password) throws Throwable {
		
		driver.findElement(By.name("userName")).sendKeys(username);

	    driver.findElement(By.name("password")).sendKeys(password);

	    driver.findElement(By.name("Login")).click();
	   
	}

	@Then("^login should be successful$")
	public void login_should_be_unsuccessful() throws Throwable {
		
		System.out.println(" password is wrong ");

	       driver.close(); 

	    
	}

	
}
