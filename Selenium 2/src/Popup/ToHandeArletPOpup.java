package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandeArletPOpup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//to using frame
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//to hande alert popup
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();//click on the OK Button
	}

}
