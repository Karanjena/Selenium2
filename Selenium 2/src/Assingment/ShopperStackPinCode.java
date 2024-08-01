package Assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStackPinCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://shoppersstack.com/products_page/8");
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("752032");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
