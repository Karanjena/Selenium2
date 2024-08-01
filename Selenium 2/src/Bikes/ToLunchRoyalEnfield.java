package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchRoyalEnfield {

	
	@Test(groups = "integration")
	public void Royal() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.royalenfield.com/in/en/motorcycles/continental-gt/");
		Reporter.log("RoyalEnfield got execute", true);
		driver.quit();
	}
}
