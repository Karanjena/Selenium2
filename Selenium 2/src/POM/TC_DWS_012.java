package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_012 extends BaseClass {

	@Test
	public void toGiftCard() {
		WelComePage wp = new WelComePage(driver);
		wp.getGiftLink().click();

		GiftCardsPage gp = new GiftCardsPage(driver);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).isDisplayed();
		if (Logo == true) {
			Reporter.log("Successsfuly Open GiftPage", true);
		} else {
			Reporter.log("Fail Open GiftPage", true);
		}

		Select sort = new Select(gp.getSortByDropdown());
		sort.selectByVisibleText("Price: Low to High");

		Select display = new Select(gp.getDisplayDropdown());
		display.selectByVisibleText("8");

		Select view = new Select(gp.getViewAsDropdown());
		view.selectByVisibleText("Grid");

		String ExecpetedData = "Add to cart";
		WebElement addButton = gp.getAddToCartButton();
		addButton.click();
		String ActualData = addButton.getAttribute("value");
		if (ActualData.equals(ExecpetedData)) {
			Reporter.log("Product Successfully AddToCart", true);
		} else {
			Reporter.log("Product Fail AddToCart", true);
		}
	}
}
