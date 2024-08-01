package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_002 extends BaseClass {

	@Test

	public void toCheckComputerPage() {
		driver.findElement(By.partialLinkText("Computers")).click();
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Computers']")).isDisplayed();
		if (Logo == true) {
			Reporter.log("TstCase 002 got executed Successfully", true);
		} else {
			Reporter.log("Fail TstCase 002", true);
		}

	}

}
