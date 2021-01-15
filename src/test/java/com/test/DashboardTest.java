package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.Loginpage;

public class DashboardTest {
	WebDriver driver;
	DashboardPage dp=null;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/dashboard.html");
		dp=new DashboardPage(driver);	
	}

	@AfterMethod
	public void closeBrowser(){
		driver.close();
}
	@Test(priority=1)
	public void allcourse(){
	Assert.assertTrue(dp.allCourse());
}
	@Test(priority=2)
	public void mainNavigation(){
	Assert.assertTrue(dp.mainNavigation());
}
	@Test(priority=3)
	public void moreinfo(){
	Assert.assertTrue(dp.moreinfo());	
	}
	@Test(priority=4)
	public void logout(){
	Assert.assertTrue(dp.logout());
	}
	@Test(priority=5)
	public void goutMsg(){
	Assert.assertTrue(dp.goutMsg());
}
	@Test(priority=6)
	public void heading(){
	Assert.assertTrue(dp.heading());
	}
	@Test(priority=7)
	public void mainHeading(){
	Assert.assertTrue(dp.mainHeading());
	}
	@Test(priority=8)
	public void footer(){
	Assert.assertTrue(dp.footer());
	}
	@Test(priority=9)
	public void copyright(){
	Assert.assertTrue(dp.copyright());
	}
	@Test(priority=10)
	private void logo(){
	Assert.assertTrue(dp.logo());
	}
}
