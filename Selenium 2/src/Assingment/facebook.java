package Assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com/signup");
        driver.findElement(By.xpath("//option[@value='24']")).click();
        driver.findElement(By.xpath("(//option[@value='6'])[2]")).click();
        driver.findElement(By.xpath("//option[@value='2001']")).click();

	}

}
