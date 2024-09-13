package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_003 extends BaseClass{

	@Test
	public void toCheckElectronicsPage() {
		driver.findElement(By.partialLinkText("ElectronicsPage")).click();
		boolean Logo = driver.findElement(By.xpath("//h1[text()='ElectronicsPage']")).isDisplayed();
		if (Logo == true) {
			Reporter.log("TstCase 003 got executed Successfully", true);
		} else {
			Reporter.log("Fail TstCase 003", true);
		}

	}
}
