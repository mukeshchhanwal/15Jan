package com.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class operatorRepository {

	
	
	
	
	
	
	
	@FindBy(xpath="//h1")
	public WebElement mainHeading;
	
	@FindBy(xpath="/h3[@class='box-title']")
	public WebElement subHeading;
	
	@FindBy(xpath="//th")
	public List <WebElement> heading;



}