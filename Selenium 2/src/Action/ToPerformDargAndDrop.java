package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDargAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		//To identify the image
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
		
		//To identify the Trash
		WebElement Trash = driver.findElement(By.id("trash"));
		
		//To identify the Gallary
		WebElement gallery = driver.findElement(By.id("gallery"));
		
		
		//To Perform The Action Class
		Actions action=new Actions(driver);
		//To drag to image to trach
		action.dragAndDrop(image1, Trash).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image2, Trash).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image3, Trash).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, Trash).perform();
		Thread.sleep(3000);
		
		//to drag to image to gallery
		action.dragAndDrop(image1, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image2, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image3, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, gallery).perform();
		
		
		
		
		
		
	}

}
