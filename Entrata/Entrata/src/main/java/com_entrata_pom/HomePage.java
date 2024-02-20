package com_entrata_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_entrata_generic.Baseclass;
//Storing the elements and creating the methods to access and avoid the StaleElementReference exception
public class HomePage extends Baseclass {
	//Storing different Elements using @FindBy annotation
	@FindBy(id = "rcc-confirm-button")
	private WebElement acceptcookiesbutton;
	@FindBy(linkText  = "Watch Demo")
	private WebElement watchdemobutton;
	@FindBy(xpath  = "//div[text()='Products']")
	private WebElement productsMenu;
	@FindBy(linkText  = "ResidentPay")
	private WebElement residentPayLink;
	//Creating the Getters Methods for accessing the elements
	public WebElement getProductsMenu() {
		return productsMenu;
	}
	public WebElement getResidentPayLink() {
		return residentPayLink;
	}
	public WebElement getSignInLink() {
		return signInLink;
	}
	public WebElement getManagerLoginLink() {
		return managerLoginLink;
	}
	//Storing different Elements using @FindBy annotation
	@FindBy(linkText  = "Sign In")
	private WebElement signInLink;
	@FindBy(linkText  = "Property Manager Login")
	private WebElement managerLoginLink;
	//Creating Constructor for HomePage class
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Creating the Getters Methods for accessing the elements
	public WebElement getAcceptcookiesbutton() {
		return acceptcookiesbutton;
	}
	public WebElement getWatchdemobutton() {
		return watchdemobutton;
	}
}
