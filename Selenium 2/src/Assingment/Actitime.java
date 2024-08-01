package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(2000);
		
		driver.findElement(By.id("FirstName")).sendKeys("Karan");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("jena");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("karan@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Company")).sendKeys("qspider");
	}
}
