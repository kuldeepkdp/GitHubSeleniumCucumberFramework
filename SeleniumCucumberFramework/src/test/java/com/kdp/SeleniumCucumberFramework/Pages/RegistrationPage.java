package com.kdp.SeleniumCucumberFramework.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	

    public  By registrationLink = By.xpath("//a[@title='Contact']");
	public  By send = By.xpath("//input[@value='Send']");
	
	public static void navigateToGmail(WebDriver driver) throws IOException {
		
		driver.get("http://www.gmail.com");
		
	}

}
