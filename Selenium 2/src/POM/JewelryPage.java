package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {

	public JewelryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "products-orderby")
	private WebElement SortBtDropdown;
	
	@FindBy(id = "products-pagesize")
	private WebElement DisplayDropdown;
	
	@FindBy(id = "products-viewmode")
	private WebElement ViewAsDropdown;
	
	@FindBy(xpath = "//span[text()='0.00']")
	private WebElement Under500;
	
	@FindBy(xpath = "(//span[text()='500.00'])[2]")
	private WebElement Price500to700;
	
	@FindBy(xpath = "//span[text()='3000.00']")
	private WebElement Over3000;
	
	@FindBy(linkText = "Remove Filter")
	private WebElement RemoveFilter;
	
	@FindBy(xpath = "//a[text()='Black & White Diamond Heart']/../../..//input[@value='Add to cart']")
	private WebElement AddToCardButton;

	public WebElement getSortBtDropdown() {
		return SortBtDropdown;
	}

	public WebElement getDisplayDropdown() {
		return DisplayDropdown;
	}

	public WebElement getViewAsDropdown() {
		return ViewAsDropdown;
	}

	public WebElement getUnder500() {
		return Under500;
	}

	public WebElement getPrice500to700() {
		return Price500to700;
	}

	public WebElement getOver3000() {
		return Over3000;
	}

	public WebElement getRemoveFilter() {
		return RemoveFilter;
	}

	public WebElement getAddToCardButton() {
		return AddToCardButton;
	}
	
	
}
