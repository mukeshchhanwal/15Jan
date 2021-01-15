package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.Adduserpage;
import com.pages.DashboardPage;
import com.pages.operatorpage;

public class AddUsertest {
	WebDriver driver;
	Adduserpage ad;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/users.html");
		ad=new Adduserpage(driver);	
	}

	@AfterMethod
	public void closeBrowser(){
		driver.close();

}
	@Test(priority=1)
	public void verifyMainHeading(){
	Assert.assertTrue(ad.mainHeading());
}
	@Test(priority=2)
	public void verifysubHeading(){
	Assert.assertTrue(ad.subHeading());
	
	}
	@Test(priority=3)
	public void verifyuserTable(){
	Assert.assertTrue(ad.userTable());
	}
	
	@Test(priority=4)
	public void verifyradioButtonMale(){
	Assert.assertTrue(ad.radioButtonMale());
	}
	@Test(priority=5)
	public void verifyradioButtonFemale(){
	Assert.assertTrue(ad.radioButtonFemale());
	}
	@Test(priority=6)
	public void verifysubmitButton(){
	Assert.assertTrue(ad.submitButton());
	}
	@Test(priority=7)
	public void verifyadduser(){
	Assert.assertTrue(ad.adduser());
	}
  
	
	
	
	
	
	
	
	
	
	
	
}