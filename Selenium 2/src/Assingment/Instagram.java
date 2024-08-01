package Assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("Karan@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Karan@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
