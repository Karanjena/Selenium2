package Pratices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@role='button']")).click();
		driver.switchTo().frame(1);
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("//span[text()='Sheets']")).click();
	}

}
