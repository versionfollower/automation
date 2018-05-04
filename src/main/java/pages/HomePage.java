package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import common.ConfigProp;
import webObjects.Header;


public class HomePage extends WebPage{
	
public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		header = new Header(driver);
		// TODO Auto-generated constructor stub
	}
final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);
Header header;


/* ## Web Elements ##*/



/* ## Methods ##*/
	public HomePage goHomePage(){
		driver.get(ConfigProp.getUrl());
		return new HomePage(driver);
	}
	

	public Header getHeader(){
		return header;
	}
	

}
