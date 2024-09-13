package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitaldownloadsPage {

	public DigitaldownloadsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "products-orderby")
	private WebElement SortByDropdown;
	
	@FindBy(id = "products-pagesize")
	private WebElement DisplayDropdown;
	
	@FindBy(id = "products-viewmode")
	private WebElement ViewAsDropdown;
	
	@FindBy(xpath = "//a[text()='3rd Album']/../../..//input[@value='Add to cart']")
	private WebElement AddToCartButton;

	public WebElement getSortByDropdown() {
		return SortByDropdown;
	}

	public WebElement getDisplayDropdown() {
		return DisplayDropdown;
	}

	public WebElement getViewAsDropdown() {
		return ViewAsDropdown;
	}

	public WebElement getAddToCartButton() {
		return AddToCartButton;
	}
	
	
}
