package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_009 extends BaseClass {

	String execeptedData = "Privacy policy";

	@Test
	public void toPrivacyNoticePage() {
		driver.findElement(By.linkText("Privacy Notice")).click();
		String actualData = driver.findElement(By.xpath("//h1[contains(text(),'Privacy policy')]")).getText();
		if (actualData.equals(execeptedData)) {
			Reporter.log("Successfully Navigate to PrivacyNoticePage", true);
		} else {
			Reporter.log("Fail  Navigate to PrivacyNoticePage", true);
		}
	}
}
