package Assingment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class woodenStretAddToCart {

	public static void main(String[] args) throws IOException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		//item 1
		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.xpath("//p[text()='Recliners']")).click();
		driver.findElement(By.xpath("(//p[text()='Quick View'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add to Cart')]")).click();
		
		driver.navigate().back();
		//item 2
		driver.findElement(By.partialLinkText("Study & Office")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Gaming Chair')])[3]")).click();
		driver.findElement(By.xpath("(//p[text()='Quick View'])[8]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add to Cart')]")).click();
		
		driver.navigate().back();
		//item 3
    	driver.findElement(By.linkText("WS Value")).click();
		driver.findElement(By.xpath("//a[text()='Adolph Sheesham Wood Bed With Side Storage (Queen Size, Walnut Finish)']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Add to Cart')])[1]")).click();
		
		//display add to cart button
		driver.findElement(By.xpath("(//a[contains(text(),'Cart')])[1]")).click();
		
//    	WebElement prove = driver.findElement(By.xpath("//span[text()='(3)']"));
//		System.out.println(prove.isDisplayed());
		
		//validation
		TakesScreenshot ts=(TakesScreenshot) driver;//type casting
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./errorssort/woodenStreet.jpeg");
		FileHandler.copy(temp, src);
		
		
		driver.quit();

	}

}
