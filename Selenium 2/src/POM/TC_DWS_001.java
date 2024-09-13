package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass{

	@Test
	 public void toRegisterLink() {
		driver.findElement(By.linkText("Log out")).click();

		WelComePage wp=new WelComePage(driver);
		wp.getRegisterLink().click();
		
		RegisterPage rp=new RegisterPage(driver);
		rp.getGenderTextField().click();
		rp.getFirstnameTextField().sendKeys("Karan");
		rp.getLastNameTextField().sendKeys("Jena");
		rp.getEmailTextField().sendKeys("sonujena888@gmail.com");
		rp.getPasswordTextFiled().sendKeys("Karan@123");
		rp.getConfirmPasswordTextField().sendKeys("Karan@123");
		rp.getRegisterButton().click();
	}
}
