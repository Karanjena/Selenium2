package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_005 extends BaseClass{

	@Test
	public void toCheckTricentissPage() {
		driver.findElement(By.linkText("Tricentis")).click();

		boolean Logo = driver.findElement(By.xpath("//h1[text()='Tricentis']")).isDisplayed();
		if (Logo == true) {
			Reporter.log("TstCase 008 got executed Successfully", true);
		} else {
			Reporter.log("Fail TstCase 008", true);
		}

	}
}
