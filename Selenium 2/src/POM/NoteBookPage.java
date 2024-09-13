package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoteBookPage {

	public NoteBookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "products-orderby")
	private WebElement sortDropdown;

	@FindBy(id = "products-pagesize")
	private WebElement displayDropdown;

	@FindBy(id = "products-viewmode")
	private WebElement viweDropdown;

	@FindBy(linkText = "Intel")
	private WebElement cpuTypeLink;

	@FindBy(linkText = "3 GB")
	private WebElement memoryLink;

	@FindBy(linkText = "Remove Filter")
	private WebElement removeFilterLink;

	@FindBy(xpath = "//a[text()='14.1-inch Laptop']/../../..//input[@value='Add to cart']")
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

	public WebElement getCpuTypeLink() {
		return cpuTypeLink;
	}

	public WebElement getMemoryLink() {
		return memoryLink;
	}

	public WebElement getRemoveFilterLink() {
		return removeFilterLink;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

}
