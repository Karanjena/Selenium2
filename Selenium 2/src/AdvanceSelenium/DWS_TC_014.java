package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_014 extends BaseClass {

	String execeptedData = "My account - Orders";

	@Test
	public void toOrderPage() {
		driver.findElement(By.linkText("Orders")).click();
		String actualData = driver.findElement(By.xpath("//h1[contains(text(),'Orders')]")).getText();
		if (actualData.equals(execeptedData)) {
			Reporter.log("Successfully Navigate to Order Page", true);
		} else {
			Reporter.log("Fail Navigate to Order Page", true);
		}
	}
}
