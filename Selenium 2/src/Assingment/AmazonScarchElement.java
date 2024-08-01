package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScarchElement {

	public static void main(String[] args) throws InterruptedException {

ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Rcb Jersy");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
