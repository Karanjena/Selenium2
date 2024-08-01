package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BookPage {
	
	public BookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="products-orderby")
	private WebElement sortDropdown;
	
	@FindBy(id = "products-pagesize")
	private WebElement displayDropdown;
	
	@FindBy(id = "products-viewmode")
	private WebElement viweDropdown;
	
	@FindBy(xpath = "(//span[text()='25.00'])[1]")
	private WebElement under25text;
	
	@FindBy(linkText = "Remove Filter")
	private WebElement removeFilter;
	
	@FindBy(xpath = "(//span[text()='50.00'])[1]")
	private WebElement under25to50Text;
	
	@FindBy(xpath = "(//span[text()='50.00'])[2]")
	private WebElement over50;
	
	@FindBy(xpath = "//a[text()='Health Book']/../..//input[@value='Add to cart']")
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

	public WebElement getUnder25text() {
		return under25text;
	}

	public WebElement getRemoveFilter() {
		return removeFilter;
	}

	public WebElement getUnder25to50Text() {
		return under25to50Text;
	}

	public WebElement getOver50() {
		return over50;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	
	

}
