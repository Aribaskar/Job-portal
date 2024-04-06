package com.pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	
	public static WebDriver driver;
	public static void browserLaunch() {
		
		if(driver ==null);
		WebDriverManager.chromedriver().setup();
		driver.get("http://adactinhotelapp.com/");
	}		
	
public static void loadUrl(String Url) {
	driver.get("http://adactinhotelapp.com/");
}
public static void enterText(WebElement ac1, String name) {
	ac1.sendKeys(name);
}

public static void normalClick(WebElement act1) {
	act1.click();
}
public static void closeDriver() {
	driver.close();
}
}


