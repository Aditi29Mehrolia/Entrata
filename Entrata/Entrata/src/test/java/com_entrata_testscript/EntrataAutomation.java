package com_entrata_testscript;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com_entrata_generic.Baseclass;
import com_entrata_pom.HomePage;
import com_entrata_pom.LoginPage;
import com_entrata_pom.WatchDemoPage;


public class EntrataAutomation extends Baseclass {
	@Test
public void TC_01() {
	//Enter the details into form
	HomePage h=new HomePage(driver);
	//Calling the method for Accepting the cookies
	h.getAcceptcookiesbutton().click();
	//Calling the method for clicking the 'Watch Demo' button
	h.getWatchdemobutton().click();
	//Creating the object for accessing the elements
	WatchDemoPage w=new WatchDemoPage(driver);
	//Calling methods and clicking on textboxes and entering the values
	w.getFirstNameTbx().sendKeys("ABC");
	w.getLastNameTbx().sendKeys("XYZ");
	w.getEmailTbx().sendKeys("abc@xyz.com");
	w.getCompanyTbx().sendKeys("Entrata");
	w.getPhoneNumTbx().sendKeys("987653210");
	//Using Select class for handling the dropdown
	WebElement ele = w.getUnitCountDropdown();
	Select s=new Select(ele);
	//Selecting the 1st option from the dropdown
	s.selectByIndex(1);
	//Calling the method and clicking on textbox and entering the value
	w.getTitleTbx().sendKeys("Test Engineer");
}
	@Test
public void TC_02() throws InterruptedException {
	//Verify Invalid Login
	HomePage h=new HomePage(driver);
	h.getSignInLink().click();Thread.sleep(2000);
	h.getManagerLoginLink().click();Thread.sleep(2000);
	LoginPage l=new LoginPage(driver);
	l.getUnTbx().sendKeys("Admin");
	l.getPwdTbx().sendKeys("123456");
	l.getSignInButton().click();
	String actualText = l.getStatusMessage().getText();
	String expectedText="The username and password provided are not valid. Please try again.";
	Assert.assertEquals(actualText, expectedText);
	
}
	@Test
public void TC_03() throws InterruptedException {
	//Handling dropdown menu
		// Creating the object for Homepage class to access the Homepage methods
	HomePage h=new HomePage(driver);
	//Storing the value in WebElement
	WebElement ele = h.getProductsMenu();
	//Using Actions class for access the Scrollbar
	Actions a=new Actions(driver);
	 //Performing MouseHover Action
	a.moveToElement(ele).perform();
	Thread.sleep(2000);
	//Calling the method and click on ResidentPayLink 
	h.getResidentPayLink().click();
	//Making use of Wait statement to get the Title 
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.titleContains("ResidentPay"));
	//Getting the Title and storing into one referrence variable
	String actualTitle = driver.getTitle();
	String expectedTitle="ResidentPay complete payment solution paying rent online with any payment method.";
	//Comparing the titles using Assertion
	Assert.assertEquals(actualTitle, expectedTitle);
}
}
