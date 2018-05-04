package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import common.ConfigProp;
import drivers.DriverFactory;
import pages.HomePage;
import pages.SearchPage;

public class WebTest {
	final Logger LOGGER = LoggerFactory.getLogger(WebTest.class);
	WebDriver driver;
	DriverFactory driverFactory;
	HomePage home;
	SearchPage search;
	
	@BeforeTest
	public void setup() throws IOException{
	driverFactory= new DriverFactory();
	driverFactory.getDriver(ConfigProp.getBrowser());
	driver= driverFactory.driver();	
	home = new HomePage(driver);
	search = new SearchPage(driver);
	LOGGER.info("@BeforeTest- Setup");
	}
	
	@AfterTest
	public void tearDown(){
		driverFactory.tearDown();
		LOGGER.info("@AfterTest- tearDown");
	}
}
