package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_007 extends BaseClass{
	
	@Test
	public void toCheckWishlistPage() {
		driver.findElement(By.linkText("Wishlist")).click();
		boolean Logo = driver.findElement(By.xpath("//h1[contains(text(),'Wishlist')]")).isDisplayed();
		if (Logo == true) {
			Reporter.log("TstCase 007 got executed Successfully", true);
		} else {
			Reporter.log("Fail TstCase 007", true);
		}

	}

}
