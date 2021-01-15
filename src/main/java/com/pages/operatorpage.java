package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectRepository.operatorRepository;


public class operatorpage extends operatorRepository {
	WebDriver driver=null;

	public operatorpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean mainHeading() {
		WebElement actualdata = mainHeading;
		System.out.println(actualdata);
		String actualTitle = actualdata.getText();
		String expTitle = "Operators";
		if (actualTitle.equals(expTitle)) {
			System.out.println("Title matched");
			return true;
		} else {
			System.out.println("Title not matched");
			return false;
		}
	}

	public boolean Heading() {

		driver.get("file:///D:/Offline%20website/pages/examples/operators.html");
		List<WebElement> list = heading;
		ArrayList<String> expdata = new ArrayList<String>();
		expdata.add("ID");
		expdata.add("Person");
		expdata.add("For");
		expdata.add("Prefered Way to Connect");
		expdata.add("Contact");
		expdata.add("Timings");
		ArrayList<String> actualdata = new ArrayList<String>();
		for (WebElement element : list) {
			actualdata.add(element.getText());
			System.out.println(actualdata);
			if (actualdata.equals(expdata)) {
				System.out.println("Heading is matched");
				return true;
			} else {
				System.out.println("Heading is not matched");
			}
		    }
				return false;
			}
		

	public boolean SubHeading(){
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/operators.html");
		WebElement actualdata=subHeading;
		System.out.println(actualdata);
		String actualTitle=actualdata.getText();
		String expTitle="Operator List";
		if (actualTitle.equals(expTitle)) {
			System.out.println("Title matched");
			return true;
		} else {
			System.out.println("Title not matched");
			return false;
		}
	}
	@Test
	public boolean PreferedContact() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/operators.html");
		for(int i=2;i<=6;i++){
		String str1=driver.findElement(By.xpath("tr["+i+"]/td[4]")).getText();
		if(str1.contains("Whats App Only"));
		String str2=driver.findElement(By.xpath("tr["+i+"]/td[2]")).getText();
		System.out.println(str2+"  ");
		System.out.println(str1+"  ");
		
		System.out.println();
	    }
	return true;
}

	

	public boolean Timing() {
		driver.findElement(By.xpath("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/operators.html"));
		for (int i = 3; i <= 6; i++) {
			String str1 = driver.findElement(By.xpath("//tr[" + i + "]/td[6]")).getText();
			if (str1.contains("Monday-Saturday")) {
				String str2 = driver.findElement(By.xpath("tr[+i+]/td[2]")).getText();
				System.out.println(str2 + "  ");
				System.out.println(str1 + "  ");
			}
			System.out.println();
		}
		return true;
	}

	public boolean Timing2() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/operators.html");
		for (int i = 2; i <= 2; i++) {
			String str1 = driver.findElement(By.xpath("tr[2]/td[6]")).getText();
			if (str1.contains("07:00 AM to 10:00 PM")) {
				String str2 = driver.findElement(By.xpath("tr[2]/td[2]")).getText();
				System.out.println(str2 + "  ");
				System.out.println(str1 + "  ");
			}
			System.out.println();
		}
		return true;
	}

	public boolean call() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/operators.html");
		for (int i = 3; i <= 6; i++) {
			String srt1 = driver.findElement(By.xpath("//tr[" + i + "]/td[4]")).getText();
			if (srt1.contains("Whats App")) {
				String str2 = driver.findElement(By.xpath("tr[+i+]/td[2]")).getText();
				System.out.println(srt1 + " ");
				System.out.println(str2 + " ");
			}
		}
			return true;
		
	}

public boolean email(){
driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/operators.html");
for(int i=3;i<=6;i++){
String str1=driver.findElement(By.xpath("//tr["+i+"]/td[4]")).getText();
if(str1.contains("eMail")){
String str2=driver.findElement(By.xpath("tr["+i+"]/td[2]")).getText();
}
}
return true;
}

	public boolean Timing4() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/operators.html");
		for (int i = 6; i <= 6; i++) {
			String str1 = driver.findElement(By.xpath("//tr[" + i + "]/td[6]")).getText();
			if (str1.contains("Saturday-Sunday"))
				;
			String str2 = driver.findElement(By.xpath("//tr[" + i + "]/td[2]")).getText();
		}
		return true;
	}
}
