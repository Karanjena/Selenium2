package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_001 extends BaseClass {

	@Test
	public void toCheckBooksPage() {
		driver.findElement(By.partialLinkText("Books")).click();
		
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Books']")).isDisplayed();
		if (Logo == true) {
			Reporter.log("TestCase 001 got executed Successfully", true);
		} else {
			Reporter.log("Fail Testase 001", true);
		}
	}

}
