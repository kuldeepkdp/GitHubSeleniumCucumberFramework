package com.kdp.SeleniumCucumberFramework.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	

	public static By registerlink = By.xpath("//*[@id='menu-item-374']/a");
	public  static By submit = By.xpath("//input[@value='Submit']");
	public  static By requiredField = By.xpath("(//span[@class='legend error'])[1]");
	
	public static void navigateToGmail(WebDriver driver) throws IOException {
		
		driver.get("http://www.gmail.com");
		
	}

}
