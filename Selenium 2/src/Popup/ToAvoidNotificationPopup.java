package Popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions setting=new ChromeOptions();
		setting.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.yatra.com/");
	}

}
