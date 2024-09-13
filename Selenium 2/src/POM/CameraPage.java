package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CameraPage{
	
	public CameraPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "products-orderby")
	private WebElement SortByDropdown;
	
	@FindBy(id = "products-pagesize")
	private WebElement DisplayDropdown;
	
	@FindBy(id = "products-viewmode")
	private WebElement ViewAsDropdown;
	
	@FindBy(xpath = "(//span[text()='500.00'])[1]")
	private WebElement UnderPrice;
	
	@FindBy(xpath = "(//span[text()='500.00'])[2]")
	private WebElement OverPrice;
	
	@FindBy(xpath = "//a[text()='Remove Filter']")
	private WebElement RemoveFilter;
	
	@FindBy(linkText = "1MP 60GB Hard Drive Handycam Camcorder")
	private WebElement ProductDetails;
	
	@FindBy(xpath = "//h1[contains(text(),'1MP 60GB Hard Drive Handycam Camcorder')]/../../..//input[@value='Add to compare list']")
     private WebElement AddtoCompareList;

	public WebElement getSortByDropdown() {
		return SortByDropdown;
	}

	public WebElement getDisplayDropdown() {
		return DisplayDropdown;
	}

	public WebElement getViewAsDropdown() {
		return ViewAsDropdown;
	}

	public WebElement getUnderPrice() {
		return UnderPrice;
	}

	public WebElement getOverPrice() {
		return OverPrice;
	}

	public WebElement getRemoveFilter() {
		return RemoveFilter;
	}

	public WebElement getProductDetails() {
		return ProductDetails;
	}

	public WebElement getAddtoCompareList() {
		return AddtoCompareList;
	}
	
	
	
	

}
