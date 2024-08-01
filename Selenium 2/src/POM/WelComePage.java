package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelComePage {

	
	public WelComePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishlistLink;
	
	@FindBy(xpath = "//input[@value='Search store']")
	private WebElement searchTextField;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(partialLinkText = "Books")
	private WebElement bookLink;
	
	@FindBy(partialLinkText = "Computers")
	private WebElement computerLink;
	
	@FindBy(partialLinkText = "Electronics")
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelLink;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitalLink;
	
	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewelryLink;
	
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftLink;
	
	@FindBy(linkText = "Tricentis")
	private WebElement tricentisLink;
	
	@FindBy(xpath = "//strong[contains(text(),'nopCommerce')]/..//input[@id='pollanswers-1']")
	private WebElement radioButton;
	
	
	

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBookLink() {
		return bookLink;
	}

	public WebElement getComputerLink() {
		return computerLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelLink() {
		return apparelLink;
	}

	public WebElement getDigitalLink() {
		return digitalLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftLink() {
		return giftLink;
	}

	public WebElement getTricentisLink() {
		return tricentisLink;
	}
	
	
	
}
