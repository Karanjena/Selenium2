package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClassNamelocator {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.instagram.com/");
		//Thread.sleep(4000);
		//driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("Karan@gmail.com");
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		driver.findElement(By.className("email")).sendKeys("Karan@gmail.com");
		
	}

}
