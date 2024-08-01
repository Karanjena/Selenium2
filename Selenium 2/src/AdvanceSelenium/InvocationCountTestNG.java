package AdvanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountTestNG {

	
	@Test(invocationCount = 0)//Ship test case
	public void cricbuzz() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got execute", true);
		driver.quit();
	}

	@Test(invocationCount = 2)
	public void baskinRobbins() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("baskinRobbins got execute", true);
		driver.quit();
	}

	@Test(invocationCount = 1)
	public void amazon() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon got execute", true);
		driver.quit();
	}

}
