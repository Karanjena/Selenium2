package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenElement {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/r.php?r=101");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement hiddenele = driver.findElement(By.name("custom_gender"));
		js.executeScript("arguments[0].value='Have anice life'", hiddenele);

	}

}
