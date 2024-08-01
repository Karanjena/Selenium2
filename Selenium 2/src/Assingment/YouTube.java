package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("welcome home");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Billie Eilish, Khalid - lovely (Official Music Video)']")).click();
		
	}

}
