package Filpkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Cart")
	private WebElement Cart;

	@FindBy(linkText = "Become a Seller")
	private WebElement BecomeSeller;

	@FindBy(xpath = "//img[@alt='Dropdown with more help links']")
	private WebElement MenuButton;

	@FindBy(xpath = "//span[text()='Top Offer']")
	private WebElement TopOfferLink;

	@FindBy(xpath = "//span[text()='Mobiles & Tablets']")
	private WebElement MobilesAndTabletsLink;

	@FindBy(xpath = "//span[text()='TVs & Appliances']")
	private WebElement TVAndAppliancesLink;

	@FindBy(xpath = "//span[text()='Electronics']")
	private WebElement ElectronicsLink;

	@FindBy(xpath = "//span[text()='Fashion']")
	private WebElement FashionLink;

	@FindBy(xpath = "//span[text()='Beauty']")
	private WebElement BeautyLink;

	@FindBy(xpath = "//span[text()='Home & Kitchen']")
	private WebElement HomeAndKitchenLink;

	@FindBy(xpath = "//span[text()='Furniture']")
	private WebElement FurnitureLink;

	@FindBy(xpath = "//span[text()='Travel']")
	private WebElement TravelLink;

	@FindBy(xpath = "//span[text()='Grocery']")
	private WebElement GroceryLink;

}
