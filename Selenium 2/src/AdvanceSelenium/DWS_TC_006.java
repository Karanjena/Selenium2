package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_006 extends BaseClass{

	@Test
	public void toCheckShoppingcartPage() {
		driver.findElement(By.linkText("Shopping cart")).click();
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Shopping cart']")).isDisplayed();
		if (Logo == true) {
			Reporter.log("TstCase 006 got executed Successfully", true);
		} else {
			Reporter.log("Fail TstCase 006", true);
		}

	}
}
