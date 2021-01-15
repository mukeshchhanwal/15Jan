package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DownloadPage;


public class downloadtest {
	WebDriver driver;
	DownloadPage dw=null;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Offline%20website/index.html");
		dw=new DownloadPage (driver);	
	}
 
	@AfterMethod
	public void closedBroswer(){
    driver.close();
	}
	@Test(priority=1)
	public void verifyMainHeading1(){
	Assert.assertTrue(dw.mainHeading1());
	}
	@Test(priority=2)
	public void verifyDownloadList(){
	Assert.assertTrue(dw.downloadlist());
	}
	
	@Test(priority=3)
	public void verifyHeading(){
	Assert.assertTrue(dw.heading());
	}
	
	@Test(priority=4)
	public void verifyBit32(){
	Assert.assertTrue(dw.bit32());	
	}
	
	@Test(priority=5)
	public void verifySeleniumurl1(){
	Assert.assertTrue(dw.seleniumurl1());
	}
    
	@Test(priority=6)
    public void verifyChromeurl(){
	Assert.assertTrue(dw.chromeurl());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
