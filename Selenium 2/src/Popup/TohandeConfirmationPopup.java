package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandeConfirmationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://licindia.in/");
		driver.findElement(By.partialLinkText("Login")).click();
		
		Alert confermationPopup = driver.switchTo().alert();
		System.out.println(confermationPopup.getText());
		//confermationPOpup.accept();
		confermationPopup.dismiss();
	}

}
