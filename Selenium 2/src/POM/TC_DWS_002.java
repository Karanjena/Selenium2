package POM;
  
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass{

	
	@Test
	
	public void toLoginButton() {
	
		driver.findElement(By.linkText("Log out")).click();
		WelComePage wc=new WelComePage(driver);
		wc.getLoginLink().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys("SeleniumM3@gmail.com");
		lp.getPasswordTextField().sendKeys("Selenium@123");
		lp.getLoginButton().click();
	}

}
