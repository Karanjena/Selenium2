package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 

public class TC_DWS_003 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WelComePage wc=new WelComePage(driver);
		wc.getBookLink().click();
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Books']")).isDisplayed();
		if (Logo == true) {
			System.out.println("Open BookPage");
		} else {
			System.out.println("Not Open BookPage");
		}
		
		
		BookPage b=new BookPage(driver);
		Select sortSelect=new Select(b.getSortDropdown());
		sortSelect.selectByVisibleText("Price: Low to High");
		
		Select displaySelect = new Select(b.getDisplayDropdown());
		displaySelect.selectByVisibleText("12");
		
		Select viewSelect = new Select(b.getViweDropdown());
		viewSelect.selectByVisibleText("List");
		
		b.getUnder25text().click();
		b.getRemoveFilter().click();
		b.getUnder25to50Text().click();
		b.getRemoveFilter().click();
		b.getOver50().click();
		b.getRemoveFilter().click();
		b.getUnder25text().click();
		
		
		String exceptData = "Add to cart";
		WebElement x=b.getAddToCartButton();
		x.click();
		String actualData = x.getAttribute("value");
		if (actualData.equals(exceptData)) {
			System.out.println("Successfully AddToProduct");
		}else {
			System.out.println("Fail AddToCart");
		}
	
		System.out.println("Successfully Close The Browser");
		driver.quit();
				
	}
}
