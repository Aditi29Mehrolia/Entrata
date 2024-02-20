package com_entrata_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchDemoPage {
	//Storing different Elements using @FindBy annotation
	@FindBy(id  = "FirstName")
	private WebElement firstNameTbx;
	@FindBy(id  = "LastName")
	private WebElement lastNameTbx;
	@FindBy(id  = "Email")
	private WebElement emailTbx;
	@FindBy(id  = "Company")
	private WebElement companyTbx;
	@FindBy(id  = "Phone")
	private WebElement phoneNumTbx;
	@FindBy(id  = "Unit_Count__c")
	private WebElement unitCountDropdown;
	@FindBy(id  = "Title")
	private WebElement titleTbx;
	//Creating Constructor for HomePage class
	public WatchDemoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Creating the Getters Methods for accessing the elements
	public WebElement getFirstNameTbx() {
		return firstNameTbx;
	}
	public WebElement getLastNameTbx() {
		return lastNameTbx;
	}
	public WebElement getEmailTbx() {
		return emailTbx;
	}
	public WebElement getCompanyTbx() {
		return companyTbx;
	}
	public WebElement getPhoneNumTbx() {
		return phoneNumTbx;
	}
	public WebElement getUnitCountDropdown() {
		return unitCountDropdown;
	}
	public WebElement getTitleTbx() {
		return titleTbx;
	}
	
}
