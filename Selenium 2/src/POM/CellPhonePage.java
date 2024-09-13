package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage {

	public CellPhonePage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "products-orderby")
	private WebElement SortByDropdown;
	
	@FindBy(id = "products-pagesize")
	private WebElement DisplayDropdown;
	
	@FindBy(id = "products-viewmode")
	private WebElement ViewDropdown;
	
	@FindBy(xpath = "//a[text()='Smartphone']/../../..//input[@value='Add to cart']")
	private WebElement AddToCartButton;

	public WebElement getSortByDropdown() {
		return SortByDropdown;
	}

	public WebElement getDisplayDropdown() {
		return DisplayDropdown;
	}

	public WebElement getViewDropdown() {
		return ViewDropdown;
	}

	public WebElement getAddToCartButton() {
		return AddToCartButton;
	}

	
}
