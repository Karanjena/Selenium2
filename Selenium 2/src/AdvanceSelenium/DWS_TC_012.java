package AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_012 extends BaseClass {

	String execeptedData = "Search store";

	@Test
	public void toScarchTextField() {
		WebElement Data = driver.findElement(By.id("small-searchterms"));
		
		String actualData = Data.getAttribute("value");
		if (actualData.equals(execeptedData)) {
			Reporter.log("successfully Navigate to ScarchTextField", true);
		} else {
			Reporter.log("Fail Navigate to ScarchTextField", true);
		}

	}
}
