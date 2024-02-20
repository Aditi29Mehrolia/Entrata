package com_entrata_generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public WebDriver driver;
	 //Opening the browser before running testscript
	 @BeforeTest
	 public void openbrowser()
	 {		 
		 Reporter.log("opening the browser");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 //Entering the url 
	 @BeforeMethod
	 public void triggerUrl()
	 {		 
		 driver.get("https://www.entrata.com/");
	 }
	 
      //After execution closing the browser
	 @AfterTest
	 public void closebrowser()
	 {
		 Reporter.log("closing the browser");
		 driver.close();
	 
	 }

}
