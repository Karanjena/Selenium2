package POM;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_017 extends BaseClass{

	@Test

	public void toTricentis() {
		WelComePage wp=new WelComePage(driver);
		wp.getTricentisLink().click();
		

		boolean Logo = driver.findElement(By.xpath("//h1[text()='Tricentis']")).isDisplayed();
		if (Logo == true) {
			Reporter.log("Successfully Tricentis Page Opened", true);
		} else {
			Reporter.log("Tricentis Page Not Open", true);
		}
	}
}
