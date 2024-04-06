package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stdpsign {
	
	WebDriver driver;
	
	@Given("user is on Facebook Application Browser")
	public void user_is_on_Facebook_Application_Browser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	    
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
	    WebElement txtuser =driver.findElement(By.id("email"));
	    txtuser.sendKeys(string);
	    
	    WebElement txtpass =driver.findElement(By.id("pass"));
	    txtpass.sendKeys(string2);
	    
	    
	    
	    
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		
		btnlogin.click();
	   
	}
	

}
