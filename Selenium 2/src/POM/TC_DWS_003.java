package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test; 

public class TC_DWS_003 extends BaseClass{

	
	@Test
	
	public void toBookPage() {
	
		WelComePage wc=new WelComePage(driver);
		wc.getBookLink().click();
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Books']")).isDisplayed();
		if (Logo == true) {
			System.out.println("Open BookPage");
		} else {
			System.out.println("Not Open BookPage");
		}
		
		
		BookPage bp=new BookPage(driver);
		Select sortSelect=new Select(bp.getSortDropdown());
		sortSelect.selectByVisibleText("Price: Low to High");
		
		Select displaySelect = new Select(bp.getDisplayDropdown());
		displaySelect.selectByVisibleText("12");
		
		Select viewSelect = new Select(bp.getViweDropdown());
		viewSelect.selectByVisibleText("List");
		
		bp.getUnder25text().click();
		bp.getRemoveFilter().click();
		bp.getUnder25to50Text().click();
		bp.getRemoveFilter().click();
		bp.getOver50().click();
		bp.getRemoveFilter().click();
		
		
		
		String exceptData = "Add to cart";
		WebElement AddButton=bp.getAddToCartButton();
		AddButton.click();
		String actualData = AddButton.getAttribute("value");
		if (actualData.equals(exceptData)) {
			System.out.println("Successfully AddToProduct");
		}else {
			System.out.println("Fail AddToCart");
		}
				
	}
}
