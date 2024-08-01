package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_004 extends BaseClass{

	@Test
	public void toCheckApparel_ShoesPage() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']")).isDisplayed();
		if (Logo == true) {
			Reporter.log("TstCase 004 got executed Successfully", true);
		} else {
			Reporter.log("Fail TstCase 004", true);
		}

	}
}
