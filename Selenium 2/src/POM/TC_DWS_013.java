package POM;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_013 extends BaseClass{

	@Test
	public void toShoppingcart() {
		WelComePage wp=new WelComePage(driver);
		wp.getShoppingCartLink().click();
		
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Shopping cart']")).isDisplayed();
		if (Logo==true) {
			Reporter.log("Successfully Display Shoping Page",true);
		} else {
			Reporter.log("Fail Display Shoping Page",true);
		}
	}
}
