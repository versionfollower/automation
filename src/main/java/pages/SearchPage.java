package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Enum.SortingConstants;
import webObjects.Header;


public class SearchPage extends WebPage{
	
public SearchPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		header = new Header(driver);
		// TODO Auto-generated constructor stub
	}
final Logger LOGGER = LoggerFactory.getLogger(SearchPage.class);
Header header;

/* ## String ##*/

private  String CategoryOption = ".//input[contains(@aria-label,'#text#')]";
private  String SortingOption  = ".//a[contains(text(),'#text#')]";
/* ## Web Elements ##*/
private  By searchResults  = By.className("rcnt");
private  By sortingSection = By.xpath(".//a[contains(@aria-controls,'SortMenu')]");  //Best Match
private  By listPrices     = By.xpath(".//li/div//span[contains(@class,'bold')]");  
private  By listNames      = By.xpath(".//li/div//a[contains(@class,'vip')]");
public Header getHeader(){
	return header;
}

/* ## Methods ##*/
	
	public SearchPage selectShoesBrand(String brand){
		seleniumUtils.click(util.replaceText(CategoryOption, brand));
		return new SearchPage(driver);
	}
	
	public SearchPage selectShoesSize(String size){
		seleniumUtils.click(util.replaceText(CategoryOption, size));
		return new SearchPage(driver);
	}
	
	
	public SearchPage changePriceAscendant (){
		seleniumUtils.mouseOver(sortingSection);
		seleniumUtils.click(util.replaceText(SortingOption, SortingConstants.ASCENPRICE.toString()));
		return new SearchPage(driver);
	}
	
	public SearchPage changePriceDescendant(){
		seleniumUtils.mouseOver(sortingSection);
		seleniumUtils.click(util.replaceText(SortingOption, SortingConstants.DESCENPRICE.toString()));
		return new SearchPage(driver);
	}
	
	/* ##  Assertion  ##  */
	                
	public void validateResultIsDisplayed(){
		seleniumUtils.AssertElementPresent(searchResults);
		LOGGER.info("the results are : " + driver.findElement(searchResults).getText());
	}
	
	public SearchPage displayFirst5Result(){
		List<WebElement> prices = seleniumUtils.getElements(listPrices);
		util.printFirst5PricesElements(prices);
		return new SearchPage(driver);
		
	}
	
	public SearchPage SortFirst5AscendantResultNames(){
		List<WebElement> names = seleniumUtils.getElements(listNames);
		util.printFirst5ProductNames(names);
		return new SearchPage(driver);
		
	}
	
	

}
