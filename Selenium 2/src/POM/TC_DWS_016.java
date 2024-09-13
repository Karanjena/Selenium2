package POM;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_016 extends BaseClass {

	@Test

	public void toSearchButton() {
		SearchBar sb = new SearchBar(driver);
		sb.getSearchBar().sendKeys("Phone");
		sb.getSearchButton().click();

		boolean Logo = driver.findElement(By.xpath("//h1[text()='Search']")).isDisplayed();
		if (Logo == true) {
			Reporter.log("Successfully Search The Product", true);
		} else {
			Reporter.log("Fail Search The Product", true);
		}
	}
}
