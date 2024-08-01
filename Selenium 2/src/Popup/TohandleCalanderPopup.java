package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TohandleCalanderPopup {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.agoda.com/");
		driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		driver.findElement(By.xpath("//div[@id='check-in-box']"));
	

		
		for(;;) {
			try{
				driver.findElement(By.xpath("//div[text()='December 2024']/..//span[text()='13']")).click();
				break;
			}catch (Exception e) {
				
			driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}

	}

}
