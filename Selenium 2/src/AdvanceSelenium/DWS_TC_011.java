package AdvanceSelenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_011 extends BaseClass {

	String execeptedData = "New products";

	@Test
	public void toNewproductsPage() {
		driver.findElement(By.linkText("New products")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='New products']")).getText();
//		if (actualData.equals(execeptedData)) {
//			Reporter.log("Successfully Navigate to New Product Page", true);
//		} else {
//			Reporter.log("Fail Navigate to New Product Page", true);
//		}
		assertEquals(actualData, execeptedData);
	}
}
