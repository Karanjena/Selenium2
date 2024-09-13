package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {

	public ComputerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Desktops")
	private WebElement desktopPage;
	
	@FindBy(partialLinkText = "Notebooks")
	private WebElement NotbooksPage;
	
	@FindBy(partialLinkText = "Accessories")
	private WebElement accessoriesPage;

	public WebElement getDesktopPage() {
		return desktopPage;
	}

	public WebElement getNotbooksPage() {
		return NotbooksPage;
	}

	public WebElement getAccessoriesPage() {
		return accessoriesPage;
	}
	
	
	
	
}
