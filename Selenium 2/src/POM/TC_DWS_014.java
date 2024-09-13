package POM;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_014 extends BaseClass{

	@Test
	public void toWishlist() {
		WelComePage wp=new WelComePage(driver);
		wp.getWishlistLink().click();
		
		boolean Logo = driver.findElement(By.xpath("//h1[contains(text(),'Wishlist')]")).isDisplayed();
		if (Logo==true) {
			Reporter.log("Successfully Display Wishlist Page",true);
		} else {
			Reporter.log("Fail Display Wishlist Page",true);
		}
	}
}
