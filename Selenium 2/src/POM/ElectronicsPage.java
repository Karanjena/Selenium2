package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage{

	public ElectronicsPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(partialLinkText = "Camera, photo")
	private WebElement CameraPage;
	
	@FindBy(partialLinkText = "Cell phones")
	private WebElement CellPhonePage;

	public WebElement getCameraPage() {
		return CameraPage;
	}

	public WebElement getCellPhonePage() {
		return CellPhonePage;
	}
	
	
}
