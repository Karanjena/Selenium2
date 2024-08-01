package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ToAvoidFileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=CjwKCAjwyJqzBhBaEiwAWDRJVMVhda2EIzflfjcZbrMoGY0dty_gJB_k6XU1D9HCLcDawqUX6_zNHRoCOrUQAvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		
		
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Karan\\Desktop\\Karan_Resume.pdf");
		
		
		
		
	}

}
