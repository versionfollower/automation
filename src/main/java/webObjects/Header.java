package webObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.SearchPage;
import pages.WebPage;

public class Header extends WebPage{
	
	public Header(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/* ## Web Elements ##*/
	private By principalLang = By.id("gh-eb-Geo-a-default");
	private By securandyLang = By.id("gh-eb-Geo-a-en");	
	private  By searchTextBox = By.id("gh-ac");
	private  By buttonSearch  = By.id("gh-btn");

	//Methods
	public void changePrincipalLanguage(){
		seleniumUtils.mouseOver(principalLang);
		seleniumUtils.click(securandyLang);
	}
	
	public Header insertSearchText(String text){
		seleniumUtils.setText(searchTextBox, text);
		return new Header(driver);
	}
	
	public void clickButtonSearch(){
		seleniumUtils.click(buttonSearch);
	}
	
}
