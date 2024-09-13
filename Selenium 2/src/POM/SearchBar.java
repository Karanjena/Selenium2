package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBar {

	public SearchBar(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "small-searchterms")
	private WebElement SearchBar;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement SearchButton;

	public WebElement getSearchBar() {
		return SearchBar;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}
	
	
}
