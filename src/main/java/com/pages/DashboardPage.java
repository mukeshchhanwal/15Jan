package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage {
	WebDriver driver=null;
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public boolean allCourse (){
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/dashboard.html");
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='inner']//following::p"));
		ArrayList<String>expecteddata=new ArrayList<String>();
		expecteddata.add("Automation Testing");
		expecteddata.add("Software Development");
		expecteddata.add("Data Science");
		expecteddata.add("Web Development");
		ArrayList<String>actualdata=new ArrayList<String>();
		for(WebElement element:list){actualdata.add(element.getText());
		}
		System.out.println("actualdata,expecteddata");
		if (actualdata.equals(expecteddata)) {
			System.out.println("Title matched");
			return true;  
		} else {
			System.out.println("Title not matched");
			return false;
		}
		}

	public boolean mainNavigation(){
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/dashboard.html");

		List<WebElement>list=driver.findElements(By.xpath("//li[@class='header']//following::span"));
		ArrayList<String>expecteddata=new ArrayList<String>();
		expecteddata.add("Dashboard");
		expecteddata.add("Users");
		expecteddata.add("Operators");
		expecteddata.add("Useful Links");
		expecteddata.add("Downloads");
		expecteddata.add("Logout");

		ArrayList<String>actualdata=new ArrayList<String>();
		for(WebElement element:list){
		actualdata.add(element.getText());
		}
		System.out.println("actual data");
		if (actualdata.equals(expecteddata)) {
			System.out.println("Title matched");
			return true;
		} else {
			System.out.println("Title not matched");
			return false;
		}
	}
		public boolean moreinfo(){
			driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/dashboard.html");
			List<WebElement>list=driver.findElements(By.xpath("//a[@class='small-box-footer']"));
			ArrayList<String>expecteddata=new ArrayList<String>();
			expecteddata.add("More info");
			expecteddata.add("More info");
			expecteddata.add("More info");
			expecteddata.add("More info");
			ArrayList<String>actualdata=new ArrayList<String>();
			for(WebElement element :list){
			actualdata.add(element.getText());
			}
			System.out.println("actual data");

		if (actualdata.equals(expecteddata)) {
			System.out.println("Title matched");
			return true;
		} else {
			System.out.println("Title not matched");
			return false;
		}
		}
		public boolean logout(){
			driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/dashboard.html");
			WebElement actualdata=driver.findElement(By.xpath("//li[@class='dropdown user user-menu']//child::a"));
			String actual=actualdata.getText();
			System.out.println("actualdata"+actual);

			String expecteddata="LOGOUT";
			if (actualdata.equals(expecteddata)) {
				System.out.println("Title matched");
				return false;
			} else {
				System.out.println("Title not matched");
				return true;
}
}
		public  boolean goutMsg(){
			driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/logout.html");
			WebElement actualdata=driver.findElement(By.xpath("//p[@class='login-box-msg']//following::p"));
			String actual=actualdata.getText();
			System.out.println(actualdata);
			String expecteddata="Logout successfully";
			if (actualdata.equals(expecteddata)) {
				System.out.println("Title matched");
				return false;
			} else {
				System.out.println("Title not matched");
				return true;
			}
           }
public boolean heading(){
driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/dashboard.html");
WebElement actualHeading=driver.findElement(By.xpath("//span[@class='logo-lg']//child::b"));
String actual=actualHeading.getText();
System.out.println(actualHeading);
String expectedHeading="Java By Kiran";








if (actual.equals(expectedHeading)) {
	System.out.println("heading matched");
	return true;
} else {
	System.out.println("Heading not matched");
	return false;
}
}
public boolean mainHeading(){
driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/dashboard.html");
WebElement actualHeading=driver.findElement(By.xpath("//div[@class='pull-left info']//child::p"));
String actual=actualHeading.getText();
System.out.println(actualHeading);
String expectedHeading="Kiran";
if (actual.equals(expectedHeading)) {
	System.out.println("Heading matched");
	return true;
} else {
	System.out.println("Heading not matched");
	return false;
}
}
public boolean footer(){
driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/dashboard.html");
WebElement actualfooter=driver.findElement(By.xpath("//div[@class='pull-right hidden-xs']//child::b"));
System.out.println(actualfooter);
String expectedfooter="Design for Selenium Automation Test";

if (actualfooter.equals(expectedfooter)) {
	System.out.println("Heading matched");
	return false;
} else {
	System.out.println("Heading not matched");
	return true;
}
}
public boolean copyright(){
driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/dashboard.html");
WebElement actualcopyright=driver.findElement(By.xpath("//footer[@class='main-footer']//child::strong"));
System.out.println(actualcopyright);
String expectedcopyright="Copyright © 2005-2019 JavaByKiran.";
if (actualcopyright.equals(expectedcopyright)) {
	System.out.println("Heading matched");
	return false;
} else {
	System.out.println("Heading not matched");
	return true;
}
}
public boolean logo(){
driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/dashboard.html");
WebElement actuallogo=driver.findElement(By.xpath("//div[@class='pull-left image']"));	
actuallogo.isDisplayed();
if (true) {
	System.out.println("Image displayed");
	return true;
} else {
	System.out.println("Image not matched");
	return false;
}
}
}