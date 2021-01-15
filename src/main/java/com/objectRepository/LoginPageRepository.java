package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageRepository {

	@FindBy(xpath="//img")
	public WebElement logoverify;
	
	@FindBy(xpath="//b")
	public WebElement actualTitle;
	
	@FindBy(xpath="//h4")
	public WebElement actmsag;

	@FindBy(xpath="//b")
	public WebElement actHeading;	
	

	@FindBy(xpath="//div[@class='register-box-body']")
	public WebElement newregister;
	
	
	@FindBy(name="name")
	public WebElement newmembername;
	
	@FindBy(name="mobile")
	public WebElement mobile;
	
	@FindBy(name="email")
	public WebElement enterEmail;
	
	@FindBy(name="password")
	public WebElement enterpassword;
	
	@FindBy(xpath="//button")
	public WebElement signin;
}
