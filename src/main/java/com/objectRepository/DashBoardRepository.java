
package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardRepository {
	
	@FindBy(xpath="//div[@class='inner']")
	public WebElement allCourse;
	
	@FindBy(xpath="//li[@class='header']")
	public WebElement mainNavigation; 
	
	@FindBy(xpath="//a[@class='small-box-footer']")
	public WebElement moreinfo;
	
	@FindBy(xpath="//li[@class='dropdown user user-menu']")
	public WebElement logout;
	
	@FindBy(xpath="//p[@style='color:red;text-align:center;']")
	public WebElement goutMsg;
	
	@FindBy(xpath="//span[@class='logo-lg']//child::b")
	public WebElement heading;
	
	@FindBy(xpath="//div[@class='pull-left info']//child::p")
	public WebElement mainHeading;
	
	@FindBy(xpath="")
	public WebElement footer;
	
	@FindBy(xpath="//footer[@class='main-footer']//child::strong")
	public WebElement copyright;
	
	@FindBy(xpath="//div[@class='pull-left image")
	public WebElement logo;
}


