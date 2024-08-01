package Assingment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonAddToCart {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).submit();
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("(//span[text()='iPhone 15 (128 GB) - Black'])[1]")).click();
		 
		Set<String> allwindow = driver.getWindowHandles();
		for(String id:allwindow) {
			WebDriver x = driver.switchTo().window(id);  
			if(driver.getTitle().contains(id)) {
				driver.switchTo().window(id);
			}
		}
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
	    File src = new File("./errorssort/amazon1.jpeg");
	    FileHandler.copy(temp, src);	
		
	}

}
