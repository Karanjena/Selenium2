package AdvanceSelenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	String execeptedHomePageTitle = "Demo Web Shop";
	
	

	@Parameters("browserName")
	@BeforeClass
	public void tolunch(String bName) {
		if(bName.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}else if(bName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else if(bName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		Reporter.log("Browser got Lunch Successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got Maximize", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		String actualHomePageTitle = driver.getTitle();
		if (actualHomePageTitle.equals(execeptedHomePageTitle)) {
			Reporter.log("Successfully Home Page Got Display", true);
		} else {
			Reporter.log("Fail Home Page Got Display", true);
		}
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("SeleniumM3@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@AfterMethod
	public void tologout() {
		Reporter.log("Logged out Successfully", true);
		driver.findElement(By.linkText("Log out")).click();
	}

	@AfterClass
	public void toclose() {
		Reporter.log("Browser successfully Closed", true);
		driver.quit();
	}

}

//(@Optional("chrome")