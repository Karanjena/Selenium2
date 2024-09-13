package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_DWS_004 extends BaseClass{

	@Test
	
	public void toDisplayPage() {

		WelComePage wc = new WelComePage(driver);
		wc.getComputerLink().click();

		ComputerPage cp = new ComputerPage(driver);
		cp.getDesktopPage().click();

		DeskstopPage dp = new DeskstopPage(driver);
		boolean logo = driver.findElement(By.xpath("//h1[text()='Desktops']")).isDisplayed();
		if (logo == true) {
			System.out.println("Deskstop Page is Displayed");
		} else {
			System.out.println("Deskstop Page is Not Displayed");
		}
		Select sort = new Select(dp.getSortDropdown());
		sort.selectByVisibleText("Price: Low to High");

		Select display = new Select(dp.getDisplayDropdown());
		display.selectByVisibleText("12");

		Select view = new Select(dp.getViweDropdown());
		view.selectByVisibleText("List");

		dp.getUnder1000text().click();
		dp.getRemoveFilter().click();
		dp.getUnder1000to1200Text().click();
		dp.getRemoveFilter().click();
		dp.getOver1200().click();
		dp.getRemoveFilter().click();
		

		String execeptData = "Add to cart";
		WebElement addButton = dp.getAddToCartButton();
		addButton.click();
		String actualData = addButton.getAttribute("value");
		if (actualData.equals(execeptData)) {
			System.out.println("Successfull add to cart");
		} else {
			System.out.println("Fail add to cart");
		}
	}
}
