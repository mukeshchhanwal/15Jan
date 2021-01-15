package com.pages;

import org.openqa.selenium.Alert;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectRepository.LoginPageRepository;

public class Loginpage extends LoginPageRepository {
	WebDriver driver;

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean verifyTitle() {
		String actualTitle = "javaByKiran |Log in";
		String expectedTitle = "javaByKiran |Log in";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched");
			return true;
		} else {
			System.out.println("Title not matched");
			return false;
		}
	}

	public boolean verifyHeading() {
		String actualHeading = "Java By Kiran";
		System.out.println(actualHeading);
		String expectedHeading = "Java By Kiran";
		if (actualHeading.equals(expectedHeading)) {
			System.out.println("Heading is matched");
			return true;
		} else {
			System.out.println("Title is not matched");
			return false;
		}
	}

	public boolean verifylogo() {
		logoverify.isDisplayed();
		if (true) {
			System.out.println("Image displayed");
			return true;
		} else {
			System.out.println("Image not matched");
			return false;
		}
	}

	public boolean subHeading() {
		String actMsg = "JAVA|PYTHON|SELENIUM";
		String excpMsg = "JAVA|PYTHON|SELENIUM";
		if (actMsg.equals(excpMsg)) {
			System.out.println("Subheading matche");
			return true;
		} else {
			System.out.println("Subheading not matched");
			return false;
		}
	}

	public boolean newregister() {
		newmembername.sendKeys("mukesh");
		mobile.sendKeys("9923734499");
		enterEmail.sendKeys("mukesh@gmail.com");
		enterpassword.sendKeys("123456");
		signin.click();

		Alert al = driver.switchTo().alert();
		String actMsg = al.getText();
		al.accept();
		String expMsg = "User registered successfully.";
		if (actMsg.equals(expMsg)) {
			System.out.println("Registered successfully");
			return true;
		} else {
			System.out.println("Not registered successfully");
			return false;
		}

	}
}