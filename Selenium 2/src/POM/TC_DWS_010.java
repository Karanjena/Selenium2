package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_010 extends BaseClass{

	@Test
	public void toDigitalPage() {
		WelComePage wp=new WelComePage(driver);
		wp.getDigitalLink().click();
		
		DigitaldownloadsPage dp=new DigitaldownloadsPage(driver);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).isDisplayed();
		if(Logo==true) {
			Reporter.log("Successfully open DigitalPage",true);
		}else {
			Reporter.log("Fail Open DigitalPage",true);
		}
		
		Select sort=new Select(dp.getSortByDropdown());
		sort.selectByVisibleText("Name: A to Z");
		
		Select display =new Select(dp.getDisplayDropdown());
		display.selectByVisibleText("4");
		
		Select view =new Select(dp.getViewAsDropdown());
		view.selectByVisibleText("List");
		
		String ExpectedData="Add to cart";
		WebElement addButton = dp.getAddToCartButton();
		addButton.click();
		String ActualData = addButton.getAttribute("value");
		if(ActualData.equals(ExpectedData)) {
			Reporter.log("Product Successfully AddToCart",true);
		}else {
			Reporter.log("Product Fail AddToCart",true);
		}
	}
}
