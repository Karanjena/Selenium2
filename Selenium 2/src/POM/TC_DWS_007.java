package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_007 extends BaseClass {

	@Test
	public void tocamerapage() {

		WelComePage wp = new WelComePage(driver);
		wp.getElectronicsLink().click();

		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCameraPage().click();

		CameraPage cp = new CameraPage(driver);
		boolean logo = driver.findElement(By.xpath("//h1[text()='Camera, photo']")).isDisplayed();
		if (logo == true) {
			Reporter.log("CameraPage Open", true);
		} else {
			Reporter.log("Failed CameraPage", true);
		}

		Select sort = new Select(cp.getSortByDropdown());
		sort.selectByVisibleText("Price: Low to High");

		Select display = new Select(cp.getDisplayDropdown());
		display.selectByVisibleText("12");

		Select view = new Select(cp.getViewAsDropdown());
		view.selectByVisibleText("List");

		cp.getUnderPrice().click();
		cp.getRemoveFilter().click();
		cp.getOverPrice().click();
		cp.getRemoveFilter().click();
		cp.getProductDetails().click();


		String execeptData = "Add to compare list";
		WebElement addButton = cp.getAddtoCompareList();
		String actualData = addButton.getAttribute("value");
		if (actualData.equals(execeptData)) {
			Reporter.log("Successfull Add to compare list", true);
		} else {
			Reporter.log("Fail Add to compare list", true);
		}

	}

}
