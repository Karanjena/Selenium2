package Filpkart;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9337671293");
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
		Scanner sc=new Scanner(System.in);
		int otp=sc.nextInt();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("otp");
	}
}
