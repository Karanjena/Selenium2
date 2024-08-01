package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_DWS_001 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WelComePage wp=new WelComePage(driver);
		wp.getRegisterLink().click();
		
		RegisterPage rp=new RegisterPage(driver);
		rp.getGenderTextField().click();
		rp.getFirstnameTextField().sendKeys("Karan");
		rp.getLastNameTextField().sendKeys("Jena");
		rp.getEmailTextField().sendKeys("sonujena@gmail.com");
		rp.getPasswordTextFiled().sendKeys("Karan@123");
		rp.getConfirmPasswordTextField().sendKeys("Karan@123");
		rp.getRegisterButton().click();
	}
}
