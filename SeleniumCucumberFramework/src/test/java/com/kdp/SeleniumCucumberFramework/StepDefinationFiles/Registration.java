package com.kdp.SeleniumCucumberFramework.StepDefinationFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.kdp.SeleniumCucumberFramework.BaseFunction.CommonFunction;
import com.kdp.SeleniumCucumberFramework.BaseFunction.Selenium;
import com.kdp.SeleniumCucumberFramework.Pages.ContactPage;
import com.kdp.SeleniumCucumberFramework.Pages.RegistrationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Registration {
	
	public Selenium sel;
	public WebDriver driver;

	
	public Registration(Selenium sel) {
		this.sel=sel;
		this.driver=sel.getDriver();
	}
	
	@Given("^I click on registration link$")
	public void i_click_on_registration_link() throws Throwable {
		
		System.out.println("i clicked on registration link");
	  
	}

	@And("^I click on Submit button$")
	public void i_click_on_Submit_button() throws Throwable {
		
		System.out.println("i clicked on submit button");

	}

	@And("^I fill the registration form$")
	public void i_fill_the_registration_form() throws Throwable {
		
		System.out.println("i fill the registration form");
		
	  
	}
	
	@Then("^I got success message \"([^\"]*)\"$")
	public void i_got_success_message(String msg) throws Throwable {
	   
		CommonFunction.waitFor(5000);
		String actulavalidation = driver.findElement(ContactPage.validationMessage).getText();

		Assert.assertEquals("Checking mandatory success msg", msg, actulavalidation);
	}

	
	@Given("^i login as \"([^\"]*)\" using passowrd \"([^\"]*)\"$")
	public void i_login_as_using_passowrd(String userName, String password) throws Throwable {
		
		String Id=CommonFunction.GetData(userName);
		String pwd=CommonFunction.GetData(password);
		
		/*
	    driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(Id);
	    driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pwd);
	    driver.findElement(By.xpath("//*[@id='signIn']")).click();
	    */
		
	    System.out.println("user logged in using username -> " + Id + "and password -> " + pwd);
	}
	
	
}
