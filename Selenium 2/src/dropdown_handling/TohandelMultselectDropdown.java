package dropdown_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TohandelMultselectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/");
		
		
		WebElement multiselect = driver.findElement(By.id("cars"));
		//To handel listbox
		Select multi=new Select(multiselect);
		//To select
		multi.selectByIndex(0);
		multi.selectByValue("99");
		Thread.sleep(2000);
		
		//deselect
		
		multi.deselectByIndex(0);
		multi.deselectByValue("99");
		
		

	}

}
