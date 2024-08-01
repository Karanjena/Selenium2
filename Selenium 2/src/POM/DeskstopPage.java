package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeskstopPage {

	public DeskstopPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="products-orderby")
	private WebElement sortDropdown;
	
	@FindBy(id = "products-pagesize")
	private WebElement displayDropdown;
	
	@FindBy(id = "products-viewmode")
	private WebElement viweDropdown;
	
	@FindBy(xpath = "(//span[text()='1000.00'])[1]")
	private WebElement under1000text;
	
	@FindBy(linkText = "Remove Filter")
	private WebElement removeFilter;
	
	@FindBy(xpath = "(//span[text()='1200.00'])[1]")
	private WebElement under1000to1200Text;
	
	@FindBy(xpath = "(//span[text()='1200.00'])[2]")
	private WebElement over1200;
	
	@FindBy(xpath = "//a[text()='Build your own computer']/../..//input[@value='Add to cart']")
	private WebElement addToCartButton;

	public WebElement getSortDropdown() {
		return sortDropdown;
	}

	public WebElement getDisplayDropdown() {
		return displayDropdown;
	}

	public WebElement getViweDropdown() {
		return viweDropdown;
	}

	public WebElement getUnder1000text() {
		return under1000text;
	}

	public WebElement getRemoveFilter() {
		return removeFilter;
	}

	public WebElement getUnder1000to1200Text() {
		return under1000to1200Text;
	}

	public WebElement getOver1200() {
		return over1200;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	

}
