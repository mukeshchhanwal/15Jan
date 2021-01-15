package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adduserrepository {
	
	
	
	
	
	
	
	@FindBy(xpath="//h1")
	public WebElement mainHeading;
	
	@FindBy(xpath="//h3")
	public WebElement subHeading;

	@FindBy(xpath="//label[@class='col-sm-3 control-label']")
	public WebElement userTable;
	
	@FindBy(xpath="//input[@name='gender']")
	public WebElement radioButtonMale;

	@FindBy(xpath="//input[@id='Female']")
	public WebElement radioButtonFemale;
	
	@FindBy(xpath="//button[@id='submit']")
	public WebElement submitButton;
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='mobile']")
	public WebElement mobile;
    
	@FindBy(xpath="//input[@id='email']")
	public WebElement Email;
	
	@FindBy(xpath="//input[@id='course']")
	public WebElement Courses;
	
	@FindBy(xpath="//input[@id='Male']")
	public WebElement Male;
	

	
	
}

