package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_DWS_005 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/");
		
		WelComePage wc = new WelComePage(driver);
		wc.getComputerLink().click();
		
		ComputerPage cp=new ComputerPage(driver);
		cp.getNotbooksPage().click();

		NoteBookPage np = new NoteBookPage(driver);
		boolean logo = driver.findElement(By.xpath("//h1[text()='Notebooks']")).isDisplayed();
		if (logo == true) {
			System.out.println("Notebooks Page is Displayed");
		} else {
			System.out.println("Notebooks Page is Not Displayed");
		}
		Select sort = new Select(np.getSortDropdown());
		sort.selectByVisibleText("Price: Low to High");

		Select display = new Select(np.getDisplayDropdown());
		display.selectByVisibleText("12");

		Select view = new Select(np.getViweDropdown());
		view.selectByVisibleText("List");

		np.getCpuTypeLink().click();
		np.getRemoveFilterLink().click();
		np.getMemoryLink().click();
		np.getRemoveFilterLink().click();
		np.getCpuTypeLink().click();

		String execeptData = "Add to cart";
		WebElement addButton = np.getAddToCartButton();
		addButton.sendKeys(Keys.ENTER);
		String actualData = addButton.getAttribute("value");
		if (actualData.equals(execeptData)) {
			System.out.println("Successfull add to cart");
		} else {
			System.out.println("Fail add to cart");
		}

		System.out.println("Successfully Close The Browser");
		driver.quit();

	}
}
