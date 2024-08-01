package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDeclareExplicitWati {

	public static void main(String[] args) {
		

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//Implicity Wait it will webelement loadding in a web page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.shoppersstack.com/products_page/70");
		driver.findElement(By.id("Check Delivery")).sendKeys("560011");
		//Explicity Wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']")));
		driver.findElement(By.xpath("//button[@id='Check']")).click();
	}

}
