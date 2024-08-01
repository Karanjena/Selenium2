package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDemoWebShop {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("Karan");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("Jena");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("karanjena124@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Karan@123");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Karan@123");
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
