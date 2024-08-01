package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_008 extends BaseClass {
	String execeptedData = "My account - Customer info";

	@Test
	public void toMyAccountPage() {
		driver.findElement(By.linkText("My account")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='My account - Customer info']")).getText();
		if (actualData.equals(execeptedData)) {
			Reporter.log("Successfully Account Page Open", true);
		} else {
			Reporter.log("Fail Account Page Open", true);
		}
	}
}
