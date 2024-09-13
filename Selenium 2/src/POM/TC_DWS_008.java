package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_008 extends BaseClass {

	@Test
	public void toCellPhonePage() {

		WelComePage wp = new WelComePage(driver);
		wp.getElectronicsLink().click();

		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonePage().click();

		CellPhonePage dp = new CellPhonePage(driver);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Cell phones']")).isDisplayed();
		if (Logo == true) {
			Reporter.log("Successful open CellPhone Page", true);
		} else {
			Reporter.log("Failed open CellPhone Page", true);
		}

	//	WebElement sortBy = driver.findElement(By.id("products-orderby"));
		Select sort = new Select(dp.getSortByDropdown());
		sort.selectByVisibleText("Price: Low to High");

		Select display=new Select(dp.getDisplayDropdown());
		display.selectByVisibleText("8");

		Select view = new Select(dp.getViewDropdown());
		view.selectByVisibleText("List");

		String execeptedData = "Add to cart";
		WebElement addButton = dp.getAddToCartButton();
		String actualData = addButton.getAttribute("value");
		addButton.click();
		if (actualData.equals(execeptedData)) {
			Reporter.log("Successfully Add to Cart", true);
		} else {
			Reporter.log("Fail Add to Cart", true);
		}
	}
}
