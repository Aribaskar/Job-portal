package com.pageobj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectModel extends baseclass {

	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="Password")
	private WebElement Password;
	@FindBy(className="login_button")
	private WebElement loginButton;
	
	public LoginPageObjectModel() {
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	
}
