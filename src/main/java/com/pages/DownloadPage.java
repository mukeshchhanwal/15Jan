package com.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.objectRepository.downloadpagerepository;

public class DownloadPage extends downloadpagerepository {
	WebDriver driver = null;

	public DownloadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
    
	public boolean mainHeading1() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/downloads.html");
		WebElement actualdata = driver.findElement(By.xpath("//h1"));
		System.out.println(actualdata);
		String actualTitle = actualdata.getText();
		String expTitle = "Downloads";
       
		if (actualTitle.equals(expTitle)) {
			System.out.println("Title matched");
			return true;
		} else {
			System.out.println("Title not matched");
			return false;
		}
	}

	public boolean downloadlist(){
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/downloads.html");	
		WebElement actualdata=driver.findElement(By.xpath("//h3"));
		System.out.println(actualdata);
		String actualTitle=actualdata.getText();
		String expTitle="Downloads List";
	    
	if (actualdata.equals(expTitle)) {
		System.out.println("Title matched");
		return false;
	} else {
		System.out.println("Title not matched");
		return true ;
	}
	}
	public boolean heading(){
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/downloads.html");
		List<WebElement>list=driver.findElements(By.xpath("//th"));
		ArrayList<String>expdata=new ArrayList<String>();
		expdata.add("Sr");
		expdata.add("Name");
		expdata.add("vendor");
		expdata.add("Version");
		expdata.add("32bit");
		expdata.add("64bit");
		expdata.add("Common");
		expdata.add("Official Source"+"\n"+"*For prevoius and latest releases");
		ArrayList<String>actualdata =new ArrayList<String>();
		for(WebElement element:list){
		actualdata.add(element.getText());
		System.out.println(actualdata);}
		if(actualdata.equals(expdata)){
			System.out.println("Heading is matched");
			return true;
		}else{
			System.out.println("Heading is not matched");
			return false;
		}
		
	}
	public boolean bit32() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/downloads.html");
		
		for (int i = 2; i <= 8; i++) {
			String str1 = driver.findElement(By.xpath("//tr["+i+"]/td[5]")).getText();
			if (str1.contains("32bit"))
				;
			String str2 = driver.findElement(By.xpath("//tr["+i+"]/td[1]")).getText();
		     
			System.out.println(str2 + "   ");
			System.out.println(str1 + "   ");
		}
		System.out.println();

		return true;
	}

	public boolean seleniumurl1(){
			driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/downloads.html");
			String mainWindow=driver.getWindowHandle();
			for(int i=2;i<=8;i++){
			WebElement vendor=driver.findElement(By.xpath("//tr["+i+"]/td[3]"));
			
			String text=vendor.getText();
			if(text.contains("Selenium")){
			WebElement link=driver.findElement(By.xpath("//tr["+i+"]/td[8]"));
			link.click();
			
			}
			Set<String>allWindows=driver.getWindowHandles();
			for(String window:allWindows){
				if(window.equals(mainWindow)){
				driver.switchTo().window(window);
				System.out.println("new window url is:"+driver.getCurrentUrl());}
				System.out.println("new window tittle is:"+driver.getTitle());
			
				}
			}
			return true;
			
	}

	
	public boolean chromeurl() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/downloads.html");
		String mainWindow = driver.getWindowHandle();
		for (int i = 2; i <= 8; i++) {
			WebElement vendor = driver.findElement(By.xpath("//tr["+i+"]/td[3]"));
			String text = vendor.getText();
			if (text.contains("Chrome"));
				
			WebElement link = driver.findElement(By.xpath("//tr["+i+"]/td[8]"));
			link.click();

			Set<String> allwindows = driver.getWindowHandles();
			for (String window1 : allwindows) {
				if (window1.equals(mainWindow)) {
					driver.switchTo().window(window1);
					System.out.println("new window url is:" + driver.getCurrentUrl());
					System.out.println("new window url is :" + driver.getTitle());
				}
			}
		}
		return true;
	}
}