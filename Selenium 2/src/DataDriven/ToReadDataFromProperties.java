package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromProperties {

	public static void main(String[] args) throws IOException {


		//Step:1 create object of fileinputStream
		FileInputStream fis=new FileInputStream("./textData/textData.properties");
		//Step:2 Create Object Of Properties File Type
		Properties prop=new Properties();
		//Call Method
		prop.load(fis);
		
		//Read Data
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		
		
		//Script
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);

	}

}
