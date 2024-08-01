package dropdown_handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TohandlsingleselectDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/r.php");
		
		//dropdown
		WebElement daydropdown = driver.findElement(By.id("day"));
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement yeardropdown = driver.findElement(By.id("year"));
		
		//To Handel dropdown
		Select daySelect=new Select(daydropdown);
		Select monthSelect=new Select(monthdropdown);
		Select yearSelect=new Select(yeardropdown);
		
		//call method
		daySelect.selectByIndex(24);
		monthSelect.selectByValue("8");
		yearSelect.selectByVisibleText("2001");
		
		//to get all the option present in dropdown
		List<WebElement> allmethod = monthSelect.getOptions();
		for (WebElement month : allmethod) {
			System.out.println(month.getText());
			monthSelect.selectByVisibleText(month.getText());//magic line
		}
	}

}
