package AdvanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {

	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before Suite got Executed", true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("After Suite got Executed", true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test got Executed", true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("After Test  got Executed", true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Before Class got Executed", true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("After Class  got Executed", true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Before Method got Executed", true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("After Method  got Executed", true);
	}
	@Test
	public void testCase() {
	Reporter.log("Tast Case Got Executed", true);
	}
}
