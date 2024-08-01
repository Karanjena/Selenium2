package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.dream11.com/");

		//To Switch using index
		 //driver.switchTo().frame(0);
		
		
		 // To Switch using name or id
		 //driver.switchTo().frame("send-sms-iframe");
		
		
		 //To switch using WebElement
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("regEmail")).sendKeys("9337671293");
		Thread.sleep(2000);
		//To switch using back                                            
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("About Us")).click();
	

	}

}
