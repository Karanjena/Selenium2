package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchTVS {

	
	@Test(groups = "integration")
	public void Apache() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bajajauto.com/bikes/pulsar/pulsar-ns200");
	Reporter.log("TVS Apache got execute", true);
	driver.quit();
	}
}
