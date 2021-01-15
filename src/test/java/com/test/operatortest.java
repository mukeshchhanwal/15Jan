package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.operatorpage;

public class operatortest {

	public WebDriver driver;
	public operatorpage op;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/operators.html");
		driver.manage().window().maximize();

		// driver.get("file:///D:/Offline%20website/index.html");
		op = new operatorpage(driver);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@Test(priority = 1)
	public void verifyMainHeading() {
		Assert.assertTrue(op.mainHeading());
	}

	@Test(priority = 2)
	public void Heading() {
		openBrowser();
		Assert.assertTrue(op.Heading());
	}

	@Test(priority = 3)
	public void SubHeading() {
		Assert.assertTrue(op.SubHeading());
	}

	@Test(priority = 4)
	public void PreferedContact() {
		Assert.assertTrue(op.PreferedContact());
	}

	@Test(priority = 5)
	public void Timing() {
		Assert.assertTrue(op.Timing());
	}

	@Test(priority = 6)
	public void Timing2() {
		Assert.assertTrue(op.Timing2());
	}

	@Test(priority = 7)
	public void call() {
		Assert.assertTrue(op.call());
	}

	@Test(priority = 8)
	public void email() {
		Assert.assertTrue(op.email());

	}
}
