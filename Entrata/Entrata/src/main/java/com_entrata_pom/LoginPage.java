package com_entrata_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Storing different Elements using @FindBy annotation
	@FindBy(id  = "entrata-username")
	private WebElement unTbx;
	@FindBy(id  = "entrata-password")
	private WebElement pwdTbx;
	@FindBy(xpath  = "//button[@type='submit']")
	private WebElement signInButton;
	@FindBy(id  = "statusMessage")
	private WebElement statusMessage;	
	//Creating the Getters Methods for accessing the elements
	public WebElement getUnTbx() {
		return unTbx;
	}

	public WebElement getPwdTbx() {
		return pwdTbx;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getStatusMessage() {
		return statusMessage;
	}
	//Creating Constructor for HomePage class
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
