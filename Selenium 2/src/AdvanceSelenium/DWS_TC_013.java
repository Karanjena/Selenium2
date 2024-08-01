package AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_013 extends BaseClass {

	String execeptedData = "Add to cart";

	@Test
	public void toAddProduct() {
		driver.findElement(By.id("small-searchterms")).sendKeys("Book");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).submit();
		WebElement Data = driver.findElement(By.xpath("//a[text()='Health Book']/../..//input[@value='Add to cart']"));
		Data.click();
		String actualData = Data.getAttribute("value");
		if (actualData.equals(execeptedData)) {
			Reporter.log("Successfully Add to Product", true);
		} else {
			Reporter.log("Fail Add To Product", true);
		}
	}
}
