package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchKTM {

	
	@Test(groups = "smoke")
	public void KTM() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ktmindia.com/");
		Reporter.log("KTM got execute", true);
		driver.quit();
	}
}
