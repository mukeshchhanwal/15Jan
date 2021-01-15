package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.objectRepository.Adduserrepository;

public class Adduserpage extends Adduserrepository {

	WebDriver driver = null;

	public Adduserpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean mainHeading() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/add_user.html");
		WebElement actualdata = mainHeading;
		System.out.println(actualdata);
		String actualTitle = actualdata.getText();
		String expTitle = "Add User";
		if (actualTitle.equals(expTitle)) {
			System.out.println("Title matched");
			return true;
		} else {
			System.out.println("Title not matched");
			return false;
		}
	}

	public boolean subHeading() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/add_user.html");
		WebElement actualdata = driver.findElement(By.xpath("//h3"));
		System.out.println(actualdata);
		String actualTitle = actualdata.getText();
		String expTitle = "Fill Below Details";
		if (actualTitle.equals(expTitle)) {
			System.out.println("Title matched");
			return true;
		} else {
			System.out.println("Title not matched");
			{
				return false;
			}
		}
	}

	public boolean userTable() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/add_user.html");
		List<WebElement> List = driver.findElements(By.xpath("//label[@class='col-sm-3 control-label']"));
		ArrayList<String> expdata = new ArrayList<String>();
		expdata.add("Username");
		expdata.add("Mobile");
		expdata.add("Email");
		expdata.add("Courses");
		expdata.add("Gender");
		expdata.add("State");
		expdata.add("Password");
		ArrayList<String> actualdata = new ArrayList<String>();
		for (WebElement element : List) {
			actualdata.add(element.getText());
		}
		System.out.println(actualdata);
		if (actualdata.equals(expdata)) {
			System.out.println("Heading is matched");

			return true;
		} else {
			System.out.println("Heading is not matched");
		}

		return false;
	}



	public boolean radioButtonMale() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/add_user.html");
		WebElement male = driver.findElement(By.xpath("//input[@name='gender']"));
		male.click();
		boolean actualdata = male.isSelected();
		//Assert.assertEquals(actualdata, true);
		return actualdata;
	}

	public boolean radioButtonFemale() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/add_user.html");
		WebElement female = driver.findElement(By.xpath("//input[@id='Female']"));
		female.click();
		boolean actualdata = female.isSelected();
		//Assert.assertEquals(actualdata, false);
		return actualdata;
	}

	public boolean submitButton() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/add_user.html");
		//WebElement button = submitButton;
		submitButton.click();
	//	String actualdata = button.getText();
	    return true;
	    
		
		
		
	}

	public boolean adduser() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/add_user.html");
		username.sendKeys("mukeshrajput");
		mobile.sendKeys("888888888");
		Email.sendKeys("mukeshchhanwal@gmail.com");
		Courses.sendKeys("java");
		Male.click();
		Select state = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		state.selectByValue("Maharastra");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.xpath("//id='submit'")).click();
		Alert al = driver.switchTo().alert();
		String actualmsg = al.getText();
		System.out.println(actualmsg);
		al.accept();
		String message = "User Added Successfully. You can not see added user.";
		System.out.println(message);
		if (actualmsg.equals(message)) {
			System.out.println("Heading is matched");

			return true;
		} else {
			System.out.println("Heading is not matched");
		}

		return false;
	}

}
