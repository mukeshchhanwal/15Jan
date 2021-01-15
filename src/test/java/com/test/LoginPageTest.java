package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.Loginpage;




public class LoginPageTest {
	WebDriver driver;
	Loginpage lp=null;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Offline%20website/index.html");
		lp=new Loginpage(driver);	
	}

	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
	@Test(priority=1)
	public void verifyTitle(){
	Assert.assertTrue(lp.verifyTitle());
	}
	@Test(priority=2)
	public void verifyHeading(){
	Assert.assertTrue(lp.verifyHeading());
	}
	@Test(priority=3)
	public void verifylogo(){
	Assert.assertTrue(lp.verifylogo());	
	}
	@Test(priority=4)
	public void verifysubHeading(){
	Assert.assertTrue(lp.subHeading());
    }
	@Test(priority=5)
	public void verifynewregister(){
	Assert.assertTrue(lp.newregister());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}