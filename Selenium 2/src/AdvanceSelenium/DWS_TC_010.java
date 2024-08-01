package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_010 extends BaseClass{


	String execeptedData="News";
	@Test
	public void toNewsPage() {
		driver.findElement(By.linkText("News")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='News']")).getText();
		if(actualData.equals(execeptedData)) {
		Reporter.log("Successfully Navigate to News Page", true);
		}else {
			Reporter.log("Fail Navigate to News Page", true);
		}
	}
}
