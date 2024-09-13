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

public class TC_DWS_006 extends BaseClass {

	@Test
	public void toAccessoriesPage() {

		WelComePage wp = new WelComePage(driver);
		wp.getComputerLink().click();

		ComputerPage cp = new ComputerPage(driver);
		cp.getAccessoriesPage().click();

		AccessoriesPage ap = new AccessoriesPage(driver);
		boolean logo = driver.findElement(By.xpath("//h1[text()='Accessories']")).isDisplayed();
		if (logo == true) {
			Reporter.log("successfully", true);
		} else {
			Reporter.log("Fail", true);
		}

		Select sort = new Select(ap.getSortByDropdown());
		sort.selectByVisibleText("Price: Low to High");

		Select display = new Select(ap.getDisplayDropdown());
		display.selectByVisibleText("12");

		Select view = new Select(ap.getViewAsDropdown());
		view.selectByVisibleText("List");

		ap.getUnderPrice().click();
		ap.getRemoveFilter().click();
		ap.getOverPrice().click();
		ap.getRemoveFilter().click();

		String execeptData = "Add to cart";
		WebElement addButton = ap.getAddToCartButton();
		addButton.click();
		String actualData = addButton.getAttribute("value");
		if (actualData.equals(execeptData)) {
			Reporter.log("Successfull add to cart");
		} else {
			Reporter.log("Successfull add to cart");
		}
	}
}
