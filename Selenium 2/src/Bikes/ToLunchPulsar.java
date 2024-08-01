package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchPulsar {

	
	@Test(groups = "smoke")
	public void pulsar() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bajajauto.com/bikes/pulsar/pulsar-ns200");
		Reporter.log("Pulsar got execute",true);
		driver.quit();
	}
}
