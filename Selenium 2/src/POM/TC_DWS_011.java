package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_011 extends BaseClass{

	@Test
	
	public void toJewelryPage() {
		WelComePage wp=new WelComePage(driver);
		wp.getJewelryLink().click();
		
		JewelryPage jp=new JewelryPage(driver);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Jewelry']")).isDisplayed();
		if(Logo==true) {
			Reporter.log("Successfilly Open JewelryPage",true);
		}else {
			Reporter.log("Fail Open JewelryPage",true);
		}
		
		Select sort=new Select(jp.getSortBtDropdown());
		sort.selectByVisibleText("Price: Low to High");
		
		Select display=new Select(jp.getDisplayDropdown());
		display.selectByVisibleText("12");
		
		Select view=new Select(jp.getViewAsDropdown());
		view.selectByVisibleText("List");
		
		jp.getUnder500().click();
		jp.getRemoveFilter().click();
		jp.getPrice500to700().click();
		jp.getRemoveFilter().click();
		jp.getOver3000().click();
		jp.getRemoveFilter().click();
		
		String ExpectedData="Add to cart";
		WebElement addButton = jp.getAddToCardButton();
		addButton.click();
		String ActualData = addButton.getAttribute("value");
		if(ActualData.equals(ExpectedData)) {
			Reporter.log("Product Successfully AddToCart",true);
		}else {
			Reporter.log("Product FAil AddToCart",true);
		}
	}
}
