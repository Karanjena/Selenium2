package POM;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_015 extends BaseClass{

	@Test
	public void toSearchBer() {
		String ExceptedData="Search store";
		WelComePage wp=new WelComePage(driver);
		WebElement button=wp.getSearchTextField();
		button	.sendKeys("Phone");
		String actualData = button.getAttribute("value");
		if (actualData.equals(ExceptedData)) {
			Reporter.log("Successfully Pass The Data In Search TextField",true);
		} else {
			Reporter.log("Fail Pass The Data In Search TextField",true);
		}
	}
}
