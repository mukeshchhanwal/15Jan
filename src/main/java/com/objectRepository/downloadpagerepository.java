package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class downloadpagerepository {


	@FindBy(xpath="//h1")
	public WebElement mainHeading;
	
	@FindBy(xpath="//h3")
	public WebElement downloadlist;
	
	@FindBy(xpath="//th")
	public WebElement heading;
	
    }
