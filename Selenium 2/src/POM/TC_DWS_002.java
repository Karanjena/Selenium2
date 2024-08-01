package POM;
  
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_DWS_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WelComePage wc=new WelComePage(driver);
		wc.getLoginLink().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys("Karan@gmail.com");
		lp.getPasswordTextField().sendKeys("Karan@123");
		lp.getLoginButton().click();
	}

}
