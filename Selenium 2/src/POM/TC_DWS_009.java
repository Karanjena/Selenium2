package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_009 extends BaseClass {

	@Test
	public void toApparelAndShoes() {

		WelComePage wp = new WelComePage(driver);
		wp.getApparelLink().click();

		ApparelAndShoesPage ap = new ApparelAndShoesPage(driver);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']")).isDisplayed();
		if (Logo == true) {
			Reporter.log("Successfully Open ApparelAndShoesPage", true);
		} else {
			Reporter.log("Failed Open ApparelAndShoesPage", true);
		}

		Select sort = new Select(ap.getSortByDropdown());
		sort.selectByVisibleText("Name: Z to A");

		Select display = new Select(ap.getDisplayDropdown());
		display.selectByVisibleText("12");

		Select view = new Select(ap.getViewAsDropdown());
		view.selectByVisibleText("Grid");

		String ExpectedData = "Add to cart";
		WebElement addButton = ap.getAddToCartButton();
		addButton.click();
		String actualData = addButton.getAttribute("value");
		if (actualData.equals(ExpectedData)) {
			Reporter.log("Product Successfull AddToCart", true);
		} else {
			Reporter.log("Product Fail AddToCart", true);
		}
	}
}
